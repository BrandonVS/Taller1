package com.example.taller1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        validarEdad()
        multiplicar()
        ordenar()
        llamarVehiculo()
        validarCedula()
    }

    private fun validarEdad(){

        val edad = 25
        println("\n\nPunto N1:")
        if ( edad >= 18 ){
            println("La persona es mayor de edad.")
        } else {
            println("La persona es menor de edad")
        }

    }

    private fun multiplicar(){

        val n = 5
        val limite = 20
        val resultados = arrayListOf<Int>()
        println("\n\nPunto N2:")
        for ( i in 0..limite ) {
            val resultado = n * i
            resultados.add(resultado)
        }

        println("Resultados ascendentes: " + resultados)
        resultados.sortDescending()
        println("Resultados descendentes: " + resultados)
    }

    private fun ordenar(){

        val estudiantes = arrayListOf<String>("JOAN MANUEL BRICEÑO QUILAMBAQUI",
            "JEFERSON EDUARDO CUEVA REATIGUI", "JORDY DAVID ESPARZA RIVERA", "RICARDO ISRAEL " +
                    "REIRE CARRION", "SANTIAGO DAVID GARCIA JAEN", "EDGAR FABIÁN GUAMO MOROCHO",
                    "ERICK GONZALO JARAMILLO SOTO", "DANIEL MARCELO MEDINA OJEDA", "IAN CARLOS " +
                    "ORTEGA LEON", "DAVID ANDRES PILLCO YARUQUI", "LUIS FERNANDO QUIZHPE ESPINOSA",
                    "SHOMIRA NATALY ROSALES ALBERCA", "FRANK JOEL SACA QUIZHPE", "DAVID ALEXANDER" +
                    " SALAZAR SOLORZANO", "ISRAEL ANDRES TAPIA MORALES", "ANDRES ALEJANDRO " +
                    "VALLEJO ZUÑIGA")
        println("\n\nPunto N3:")
        estudiantes.sort()
        println("Resultados ascendentes: " + estudiantes)
    }

    private fun llamarVehiculo(){
        val placa = "LLA587"
        val color = "Rojo"
        val traccion = "4x4"
        val motor = "Toyota"
        val tipo = "BMW"
        val capacidad = 400

        println("\n\nPunto N4:")
        val vehiculo = Vehiculo()
        vehiculo.Vehiculo(placa, color, traccion, motor, tipo, capacidad)
        vehiculo.obtenerVehiculo()
    }

    private fun validarCedula(){
        val cedula = arrayListOf<Int>(1,1,0,4,6,4,8,4,9,6)
        var suma = 0
        var n: Int
        val ultimo  = cedula.last()
        for (i in cedula.indices){
            n = cedula[i]
            if (i % 2 == 0){
                n = cedula[i]*2
                if (n > 9){
                    n -= 9
                }
                suma += n
            }else{
                suma += n
            }

        }
        suma -= ultimo
        val primerDigito = suma.toString().substring(0,1)
        val decenaInmediata = (primerDigito.toInt() + 1) * 10
        println("\n\nTaller de validacion de cedula:")
        if (decenaInmediata - suma == ultimo || decenaInmediata - suma == 10){
            println("La cedula ingresada es valida.")
        }else{
            println("La cedula ingresada no es valida.")
        }
    }
}