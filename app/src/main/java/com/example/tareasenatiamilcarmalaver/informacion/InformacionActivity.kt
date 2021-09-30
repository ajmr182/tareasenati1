package com.example.tareasenatiamilcarmalaver.informacion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tareasenatiamilcarmalaver.R

class InformacionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_informacion)

        supportActionBar?.hide()
    }
}