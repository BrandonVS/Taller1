package com.example.taller1

class Vehiculo {
    var placa: String = ""
    var color: String = ""
    var traccion: String = ""
    var motor: String = ""
    var tipo: String = ""
    var capacidad: Int = 0

    fun Vehiculo(placa: String, color: String, traccion: String, motor: String, tipo: String,
                 capacidad: Int) {
        this.placa = placa
        this.color = color
        this.traccion = traccion
        this.motor = motor
        this.tipo = tipo
        this.capacidad = capacidad
    }

    fun obtenerVehiculo(){
        println("Vehiculo:\nPlaca: "+placa+"\nColor: "+color+"\nTraccion: "+traccion+"\nMotor: "
        +motor+"\nTipo: "+tipo+"\nCapacidad: "+capacidad)
    }
}