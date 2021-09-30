package com.example.tareasenatiamilcarmalaver.buscador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.widget.Button
import android.widget.TextView
import com.example.tareasenatiamilcarmalaver.R

class BuscadorActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var wvBuscador : WebView
    private lateinit var tvBuscador: TextView
    private lateinit var btnIr:Button

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buscador)
        supportActionBar?.hide()

        //Asociando Variables a Views
        wvBuscador = findViewById(R.id.WVBuscador)
        tvBuscador = findViewById(R.id.TVBuscador)
        btnIr=findViewById(R.id.BtnIr)
        btnIr.setOnClickListener(this)
       }

    override fun onClick(p0: View?) {

        val busqueda:String=tvBuscador.text.toString()
        val url = "https://www.google.com/search?q=$busqueda"
        wvBuscador.loadUrl(url)
        wvBuscador.settings.javaScriptEnabled=true
        wvBuscador.settings.setSupportZoom(true)
    }
}