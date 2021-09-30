package com.example.tareasenatiamilcarmalaver.llamadas

import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.app.ActivityCompat
import com.example.tareasenatiamilcarmalaver.R

const val PHONE_REQUEST=123

class LlamadasActivity : AppCompatActivity() {

    private lateinit var btnCall: Button
    private lateinit var etCall: TextView

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_llamadas)
        supportActionBar?.hide()

        btnCall = findViewById(R.id.BtnCall)
        etCall = findViewById(R.id.ETCall)
        initListeners()
    }

    private fun initListeners() {

        btnCall.setOnClickListener {
            val permiso: Int = ActivityCompat.checkSelfPermission(
                this,
                android.Manifest.permission.CALL_PHONE
            )
            if (permiso == PackageManager.PERMISSION_GRANTED) {

                val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:${etCall.text}"))
                startActivity(intent)
            } else {

                ActivityCompat.requestPermissions(
                    this,
                    arrayOf(android.Manifest.permission.CALL_PHONE), PHONE_REQUEST
                )
            }
        }
    }
}