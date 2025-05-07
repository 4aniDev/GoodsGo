package ru.chani.goodsgo.domain.models

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.Serializable

@Serializable
data class Sale(
    val id: String,
    val product: Product,
    val shop: Shop,
    val quantity: Int,
    val dateTime: LocalDateTime
)
