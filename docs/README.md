# 기능 명세
목표: 로또 게임을 구현해야 한다
## 시나리오
1. 로또를 구매하기 위해 사용자로 부터 구입 금액을 입력 받는다.
2. 입력 받은 구입 금액으로 로또를 구매한다.
3. 구매한 로또를 사용자에게 보이도록 출력한다.
4. 당첨 번호와 보너스 번호를 입력 받는다.
5. 당첨 통계를 출력한다.
  1. 당첨금별 로또의 갯수를 출력한다.
  2. 총 수익률을 출력한다.

## 로또

### 로또 숫자
- [x] 무작위의 숫자를 뽑아서 로또 숫자로 선정한다.
- [x] 로또 번호의 숫자 범위는 1~45까지
- [x] 중복되지 않는 6개의 숫자
### 로또 구매
- [ ] 로또 1장의 가격은 1,000원
- [ ] 사용자로부터 로또 구입 금액을 입력 받는다.
- [ ] 구입 금액에 해당하는 만큼 로또를 발행

## 당첨
### 당첨 번호

- [ ] 중복되지 않는 숫자 6개와 보너스 번호 1개를 뽑음
- [ ] 사용자로 부터 당첨 번호를 입력 받는다.

### 당첨금
- [ ] 당첨은 1등부터 5등까지 있음
- [ ] 수익률은 당첨금 총합 / 로또 구입 금액 이다.
- [ ] 수익률은 소수점 둘째 자리에서 반올림한다.

## 입출력
### 입력
로또 구입 금액을 입력
- [ ] 양의 정수를 입력 받음
- [ ] 1,000원 단위로 입력 받음
- [ ] 1,000원으로 나누어 떨어지지 않는 경우 예외 처리

당첨 번호를 입력
- [ ] 쉼표(,)를 기준으로 당첨 번호를 구분한다.
- [ ] 숫자 범위는 1~45까지
- [ ] 중복되지 않는 숫자를 입력 받음

보너스 번호를 입력
- [ ] 숫자 범위는 1~45까지
- [ ] 당첨 번호와 중복이면 안됨

### 출력
구입한 로또를 출력
- [ ] 양식에 맞춰 구매한 로또 개수를 출력
- [ ] 로또 번호를 오름차순으로 정렬하여 출력

당첨 내역을 출력
- [ ] 당첨 금액과 당첨한 로또 갯수를 출력
- [ ] 금액이 작은 것부터 먼저 출력

수익률 출력
- [ ] 양식에 맞춰 수익률을 출력
- [ ] 소수점 둘째 자리에서 반올림
## 예외 처리
예외 상황 시 에러 문구를 출력
- [ ]  에러 문구는 `[ERROR]`로 시작해야 함

사용자가 잘못된 값을 입력할 경우
- [ ] `IllegalArgumentException`를 발생
- [ ]  에러 메시지를 출력 후 그 부분부터 입력을 다시 받음


# 구조

### Controller
- [ ] buyLotto / 로또를 구매한다.
  - [ ] 로또 구입 금액을 입력 받는다. -> LottoInputView.inputLottoPurchase
  - [ ] 로또를 발급하다. -> LottoMachine.buyLotto
  - [ ] 구입한 로또를 출력한다. -> LottoOutputView.printLottoList

- [ ] checkLottoPrize /  당첨금을 확인한다.
  - [ ] 당첨 번호를 입력 받는다.  -> LottoInputView.inputLottoWinningNumers
  - [ ] 로또 결과를 계산한다. -> LottoMachine.checkLotto
  - [ ] 로또 결과를 출력한다. -> LottoOutputView.printLottoResult

## View

### LottoInputView
- [ ] inputLottoPurchase / 로또 번호를 입력 받는다.
  - [ ] 사용자로부터 정수를 입력 받는다. -> InputView.inputNum
  - [ ] 입력 받은 값을 로또 구입 금액에 맞게 변환한다. -> LottoPurchaseParser.parseInt
  - [ ] 입력 받은 값으로 구입 금액을 생성한다. ->  LottoPurchase
- [ ] inputLottoWinningNumers / 당첨 번호를 입력받는다.
  - [ ] 사용자로부터 정수를 입력 받는다. -> InputView.inputNum
  - [ ] 입력 받은 값을 당첨 번호에 맞게 변환한다. -> LottoWinningNumersParser.parseNumList
  - [ ] 입력 받은 값으로 당첨 번호를 생성한다. ->  LottoWinningNumers


### InputView
- [ ] inputNum / 사용자로부터 정수를 입력 받는다.
  - [ ] 정수가 아니면 에러 메세지를 반환한다.

### LottoOutputView
- [ ] printLottoList / 구입한 로또를 출력한다.
  - [ ] 양식에 따라 로또 갯수를 출력한다. -> GameMessage, OutputView
  - [ ] 로또 번호를 가져와 출력한다. -> Lotto.getNumbers, OutputView
- [ ] printLottoResult / 로또 결과를 출력한다.
  - [ ] 각 등수 별 로또 결과를 출력한다. -> LottoResult.getResult
  - [ ] 수익률을 출력한다. -> LottoResult.getLottoProfit

### OutputView
- [ ] printMessage / 문자열을 출력한다.

## Constant
### GameMessage
- [ ] 로또 갯수 출력 문구

### ParserError
- [ ] 파싱 에러 메세지

### VaildatorError
- [ ] 검증 에러 메세지

### LottoPrizes
- [x] 로또 가격 관리

## Parser
### LottoPurchaseParser
- [ ] parseInt / 입력 받은 값을 로또 구입 금액으로 변환한다.
  - [ ] 아무 기능을 하지 않는다. -> 추후 유지 보수를 위해
### LottoWinningNumersParser
- [ ] parseNumList / 입력 받은 값을 당첨 번호로 변환한다.
  - [ ] 문자열을 쉼표(,)를 기준으로 구분한다.
  - [ ] 입력받은 번호를 정수로 변환한다.

## Vaildator
### LottoPurchaseVaildator
- [ ] vaildLottoPurchase / 금액이 정상 금액인지 확인한다.
  - [ ] 음수가 아닌지 확인한다.
  - [ ] 1000원 단위로 나눠지는지 확인한다.
### LottoWinningNumersVaildator
- [ ] vaildJackpotNumbers / 당첨 번호가 정상인지 확인한다.
  - [ ] 당첨 번호가 1~45 사이의 값인지 확인한다.
  - [ ] 당첨 번호가 중복되지 않은 숫자인지 확인한다.
- [ ] vaildBonustNumber / 보너스 번호가 정상인지 확인한다.
  - [ ] 보너스 번호가 1~45 사이의 값인지 확인한다.
  - [ ] 보너스 번호가 당첨 번호와 중복인지 확인한다.
## Model

### LottoPurchase
- [x] amount init 돈을 생성한다.
  - [x] 금액이 정상 금액인지 확인한다. -> LottoPurchaseVaildator.vaildLottoPurchase
### LottoWinningNumers
- [ ] init 당첨 번호를 생성한다.
  - [ ] 당첨 번호가 정상인지 확인한다. -> LottoWinningNumersVaildator.vaildJackpotNumbers
  - [ ] 보너스 번호가 정상인지 확인한다. -> LottoWinningNumersVaildator.vaildBonustNumber
### LottoMachine
- [ ] buyLotto / 입력 받은 금액 만큼 로또를 발급한다.
  - [ ] 입력 받은 금액을 통해 발급할 로또 개수를 정한다.
  - [ ]  makeLotto / 로또를 1개 발급한다. -> this
  - [ ] 생성한 로또들을 반환한다.
- [ ] issueLotto / 로또를 1개 발급한다.
  - [ ] 랜덤 한 로또를 생성한다. -> Lotto.createRandom
  - [ ] 생성한 로또를 반환한다.
### LottoChecker
- [x] checkLotto / 로또 당첨금 확인
  - [x] 입력받은 당첨 번호와 로또 번호를 비교해서 한다.
  - [x] 결과를 로또 결과에 담아 반환한다. -> LottoResult
### LottoResult
- 로또 결과를 가지고 있는 객체
- [x] getLottoProfit / 수익률 구하기
- [x] getPrizeCountMap / 로또 결과 반환
### Lotto
로또 1장을 담당하는 객체
- [x] createRandom / 랜덤한 로또를 생성한다.
  - [x] 랜덤으로 1~45까지 중복되지 않는 숫자 6개를 선정한다.
- [x] getNumbers / 로또 번호를 출력한다.
  - [x] 오름차순으로 정렬한다.


