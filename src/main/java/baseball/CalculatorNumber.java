package baseball;


import java.util.ArrayList;
import java.util.List;

public class CalculatorNumber {
    private final List<Integer> human;
    private final List<Integer> computer;
    private final List<Integer> result = new ArrayList<>();
    private int strike = 0;
    private int ball = 0;
    private int nothing = 0;


    public CalculatorNumber(List<Integer> human, List<Integer> computer){
        this.human = human;
        this.computer = computer;
    }

    public List<Integer> calculator(){
        for(int i = 0; i < 3; i++){
            if(computer.contains(human.get(i))){
                if(computer.get(i).equals(human.get(i))){
                    strike++;
                }
                else{
                    ball++;
                }
            }
            else{
                nothing++;
            }
        }

        result.add(strike);
        result.add(ball);
        result.add(nothing);

        return result;
    }
}
