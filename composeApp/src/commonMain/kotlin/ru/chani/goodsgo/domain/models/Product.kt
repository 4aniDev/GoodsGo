package ru.chani.goodsgo.domain.models

import kotlinx.serialization.Serializable


@Serializable
data class Product(
    val id: String,
    val name: String,
    val category: Category,
    val imageUrl: String? = null
)
