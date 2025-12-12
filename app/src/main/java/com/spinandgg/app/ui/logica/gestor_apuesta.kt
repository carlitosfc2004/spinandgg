package com.spinandgg.app.ui.logica

import com.spinandgg.app.ui.logica.GestorUsuarios.usuariosRegistrados
import com.spinandgg.app.ui.modelos.Apuesta
import com.spinandgg.app.ui.modelos.EstadoApuesta
import com.spinandgg.app.ui.modelos.Usuario


object GestorApuestas {

    val apuestasExistentes = mutableListOf<Usuario>()

    fun cargarApuestas() {
        apuestasExistentes.add(Usuario("juanjo123", "juanjo@gmail.com", "1234"))
        apuestasExistentes.add(Usuario("alvaro666", "alvaro@gmail.com", "abcd"))
        apuestasExistentes.add(Usuario("carlito07", "carlos@gmail.com", "pass"))
    }
}
