package ru.chani.goodsgo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform