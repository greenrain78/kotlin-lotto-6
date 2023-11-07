package lotto.model

class LottoMachine {
    fun buyLotto(money: Int): List<Lotto> {
        val lottoPurchaseCount = money / Lotto.PRICE
        return List(size = lottoPurchaseCount) { issueLotto() }
    }

    private fun issueLotto(): Lotto {
        return Lotto.createRandom()
    }
}