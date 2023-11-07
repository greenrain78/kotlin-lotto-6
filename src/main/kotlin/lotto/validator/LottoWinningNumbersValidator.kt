package lotto.validator

import lotto.constant.LottoValidatorError
import lotto.model.Lotto

object LottoWinningNumbersValidator {
    fun validOutOfRange(num: Int) = require(num in Lotto.MIN_NUM..Lotto.MAX_NUM) {
        LottoValidatorError.OUT_OF_RANGE_NUMBER_RANGE.message.format(Lotto.MIN_NUM, Lotto.MAX_NUM)
    }

    fun validNumListOutOfRange(numList: List<Int>) = numList.forEach { num -> validOutOfRange(num = num) }

    fun validDuplicate(numList: List<Int>) =
        require(numList.size == numList.distinct().size) { LottoValidatorError.NUMBER_DUPLICATE.message }

    fun validExistInList(numList: List<Int>, num: Int) = require(num !in numList) {
        LottoValidatorError.NUMBER_EXIST_IN_LIST.message.format(num)
    }

}