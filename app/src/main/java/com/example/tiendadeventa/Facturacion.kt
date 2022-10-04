package com.example.venta

class Facturacion{
    var id: Int=0
    var cantidad: Int=0
    var precio: Double=0.0
    var iva: Int=0
    var tiketDePromocion: Double=0.0
    var totalconIva: Double=0.0
    var totalPagado: Double=0.0



    fun PrecioFinal(cantidad:Int,precio:Double,iva:Int):Double{

        this.totalconIva=(precio*iva/100)
        this.totalPagado=cantidad*(precio+totalconIva)
        println("La Factura realisada es de $ ${this.totalPagado}")
        return totalPagado
    }
    fun PrecioFinal(cantidad: Int,precio: Double):Double{
        this.totalPagado=(cantidad*precio)
        println("La Factura Para el no IVA es de $ ${this.totalPagado}")
        return totalPagado
    }
    fun PrecioFinal(cantidad: Int,precio: Double,iva: Int,tiketDePromocion: Double):Double{
        this.totalconIva=(precio*iva/100)
        this.totalPagado=(cantidad*(precio+totalconIva)-tiketDePromocion)
        println("La Factura realisada es de $ ${this.totalPagado}")
        return totalPagado
    }




}