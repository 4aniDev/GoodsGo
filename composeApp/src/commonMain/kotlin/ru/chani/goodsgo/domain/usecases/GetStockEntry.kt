package ru.chani.goodsgo.domain.usecases

import ru.chani.goodsgo.domain.models.StockEntry
import ru.chani.goodsgo.domain.repositories.BackupRepository

class GetStockEntry(private val repository: BackupRepository) {
    fun invoke(): StockEntry {
        return repository.getStockEntry()
    }
}