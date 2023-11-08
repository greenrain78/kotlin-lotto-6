package lotto.view

import lotto.model.LottoPurchase

class LottoInputView {
    private val inputView = InputView()

    fun inputLottoPurchase(): LottoPurchase {
        val inputNum = inputView.inputNum()
        return LottoPurchase(amount = inputNum)
    }

    fun inputJackpotNumbers(): List<Int> {
        return inputView.inputNumList()
    }

    fun inputBonusNum(): Int {
        return inputView.inputNum()

    }
}