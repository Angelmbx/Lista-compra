package com.example.listadelacompra_miversion

import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign


@Composable
fun MainScreen () {

    val viewModel: ViewModel = ViewModel()
   // val lista = remember { getFakeListaDeElementos().toMutableStateList() }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(
                    text ="Lista de la compra",
                    textAlign = TextAlign.Center,
                    )},

                actions = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(imageVector = Icons.Filled.Search, contentDescription = "Buscar")
                    }

                    IconButton(onClick = { }) {
                    Icon(imageVector = Icons.Filled.MoreVert, contentDescription = "Ver más")
                }

            }) },
        floatingActionButton = {
            ExtendedFloatingActionButton({Text("Checkout    \uD83D\uDED2")},

                onClick = {   },
            )
        },
        floatingActionButtonPosition = FabPosition.Center
    ) {paddingValues ->

        ListaDeElementosCompra(
            list = viewModel.lista,
            cancelarProductos = { viewModel.remove(it) },
            modifier = Modifier.padding(paddingValues),
            onChangeColor = {
                viewModel.cambiarColor(it) }
        )
    }


}

