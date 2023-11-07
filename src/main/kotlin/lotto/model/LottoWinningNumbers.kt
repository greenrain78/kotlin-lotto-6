package lotto.model

import lotto.validator.LottoWinningNumbersValidator

data class LottoWinningNumbers(val jackpotNumbers: List<Int>, val bonusNum: Int) {
    init {
        LottoWinningNumbersValidator.validDuplicate(numList = jackpotNumbers)
        LottoWinningNumbersValidator.validNumListOutOfRange(numList = jackpotNumbers)
        LottoWinningNumbersValidator.validOutOfRange(num = bonusNum)
        LottoWinningNumbersValidator.validExistInList(numList = jackpotNumbers, num = bonusNum)
    }

}