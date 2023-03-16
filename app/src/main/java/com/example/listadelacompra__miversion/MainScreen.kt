package com.example.listadelacompra__miversion
import android.graphics.Color
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import com.example.listadelacompra__miversion.ui.theme.getFakeListaDeElementos
import com.google.android.material.floatingactionbutton.FloatingActionButton


@Composable
fun MainScreen () {
    val colorInicial = MaterialTheme.colors.secondary
    var colorPulsado by remember{ mutableStateOf(colorInicial) }


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

        val lista = remember { getFakeListaDeElementos().toMutableStateList() }

        ListaDeElementosCompra(
            list = lista,
            cancelarProductos = { lista.remove(it) },
            modifier = Modifier.padding(paddingValues),
        )
    }


}

