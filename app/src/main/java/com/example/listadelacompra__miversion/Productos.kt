package com.example.listadelacompra__miversion.ui.theme

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

//una lista con contador en cada elemento de la lazy column. ¿Posible examen?

data class Productos( val key: Int, val name: String){
    var seleccionado by mutableStateOf(false)
}


fun getFakeListaDeElementos() : List<Productos> {
    var lista = List(30) {i-> Productos(i, "Producto $i")}
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