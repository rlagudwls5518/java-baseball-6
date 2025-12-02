package baseball;

import java.util.List;

public class ResultGame {

    private final List<Integer> result;

    public ResultGame(List<Integer> result) {
        this.result = result;
    }

    public boolean gameResult(){

        if(result.get(0) == 3){
            System.out.println("3스트라이크 ");
            return false;
        }
        else{
            if(result.get(2) == 3){
                System.out.println("낫싱");
            }
            else{
                if(result.get(1) > 0){
                    System.out.print(result.get(1)+"볼 ");
                }

                if(result.get(0) > 0){
                    System.out.println(result.get(0)+"스트라이크");
                }
            }
            return true;
        }
    }
}
