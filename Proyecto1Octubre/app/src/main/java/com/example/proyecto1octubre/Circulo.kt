package com.example.proyecto1octubre

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.lang.Math.pow
import kotlin.math.PI
import kotlin.math.pow
import kotlin.time.times

class Circulo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_circulo)

        val bundle:Bundle?=intent.extras
        val radioRecogido:Double =bundle!!.getDouble("Circulo")

        val area: Double? = PI * pow(radioRecogido, 2.0)

    }
}