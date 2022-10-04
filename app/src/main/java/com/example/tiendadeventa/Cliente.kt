package com.example.venta

class Cliente():Persona(dni = 0, nombre = "", apellido = "",
    domicilio = Domicilio(altura = 0, direcion = "", codigoPostal = 0))  {

    var id:Int=0
    var pago:Boolean=true


    constructor(id:Int, pago:Boolean,
                dni:Int,nombre:String,apellido:String, domicilio: Domicilio):this(){
        this.id=id
        this.pago=pago
        this.dni=dni
        this.nombre=nombre
        this.apellido=apellido
        this.domicilio=domicilio
    }

    override fun Ventas(){
        if (pago==true){
            println("El vendedor me da El pedido")
        }else{
            println("El vendedor me pregunta si deseo otra cosa")
        }

    }
    override fun Compras(){
        if (pago==true) {
            println("El Comprador: ${this.nombre} recibe la factura")
        }else{
            println("Quiero adquirir otro producto")
        }

    }


}