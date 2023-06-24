package com.example.myfirstactivity

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast


class MyFirstActivity : Activity () {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_my_first) //sirve para enlazar el primer layout con la clase
    }

    override fun onResume() {
        super.onResume()

        //todo mandar mensaje
        //Toast.makeText(this, "Hola", Toast.LENGTH_LONG).show()
        /*
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse("https://www.google.com")                   //INSTRUCCION PARA ABRIR ENLACE EN NAVEGADOR
        startActivity(intent)*/

        val intent = Intent(this, MySecondActivity::class.java)
        startActivity(intent)
    }
}