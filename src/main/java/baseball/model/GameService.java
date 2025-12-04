package baseball.model;

import baseball.dto.BaseballScore;
import java.util.List;

public class GameService {

    public BaseballScore playOneGame(String inputNumber, List<Integer> computerNumbers){
        NumberManagement numberManagement = new NumberManagement(inputNumber);
        List<Integer> humanNumbers = numberManagement.parsingNumber();
        BaseballScore baseballScore = new BaseballScore();
        CalculatorNumber calculatorNumber = new CalculatorNumber(humanNumbers, computerNumbers, baseballScore);
        return calculatorNumber.calculator();
    }

    public List<Integer> generaterNewNumber(){
        RandomNumber randomNumber = new RandomNumber();
        return randomNumber.RandomNumber();
    }

}
