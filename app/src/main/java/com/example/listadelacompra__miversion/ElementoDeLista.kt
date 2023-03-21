package com.example.listadelacompra__miversion.ui.theme

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.listadelacompra__miversion.ViewModel

@Composable
fun EstadoElementoDeLista(elementoDeLista: Productos, onClose: (Productos) -> Unit) {

    ElementoDeLista(
        nombreElemento = elementoDeLista.name,
        onClose = { onClose(elementoDeLista) },
    )
}


@Composable
fun ElementoDeLista(
    nombreElemento: String,
    modifier: Modifier = Modifier,
    onClose: () -> Unit,
) {

    val viewModel: ViewModel = ViewModel()
    Card(
        Modifier
            .fillMaxWidth()
            .padding(10.dp)
    ) {
       /* val colorInicial = MaterialTheme.colors. //creo variable porque no me deja meterlo en el mutablestate directamente
        //var color by rememberSaveable { mutableStateOf(colorInicial) } //haciendolo así no me abre la aplicación
        var color by remember { mutableStateOf(colorInicial) } //así sí, pero no mantiene el estado (solo scroleando ya lo puedes comprobar)
        val marcado = MaterialTheme.colors.primary
*/


        Row(
            modifier
                .background(viewModel.colorInicial()) //asigno como color de la tarjeta la variable mutable
                .padding(0.dp, 15.dp)
                .clickable { viewModel.cambiarColor() },

            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = nombreElemento,
                Modifier
                    .weight(1f)
                    .padding(start = 16.dp)
            )
            IconButton(onClick = { /*modifier.background*/(viewModel.colorInicial)}) {
                Icon(Icons.Filled.Close, contentDescription = "Close")
            }
        }
    }
}

