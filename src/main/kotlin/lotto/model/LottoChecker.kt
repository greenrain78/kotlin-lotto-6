package lotto.model

import lotto.constant.LottoPrizes

class LottoChecker(private val jackpotNumbers: List<Int>, private val bonusNum: Int) {
    fun checkLottoList(lottoList: List<Lotto>): LottoResult {
        val prizeList = lottoList.map { lotto: Lotto ->
            checkLottoOne(lotto.getNumbers())
        }
        val prizeCounts = prizeList.groupingBy { it }.eachCount()
        return LottoResult(prizeCounts = prizeCounts)

    }

    private fun checkLottoOne(lottoNumbers: List<Int>): LottoPrizes {
        val correctCount = lottoNumbers.intersect(jackpotNumbers.toSet()).size
        return when (correctCount) {
            6 -> LottoPrizes.FIRST_PRIZE
            5 -> when (lottoNumbers.contains(bonusNum)) {
                true -> LottoPrizes.SECOND_PRIZE
                false -> LottoPrizes.THIRD_PRIZE
            }

            4 -> LottoPrizes.FOURTH_PRIZE
            3 -> LottoPrizes.FIFTH_PRIZE
            else -> LottoPrizes.NONE_PRIZE
        }

    }
}