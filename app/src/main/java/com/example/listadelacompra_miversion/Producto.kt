package com.example.listadelacompra_miversion

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color

//una lista con contador en cada elemento de la lazy column. ¿Posible examen?


val colorInicial = Color(0xFFD8CEB4)
val colorPulsado = Color(0xFF807A6C)

data class Producto( val key: Int, val name: String){
    var color by mutableStateOf(colorInicial)
}


fun getFakeListaDeElementos() : List<Producto> {
    val lista = List(30) {i-> Producto(i, "Producto $i") }
    return lista
}














/* fun getItemList() = listOf(
    ShoppingListProduct(
        "Producto 1"
    ),
    ShoppingListProduct(
        "Producto 2"
    ),
    ShoppingListProduct(
        "Producto 3"
    ),
    ShoppingListProduct(
        "Producto 4"
    ),
    ShoppingListProduct(
        "Producto 5"
    )

 */