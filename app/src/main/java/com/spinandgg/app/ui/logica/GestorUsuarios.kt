package com.spinandgg.app.ui.logica

import com.spinandgg.app.ui.modelos.Usuario

object GestorUsuarios {
    val usuariosRegistrados = mutableListOf<Usuario>()
    var usuarioActivo: Usuario? = null      //usuario que en este momento está logueado en la app

    fun cargarUsuarios() {
        usuariosRegistrados.add(Usuario("juanjo123", "juanjo@gmail.com", "1234"))
        usuariosRegistrados.add(Usuario("alvaro666", "alvaro@gmail.com", "abcd"))
        usuariosRegistrados.add(Usuario("carlito07", "carlos@gmail.com", "pass"))
    }

    fun login(usernameOrEmail: String, password: String): Usuario? {
        return usuariosRegistrados.find {
            (it.username == usernameOrEmail || it.email == usernameOrEmail)
                    && it.password == password
        }
    }

    fun crearSesion(usuarioLogueado: Usuario) {
        usuarioActivo = usuarioLogueado
    }

}