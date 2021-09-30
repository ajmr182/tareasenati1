package com.example.tareasenatiamilcarmalaver

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.tareasenatiamilcarmalaver.menu.MenuActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        Handler().postDelayed({

            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
        }, 2000)
    }
}