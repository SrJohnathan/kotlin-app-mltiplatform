package io.github.srjohnathan.common

import androidx.compose.material.Text
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun App() {
    var text by remember { mutableStateOf("Hello, World!") }
    val platformName = getPlatformName()


    Scaffold(topBar = {
        TopAppBar(title = { Text("AppTopBar") }
        ) }) {
        Button(onClick = {
            text = "Hello, ${platformName}"
        }) {
            Text(text)
        }
    }


}
