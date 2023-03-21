package com.example.listadelacompra__miversion
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import androidx.lifecycle.ViewModel
import com.example.listadelacompra__miversion.ui.theme.getFakeListaDeElementos


class ViewModel: ViewModel(){

    private val _lista = getFakeListaDeElementos().toMutableStateList()
    val lista /*: SnapshotStateList<Productos> */get() = _lista
//boton secundario > backing properties. Lo mismo que getter/setter




var colorInicial= @Composable fun(): androidx.compose.ui.graphics.Color {

    return MaterialTheme.colors.primaryVariant
}

val colorPulsado = @Composable fun (): androidx.compose.ui.graphics.Color {
    return  MaterialTheme.colors.primary
}

fun cambiarColor(){ colorInicial =colorPulsado }

}