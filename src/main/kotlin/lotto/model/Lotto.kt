package lotto.model

import camp.nextstep.edu.missionutils.Randoms

class Lotto(private val numbers: List<Int>) {
    init {
        require(numbers.size == 6)
    }

    fun getNumbers(): List<Int> {
        return numbers.sorted()
    }

    companion object {
        private const val MIN_NUM = 1
        private const val MAX_NUM = 45
        private const val NUMBER_SIZE = 6
        fun createRandom(): Lotto {
            val numbers = Randoms.pickUniqueNumbersInRange(MIN_NUM, MAX_NUM, NUMBER_SIZE)
            return Lotto(numbers)
        }
    }
}
