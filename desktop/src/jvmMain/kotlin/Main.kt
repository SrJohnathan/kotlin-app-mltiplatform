// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.application
import io.github.srjohnathan.common.App


fun main() = application {/**/
    Window(onCloseRequest = ::exitApplication, title = "App Desktop",state = WindowState(size = DpSize(380.dp,700.dp))) {
        App()
    }
}
