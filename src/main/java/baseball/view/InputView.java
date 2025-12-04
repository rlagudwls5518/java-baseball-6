package baseball.view;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class InputView {
    private final String INPUT_NUMBER_MESSAGE = "숫자를 입력해줏세요 : ";
    private final int RESTART_GAME_NUMBER = 1;
    public String gameInput(){
        System.out.println(INPUT_NUMBER_MESSAGE);
        return readLine();
    }

    public String reGameInput(){
        return readLine();
    }

    public boolean restartGame(String chooseNumber){
        if (chooseNumber.equals(RESTART_GAME_NUMBER)){
            return true;
        }
        else{
            return false;
        }
    }
}
