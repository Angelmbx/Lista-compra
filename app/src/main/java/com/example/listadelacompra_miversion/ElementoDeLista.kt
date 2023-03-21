package com.example.listadelacompra_miversion

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun ElementoDeLista(
    nombreElemento: String,
    modifier: Modifier = Modifier,
    onClose: () -> Unit,
    onChangeColor : () ->Unit,
) {

    Card(
        Modifier
            .fillMaxWidth()
            .padding(10.dp)
    ) {

        Row(
            modifier
                .background(colorInicial)
                .padding(0.dp, 15.dp)
                .clickable { onChangeColor() },

            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = nombreElemento,
                Modifier
                    .weight(1f)
                    .padding(start = 16.dp)
            )
            IconButton(onClick = { colorInicial }) {
                Icon(Icons.Filled.Close, contentDescription = "Close")
            }
        }
    }
}

