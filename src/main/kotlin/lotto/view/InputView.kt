package lotto.view

import camp.nextstep.edu.missionutils.Console
import lotto.constant.InputViewError

class InputView {
    fun inputNum(): Int =
        inputString().toIntOrNull() ?: throw IllegalArgumentException(InputViewError.TO_INT_ERROR.message)

    fun inputNumList(): List<Int> = inputString().split(",")
        .map { it.toIntOrNull() ?: throw IllegalArgumentException(InputViewError.TO_INT_ERROR.message) }

    private fun inputString() =
        Console.readLine() ?: throw IllegalArgumentException(InputViewError.INPUT_ERROR.message)
}