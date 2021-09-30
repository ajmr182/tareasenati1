package com.example.tareasenatiamilcarmalaver.lista

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.tareasenatiamilcarmalaver.R

class ListaActivity : AppCompatActivity() {

    private lateinit var listaContacto: ListView
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista)
        supportActionBar?.hide()

        listaContacto = findViewById(R.id.listaContacto)

        var contactList = mutableListOf<Contacto>(
            Contacto("Amilcar Jose", "981121807"),
            Contacto("Cesar Augusto", "978521469"),
            Contacto("Juan Perez", "988512634"),
            Contacto("Emilia Rojas", "986325471"),
            Contacto("Angel Fabian", "963214578"),
            Contacto("Amilcar Jose", "981121807"),
            Contacto("Cesar Augusto", "978521469"),
            Contacto("Juan Perez", "988512634"),
            Contacto("Emilia Rojas", "986325471"),
            Contacto("Angel Fabian", "963214578"),
            Contacto("Amilcar Jose", "981121807"),
            Contacto("Cesar Augusto", "978521469"),
            Contacto("Juan Perez", "988512634"),
            Contacto("Emilia Rojas", "986325471"),
            Contacto("Angel Fabian", "963214578")
        )
        listaContacto.adapter=ContactoListAdapter(this,contactList)
    }
}