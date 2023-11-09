package lotto.constant

enum class LottoPrizes(val value: Int, val count: Int = -1, val isBonus: Boolean = false) {
    FIRST_PRIZE(value = 2000000000, count = 6),
    SECOND_PRIZE(value = 30000000, count = 5, isBonus = true),
    THIRD_PRIZE(value = 1500000, count = 5),
    FOURTH_PRIZE(value = 50000, count = 4),
    FIFTH_PRIZE(value = 5000, count = 3),
    NONE_PRIZE(value = 0),
}
