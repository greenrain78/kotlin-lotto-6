package lotto.constant

enum class LottoValidatorError(val message: String) {
    INVALID_LOTTO_PURCHASE_AMOUNT("[ERROR] 로또 구입 금액은 %d원 단위로 입력 되어야 합니다."),
    NEGATIVE_LOTTO_PURCHASE_AMOUNT("[ERROR] 로또 구입 금액은 음수일 수 없습니다."),
    NUMBER_DUPLICATE("[ERROR] 번호 중 중복된 값이 존재 합니다."),
    NUMBER_EXIST_IN_LIST("[ERROR] %d 가 이미 존재 합니다."),
    OUT_OF_RANGE_NUMBER_RANGE("[ERROR] 번호는 %d ~ %d 범위 안에 있어야 합니다.")
}