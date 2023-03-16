package com.example.listadelacompra__miversion.ui.theme

//una lista con contador en cada elemento de la lazy column. ¿Posible examen?

data class Productos( val key: Int, val name: String)

fun getFakeListaDeElementos() : List<Productos> {
    var lista = List(30) {i-> Productos(i, "Producto $i")}
    return lista
}