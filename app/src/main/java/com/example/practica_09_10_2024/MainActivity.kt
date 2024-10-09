package com.example.practica_09_10_2024

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var boton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        boton = findViewById(R.id.activity_main_maps)

        boton.setOnClickListener { onClick() }
    }

    private fun onClick() {
        val intent = Intent(this, MapsActivity::class.java)
        startActivity(intent)
    }
}