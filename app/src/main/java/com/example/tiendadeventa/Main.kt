package com.example.venta

fun main(){
    //Clientes
    var jose=Domicilio(1354,"Jujuy",1145)

    val josePersona=Persona(34985755,"jose","Sun",jose)
    println(josePersona)

    val joseCliente=Cliente(2344,true,
        josePersona.dni,josePersona.nombre,josePersona.apellido,jose)
    joseCliente.Ventas()
    joseCliente.Compras()

    Facturacion().PrecioFinal(5,4500.00)

    val lucas=Domicilio(453,"San Juan",2542)

    val lucasPersona=Persona(28747566,"Lucas","Martinez",lucas)
    println(lucasPersona)

    val lucasCliente=Cliente(3455,false,
        lucasPersona.dni,lucasPersona.nombre,lucasPersona.apellido,lucas)
    lucasCliente.Ventas()
    lucasCliente.Compras()

    Facturacion().PrecioFinal(6,350.00,21)

    var franco=Domicilio(2456,"Mitre",1344)
    val francoPersona=Persona(40567895,"Franco","Fernadez",franco)
    println(francoPersona)

    val francoCliente=Cliente(3364,true,
        francoPersona.dni,francoPersona.nombre,francoPersona.apellido,franco)
    francoCliente.Ventas()
    francoCliente.Compras()

    Facturacion().PrecioFinal(2,1500.75,21,500.00)

    //Vendedor

    var sergio=Domicilio(1900,"Santa Fe",1145)
    var sergioTurno=Turno("6 a 13","Mañana")

    val sergioPersona=Persona(28576434,"Sergio","Raul",sergio)
    println(sergioPersona)

    val sergioVendedor=Vendedor(4783,arrayListOf <Cliente>(joseCliente,lucasCliente,francoCliente)
        ,sergioPersona.dni,sergioPersona.nombre,sergioPersona.apellido,sergio,sergioTurno)
    sergioVendedor.Ventas()
    sergioVendedor.Compras()

}