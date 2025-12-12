package com.spinandgg.app.ui.logica

import com.spinandgg.app.ui.modelos.Apuesta
import com.spinandgg.app.ui.modelos.EstadoApuesta


class GestorApuestas {
/*
    private val apuestas: MutableList<Apuesta> = mutableListOf()

    fun crearApuestasDemo() {
        apuestas.add(Apuesta(0, 50.0,  EstadoApuesta.PENDIENTE, "lol", "T1", "G2" , 20 , 200))
        apuestas.add(Apuesta(1, 100.0,  EstadoApuesta.PENDIENTE, "conterstrike", "team cheese", "Los beniju" , 3 , 1000))
        apuestas.add(Apuesta(2, 75.0,  EstadoApuesta.PENDIENTE, "Rocket", "los cohetes", "los rayo mcqueen" , 1 , 1000000))
    }

    /**
     * Devuelve array con id, categoria y equipos
     */
    fun listarApuestas(): List<Pair<Int, Pair<String, List<String>>>> {
        return apuestas.map { apuesta ->
            val equipos = listOf(apuesta.team1, apuesta.team2)
            apuesta.id to (apuesta.categoria to equipos)
        }
    }

    /**
     * Busca por string en categoria o equipos
     */
    fun buscarApuestas(filtro: String): List<Int> {
        return apuestas.filter { apuesta ->
            apuesta.categoria.contains(filtro, ignoreCase = true) ||
                    apuesta.team1.contains(filtro, ignoreCase = true) == true ||
                    apuesta.team2.contains(filtro, ignoreCase = true) == true
        }.map { it.id }
    }

    fun obtenerApuestaPorId(id: Int): Apuesta? {
        return apuestas.find { it.id == id }
    }

 */
}
