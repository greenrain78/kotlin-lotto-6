package lotto.view

import lotto.model.LottoPurchase

class LottoInputView {
    private val inputView = InputView()

    fun inputLottoPurchase(): LottoPurchase {
        while (true) {
            try {
                val inputNum = inputView.inputNum()
                return LottoPurchase(amount = inputNum)
            } catch (e: IllegalArgumentException) {
                println(e.message)
            }
        }
    }

    fun inputJackpotNumbers(): List<Int> {
        while (true) {
            try {
                return inputView.inputNumList()
            } catch (e: IllegalArgumentException) {
                println(e.message)
            }
        }
    }

    fun inputBonusNum(): Int {
        while (true) {
            try {
                return inputView.inputNum()
            } catch (e: IllegalArgumentException) {
                println(e.message)
            }
        }
    }
}