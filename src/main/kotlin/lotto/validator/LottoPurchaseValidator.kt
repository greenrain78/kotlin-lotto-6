package lotto.validator

import lotto.constant.LottoValidatorError
import lotto.model.Lotto

object LottoPurchaseValidator {
    fun validPositiveInt(amount: Int) = require(amount >= 0) { LottoValidatorError.NEGATIVE_LOTTO_AMOUNT.text }
    fun validInvalidAmount(amount: Int) = require(amount % Lotto.PRICE == 0) {
        LottoValidatorError.INVALID_LOTTO_PURCHASE_AMOUNT.text.format(Lotto.PRICE)
    }
}