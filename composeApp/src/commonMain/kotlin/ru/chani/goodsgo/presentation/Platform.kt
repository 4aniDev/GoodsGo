package ru.chani.goodsgo.presentation

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform