package ru.chani.goodsgo

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import ru.chani.goodsgo.presentation.App

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "GoodsGo",
    ) {
        App()
    }
}