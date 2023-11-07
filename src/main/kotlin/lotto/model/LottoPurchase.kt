package lotto.model

import lotto.constant.LottoValidatorError

data class LottoPurchase(val amount: Int) {
    init {
        require(amount % Lotto.PRICE == 0) {
            LottoValidatorError.INVALID_LOTTO_PURCHASE_AMOUNT.text.format(Lotto.PRICE)
        }
    }
}