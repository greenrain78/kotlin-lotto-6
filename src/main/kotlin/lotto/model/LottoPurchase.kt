package lotto.model

import lotto.constant.LottoValidatorError
import lotto.validator.LottoPurchaseValidator

data class LottoPurchase(val amount: Int) {
    init {
        LottoPurchaseValidator.validPositiveInt(amount = amount)
        LottoPurchaseValidator.validInvalidAmount(amount = amount)
    }
}