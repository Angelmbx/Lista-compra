package com.example.listadelacompra__miversion
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.listadelacompra__miversion.ui.theme.getFakeListaDeElementos


@Composable
fun MainScreen () {
    Scaffold(
        topBar = { TopAppBar(title = { Text(stringResource(R.string.app_name)) }) }
    ) {paddingValues ->

        val lista = remember { getFakeListaDeElementos().toMutableStateList() }

        ListaDeElementosCompra(
            list = lista,
            cancelarProductos = { lista.remove(it) },
            modifier = Modifier.padding(paddingValues),
        )
    }


}

