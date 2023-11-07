package lotto.model

import camp.nextstep.edu.missionutils.Randoms

class Lotto(private val numbers: List<Int>) {
    init {
        require(numbers.size == NUMBER_SIZE)
    }

    internal fun getNumbers(): List<Int> = numbers
    fun getNumbers(isAsc: Boolean) = when (isAsc) {
        true -> numbers.sorted()
        false -> numbers.reversed()
    }

    override fun toString(): String {
        return "$numbers"
    }

    companion object {
        const val PRICE = 1000
        const val MIN_NUM = 1
        const val MAX_NUM = 45
        const val NUMBER_SIZE = 6
        fun createRandom(): Lotto {
            val numbers = Randoms.pickUniqueNumbersInRange(MIN_NUM, MAX_NUM, NUMBER_SIZE)
            return Lotto(numbers)
        }

        fun createNumList(numList: List<Int>): Lotto {
            return Lotto(numList)
        }
    }
}
