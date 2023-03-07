package com.example.listadelacompra__miversion

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.listadelacompra__miversion.ui.theme.EstadoElementoDeLista
import com.example.listadelacompra__miversion.ui.theme.Productos

@Composable
fun ListaDeElementosCompra (
    list: List<Productos>,
    modifier: Modifier = Modifier,
){
    LazyColumn(modifier){
        items(
            items = list,
            key = {it.key}
        ) {elemento ->
            EstadoElementoDeLista(elementoDeLista = elemento)
        }
    }

}