package lotto.constant

enum class LottoValidatorError(val text: String) {
    INVALID_LOTTO_PURCHASE_AMOUNT("로또 구입 금액은 %d원 단위로 입력 되어야 합니다."),
}