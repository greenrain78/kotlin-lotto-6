package lotto.controller

import lotto.constant.GameMessage
import lotto.model.Lotto
import lotto.model.LottoChecker
import lotto.model.LottoMachine
import lotto.view.LottoInputView
import lotto.view.LottoOutputView

class LottoController {
    private val inputView = LottoInputView()
    private val outputView = LottoOutputView()
    private val lottoMachine = LottoMachine()

    fun run() {
        val lottoList = buyLotto()

        checkLottoPrize(lottoList = lottoList)
    }

    private fun buyLotto(): List<Lotto> {
        outputView.printMessage(message = GameMessage.LOTTO_PURCHASE_INPUT_GUIDE.message)
        val purchase = inputView.inputLottoPurchase()
        outputView.printMessage("")

        val lottoList = lottoMachine.buyLotto(money = purchase.amount)
        outputView.printLottoList(lottoList = lottoList)
        outputView.printMessage("")
        return lottoList
    }

    private fun checkLottoPrize(lottoList: List<Lotto>) {
        outputView.printMessage(GameMessage.JACKPOT_NUMBERS_INPUT_GUIDE.message)
        val jackpotNumbers = inputView.inputJackpotNumbers()
        outputView.printMessage("")

        outputView.printMessage(GameMessage.BONUS_NUMBER_INPUT_GUIDE.message)
        val bonusNum = inputView.inputBonusNum()
        outputView.printMessage("")

        val lottoChecker = LottoChecker(jackpotNumbers = jackpotNumbers, bonusNum = bonusNum)
        val lottoResult = lottoChecker.checkLottoList(lottoList = lottoList)
        outputView.printLottoResult(lottoResult = lottoResult)
    }
}