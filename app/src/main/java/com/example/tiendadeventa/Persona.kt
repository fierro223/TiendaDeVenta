package com.example.venta

open class Persona {
    var dni: Int=0
    var nombre: String=""
    var apellido: String=""
    var domicilio=Domicilio(altura=0, direcion = "", codigoPostal = 0)

    constructor(dni:Int,nombre:String,apellido:String,domicilio:Domicilio){
        this.dni=dni
        this.nombre=nombre
        this.apellido=apellido
        this.domicilio=domicilio
    }
    open fun Ventas(){
        println("La Persona: ${this.nombre} resive la plata")

    }
    open fun Compras(){
        println("La Persona: ${this.nombre} recive la factura")

    }

    override fun toString(): String {
        return "La Persona con el Dni: ${this.dni} y con el Nombre: ${this.nombre} " +
                "con el apellido: ${this.apellido} con el Domicilio: ${this.domicilio}"
    }
}