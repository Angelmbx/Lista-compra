package com.example.listadelacompra__miversion.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun EstadoElementoDeLista(elementoDeLista:Productos, onClose: (Productos) -> Unit) {

    ElementoDeLista(
        nombreElemento = elementoDeLista.name,
        onClose = { onClose(elementoDeLista) },
    )
}



@Composable
fun ElementoDeLista(
    nombreElemento: String,
    modifier: Modifier = Modifier,
    onClose: () -> Unit,)
{
    Card(
        Modifier
            .fillMaxWidth()
            .padding(10.dp)
    ) {
        Row( modifier.background(MaterialTheme.colors.secondary)
            .clickable { modifier.background(Color.Green)  },
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = nombreElemento,
                Modifier
                    .weight(1f)
                    .padding(start = 16.dp)
            )
            IconButton(onClick = onClose ) {
                Icon(Icons.Filled.Close, contentDescription = "Close")
            }
            }
        }
    }
