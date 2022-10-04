package com.example.venta

class Vendedor():Persona(dni=0, nombre="" , apellido = "",
    domicilio = Domicilio(altura = 0, direcion = "", codigoPostal = 0)) {

    var id:Int=0
    var listaClientes=ArrayList<Cliente>()
    var turno=Turno(horario = "", turnoRotativo = "")

    constructor(id:Int, listaClientes: ArrayList<Cliente>,
                dni:Int,nombre:String,apellido:String,domicilio: Domicilio,
                turno:Turno ):this(){
        this.id=id
        this.listaClientes=listaClientes
        this.dni=dni
        this.nombre=nombre
        this.apellido=apellido
        this.domicilio=domicilio
        this.turno=turno

    }


    override fun Ventas(){
        println("El Vendedor:${this.nombre} recibe la plata")

    }
    override fun Compras(){
        println("El Clinte recivio el articulo")

    }

}