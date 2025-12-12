package com.spinandgg.app.ui.modelos

data class Apuesta(
    val id: Int,
    var dineroApuesta: Double,
    var estado: EstadoApuesta,
    val categoria: String,
    val team1: String,
    val team2: String ,
    val apostadoresAFavor: Int,
    val apostadoresEnContra: Int
){
/**
    fun puedeApostar(saldoUsuario: Double): Boolean {
        return saldoUsuario >= dineroApuesta
    }

    fun partido(): Boolean {
        val resultado = (0..10).random()
        estado = if (resultado < 6) com.example.appkotlinapuestas.utils.EstadoApuesta.PERDIDO else com.example.appkotlinapuestas.utils.EstadoApuesta.GANADA
        return estado == com.example.appkotlinapuestas.utils.EstadoApuesta.GANADA
    }

    fun realizarApuesta(saldoUsuario: Double): Double {
        if (!puedeApostar(saldoUsuario)) {
            throw IllegalArgumentException("Saldo insuficiente para realizar la apuesta.")
        }
        return saldoUsuario - dineroApuesta
    }

    fun calcularGanancia(): Double {
        if (estado != EstadoApuesta.GANADA) return 0.0

        val ratio = if (apostadoresAFavor > 0) apostadoresEnContra.toDouble() / apostadoresAFavor else 0.0

        return dineroApuesta + (dineroApuesta * ratio)
    }
}

    **/


}