package com.example.suma

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val edtN1 = findViewById<EditText>(R.id.edtN1)
        val edtN2 = findViewById<EditText>(R.id.edtN2)
        val botonCalclular = findViewById<Button>(R.id.botonCalcular)
        val botonResta = findViewById<Button>(R.id.botonCalcular)
        val textResultado = findViewById<TextView>(R.id.textResultado)

        botonCalclular.setOnClickListener{
            val n1 = edtN1.text.toString().toInt()
            val n2 = edtN2.text.toString().toInt()
            val res = n1 + n2
            textResultado.text = "Resultado: ${res.toString()}"
        }
        botonResta.setOnClickListener{
            val n1 = edtN1.text.toString().toInt()
            val n2 = edtN2.text.toString().toInt()
            val res = n1 - n2
            textResultado.text = "Resultado: ${res.toString()}"
        }
    }
}