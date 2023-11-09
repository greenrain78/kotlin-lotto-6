package lotto.model

import lotto.constant.LottoPrizes

class LottoResult(prizeCounts: Map<LottoPrizes, Int>) {
    private val prizeCountMap: Map<LottoPrizes, Int>

    init {
        prizeCountMap = LottoPrizes.entries.reversed().associateWith { prizeCounts.getOrDefault(it, 0) }
    }

    fun getLottoProfit(): Double {
        val totalProfit = prizeCountMap.map { (prize, count) -> prize.value * count }.sum()
        val totalPrice = prizeCountMap.values.sum() * Lotto.PRICE
        return totalProfit.toDouble() / totalPrice * 100
    }

    fun getPrizeCountMap(): Map<LottoPrizes, Int> {
        return prizeCountMap
    }

    companion object {

    }
}