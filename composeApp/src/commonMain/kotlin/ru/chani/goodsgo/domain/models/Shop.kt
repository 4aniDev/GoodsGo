package ru.chani.goodsgo.domain.models

import kotlinx.serialization.Serializable


@Serializable
data class Shop(
    val id: String,
    val name: String
)