package com.example.tareasenatiamilcarmalaver.menu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import com.example.tareasenatiamilcarmalaver.R
import com.example.tareasenatiamilcarmalaver.buscador.BuscadorActivity
import com.example.tareasenatiamilcarmalaver.informacion.InformacionActivity
import com.example.tareasenatiamilcarmalaver.lista.ListaActivity
import com.example.tareasenatiamilcarmalaver.llamadas.LlamadasActivity

class MenuActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnA: ImageButton
    private lateinit var btnB: ImageButton
    private lateinit var btnC: ImageButton
    private lateinit var btnD: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        supportActionBar?.hide()

        btnA = findViewById(R.id.BtnA)
        btnB = findViewById(R.id.BtnB)
        btnC = findViewById(R.id.BtnC)
        btnD = findViewById(R.id.BtnD)

        btnA.setOnClickListener(this)
        btnB.setOnClickListener(this)
        btnC.setOnClickListener(this)
        btnD.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        val intent: Intent =
            when (p0?.id) {

                R.id.BtnA -> Intent(this, ListaActivity::class.java)

                R.id.BtnB -> Intent(this, LlamadasActivity::class.java)

                R.id.BtnC -> Intent(this, BuscadorActivity::class.java)

                R.id.BtnD -> Intent(this, InformacionActivity::class.java)

                else -> Intent()
            }
        startActivity(intent)
    }
}