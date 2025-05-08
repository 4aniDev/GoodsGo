package ru.chani.goodsgo.domain.repositories

import ru.chani.goodsgo.domain.models.StockEntry

interface BackupRepository {

    fun getStockEntry(): StockEntry

}