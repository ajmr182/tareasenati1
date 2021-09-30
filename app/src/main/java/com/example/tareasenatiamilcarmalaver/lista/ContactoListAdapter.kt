package com.example.tareasenatiamilcarmalaver.lista


import android.app.Activity
import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import androidx.core.app.ActivityCompat
import com.example.tareasenatiamilcarmalaver.R
import com.example.tareasenatiamilcarmalaver.llamadas.PHONE_REQUEST


class ContactoListAdapter(private val context: Context, private val contactList: MutableList<Contacto>) :
    BaseAdapter() {

    private lateinit var tvContacto: TextView

    override fun getCount() =  contactList.size

    override fun getItem(p0: Int) = p0

    override fun getItemId(p0: Int)=p0.toLong()


    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {

        var converterView = p1
        converterView = LayoutInflater.from(context).inflate(R.layout.item_contact_view, p2, false)
        tvContacto = converterView.findViewById(R.id.tvContacto)
        tvContacto.text = contactList[p0].nombre
        val dialog = AlertDialog.Builder(context)
        dialog.setTitle("Estas seguro que deseas llamar a ")
        dialog.setMessage("${contactList[p0].nombre}\ntlf: ${contactList[p0].tlf}")
        dialog.setPositiveButton("Llamar") { d, i ->
            val permiso: Int = ActivityCompat.checkSelfPermission(
                context,
                android.Manifest.permission.CALL_PHONE
            )
            if (permiso == PackageManager.PERMISSION_GRANTED) {

                val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:${contactList[p0].tlf}"))
                context.startActivity(intent)
            } else {

                ActivityCompat.requestPermissions(
                    context as Activity,
                    arrayOf(android.Manifest.permission.CALL_PHONE), PHONE_REQUEST
                )
            }
        }
        dialog.setNegativeButton("Cancelar", null)
        converterView.setOnClickListener {

            dialog.create().show()
        }
        return converterView
    }
}