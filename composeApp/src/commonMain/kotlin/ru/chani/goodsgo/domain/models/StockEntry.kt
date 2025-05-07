package ru.chani.goodsgo.domain.models

import kotlinx.serialization.Serializable

@Serializable
data class StockEntry(
    val shop: Shop,
    val product: Product,
    val quantity: Int            // Quantity of goods (products) in the store
)
