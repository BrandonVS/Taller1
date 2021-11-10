package com.example.taller1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // Punto N1: Validacion de edad
    private fun edad(){

        var edad = 25

        if ( edad >= 18 ){
            println("La persona es mayor de edad.")
        } else {
            println("La persona es menor de edad")
        }

    }
/*
    // Punto N2: Tabla de multiplicar
    private fun multiplicar(){

        var n = 5
        var limite = 20
        var resultados = arrayListOf<Int>()

        for ( i in 0..limite ) {
            var resultado = n * i
            resultados.add(resultado)
        }

        println("Resultados ascendentes: " + resultados)
        resultados.sortDescending()
        println("Resultados descendentes: " + resultados)
    }*/
}