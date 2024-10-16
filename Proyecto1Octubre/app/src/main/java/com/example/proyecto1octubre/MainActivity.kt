package com.example.proyecto1octubre

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val calcularCirculo = findViewById<Button>(R.id.botonCalcularCirculo)
        val calcularTriangulo = findViewById<Button>(R.id.botonCalcularTriangulo)
        val calcularCuadrado = findViewById<Button>(R.id.botonCalcularCuadrado)

        val radioCirculo = findViewById<EditText>(R.id.textoRadio)
        val baseTriangulo = findViewById<EditText>(R.id.textoBase)
        val alturaTriangulo = findViewById<EditText>(R.id.textoAltura)
        val ladoCuadrado = findViewById<EditText>(R.id.textoLado)

        calcularCirculo.setOnClickListener{
            val mensajeRadioCirculo:Double = radioCirculo.text.toString().toDouble()
            val intent = Intent(this,Circulo::class.java)
            intent.putExtra("Circulo",mensajeRadioCirculo)
            startActivity(intent)
        }
        calcularTriangulo.setOnClickListener{
            val mensajeAlturaTriangulo:String = alturaTriangulo.text.toString()
            val mensajeBaseTriangulo:String = baseTriangulo.text.toString()
            val intent = Intent(this,Triangulo::class.java)
            startActivity(intent)

        }
        calcularCuadrado.setOnClickListener{
            val mensajeLadoCuadrado:String = ladoCuadrado.text.toString()
            val intent = Intent(this,Cuadrado::class.java)
            startActivity(intent)
        }
    }
}