package com.example.listadelacompra_miversion

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel


class ViewModel : ViewModel() {

    private val _lista = getFakeListaDeElementos().toMutableStateList()
    val lista get() = _lista
//boton secundario > backing properties. Lo mismo que getter/setter



    fun cambiarColor(producto: Producto) {
        producto.color = colorPulsado
    }


    fun remove(producto: Producto) {

    }

}