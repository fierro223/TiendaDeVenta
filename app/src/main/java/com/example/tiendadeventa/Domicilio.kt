package com.example.venta

class Domicilio {
    var altura:Int=0
    var direcion:String=""
    var codigoPostal:Int=0


    constructor(altura:Int,direcion:String,codigoPostal:Int){
        this.altura=altura
        this.direcion=direcion
        this.codigoPostal=codigoPostal
    }

    override fun toString(): String {
        return "La Altura: ${this.altura}, la Direcion: ${this.direcion}, " +
                "con el Codigo Postal: ${this.codigoPostal}"
    }
}