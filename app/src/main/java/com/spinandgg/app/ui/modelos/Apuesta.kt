package com.spinandgg.app.ui.modelos

data class Apuesta(
    val betID: Int,
    val betImg: String,
    val teamAName: String,
    val teamBName: String,
    val betOddTeamA: Double,
    val betOddDraw: Double,
    val betOddTeamB: Double
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