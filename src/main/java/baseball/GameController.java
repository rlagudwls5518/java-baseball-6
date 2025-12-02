package baseball;


import java.util.List;

public class GameController {

    private final Input input;

    public GameController(Input input) {
        this.input = input;
    }


    public void run() {
        System.out.println("숫자 야구 게임을 시작합니다.");

        while (true) {
            RandomNumber randomNumber = new RandomNumber();
            List<Integer> b = randomNumber.RandomNumber();

            while (true) {
                String number = input.gameInput();
                NumberManagement numberManagement = new NumberManagement(number);

                List<Integer> a = numberManagement.parsingNumber();

                CalculatorNumber calculatorNumber = new CalculatorNumber(a, b);
                List<Integer> c = calculatorNumber.calculator();

                ResultGame resultGame = new ResultGame(c);
                if (!resultGame.gameResult()) {
                    break;
                }
            }
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료\n"
                    + "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            int p = Integer.parseInt(input.reGameInput());
            if (p == 2) {
                break;
            }
        }
    }
}
