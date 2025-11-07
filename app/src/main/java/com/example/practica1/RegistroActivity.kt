package com.example.practica1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RegistroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_registro)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }



        val boton=findViewById<Button>(R.id.webbutton)
        val carlos=findViewById<Button>(R.id.carlos)
        val maria=findViewById<Button>(R.id.maria)
        boton.setOnClickListener {
            val url="https://github.com/Peluas9000/Kotlin_Zenobia"
            val intent= Intent(Intent.ACTION_VIEW, Uri.parse(url))
        }

        carlos.setOnClickListener {
            val intentoCarlos=Intent(this, SaludoActivity::class.java)
            intentoCarlos.putExtra(Intent.EXTRA_TEXT,"CARLOS")
            startActivity(intentoCarlos)
        }
        maria.setOnClickListener {
            val intentoMaria= Intent(this, SaludoActivity::class.java)
            intentoMaria.putExtra(Intent.EXTRA_TEXT,"MARIA")
            startActivity(intentoMaria)
        }





    }




}