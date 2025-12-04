package baseball.model;

import baseball.dto.BaseballScore;
import java.util.List;

public class GameService {

    public BaseballScore playOneGame(String inputNumber, List<Integer> computerNumbers) {
        NumberManagement numberManagement = new NumberManagement(inputNumber);
        List<Integer> humanNumbers = numberManagement.parsingNumber();

        return calculatorService(humanNumbers,computerNumbers).calculator();
    }

    public List<Integer> generaterNewNumber() {
        RandomNumber randomNumber = new RandomNumber();
        return randomNumber.RandomNumber();
    }

    private CalculatorNumber calculatorService(List<Integer> humanNumbers, List<Integer> computerNumbers){
        BaseballScore baseballScore = new BaseballScore();
        return new CalculatorNumber(humanNumbers, computerNumbers, baseballScore);
    }

}
