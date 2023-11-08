package lotto.view

class LottoOutputView {
    private val outputView = ConsoleOutputView()

    fun printMessage(message: String) {
        outputView.printMessage(message)
    }
}