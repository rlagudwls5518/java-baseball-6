package baseball.model;


import baseball.dto.BaseballScore;
import java.util.List;

public class CalculatorNumber {
    private final List<Integer> human;
    private final List<Integer> computer;
    private final BaseballScore baseballScore;

    public CalculatorNumber(List<Integer> human, List<Integer> computer, BaseballScore baseballScore){
        this.human = human;
        this.computer = computer;
        this.baseballScore = baseballScore;
    }

    public BaseballScore calculator(){
        for(int i = 0; i < 3; i++){
            if(computer.contains(human.get(i))){
                if(computer.get(i).equals(human.get(i))){
                    baseballScore.plusStrikeCount();
                }
                else{
                    baseballScore.plusBallCount();
                }
            }
            else{
                baseballScore.plusNothingCount();
            }
        }
        return baseballScore;
    }
}
