package lotto.constant

enum class GameMessage(val message: String) {
    LOTTO_PURCHASE_INPUT_GUIDE("구입금액을 입력해 주세요."),
    LOTTO_PURCHASE_COUNT_MESSAGE("%d개를 구매했습니다."),

    JACKPOT_NUMBERS_INPUT_GUIDE("당첨 번호를 입력해 주세요."),
    BONUS_NUMBER_INPUT_GUIDE("보너스 번호를 입력해 주세요.");

    enum class LottoResult(val message: String) {
        HEADER("당첨 통계\\n---"),
        DEFAULT_FORMAT("%d개 일치 (%d원) - %d개"),
        BONUS_FORMAT("%d개 일치, 보너스 볼 일치 (%d원) - %d개"),
        PROFIT_FORMAT("총 수익률은 %.2f%%입니다."),
    }
}