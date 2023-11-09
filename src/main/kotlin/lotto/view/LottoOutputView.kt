package lotto.view

import lotto.constant.GameMessage
import lotto.constant.LottoPrizes
import lotto.model.Lotto
import lotto.model.LottoResult

class LottoOutputView {
    private val outputView = ConsoleOutputView()

    fun printMessage(message: String) {
        outputView.printMessage(message)
    }

    fun printLottoList(lottoList: List<Lotto>) {
        outputView.printMessage(
            GameMessage.LOTTO_PURCHASE_COUNT_MESSAGE.message.format(lottoList.size)
        )
        lottoList.forEach { lotto: Lotto ->
            outputView.printMessage(lotto.getNumbers(isAsc = true).toString())
        }
    }

    fun printLottoResult(lottoResult: LottoResult) {
        outputView.printMessage(GameMessage.LottoResult.HEADER.message)
        var prizeCountMap = lottoResult.getPrizeCountMap()
        prizeCountMap = prizeCountMap.filterKeys { it != LottoPrizes.NONE_PRIZE }
        prizeCountMap.forEach { (prize, count) ->
            outputView.printMessage(
                GameMessage.LottoResult.DEFAULT_FORMAT.message.format(
                    0, String.format("%,d", prize.value), count
                )
            )
        }
        outputView.printMessage(GameMessage.LottoResult.PROFIT_FORMAT.message.format(lottoResult.getLottoProfit()))
    }
}