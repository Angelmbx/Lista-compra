package com.example.listadelacompra_miversion

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun ListaDeElementosCompra (
    list: List<Producto>,
    onChangeColor: (Producto) -> Unit,
    modifier: Modifier = Modifier,
    cancelarProductos: (Producto) -> Unit,
){
    LazyColumn(modifier){
        items(
            items = list,
            key = {it.key}
        ) {elemento ->
            ElementoGraficoLista(
                nombreeElemento= elemento.name,
                onClose=



            )
        }
    }

}