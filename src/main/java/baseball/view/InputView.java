package baseball.view;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class InputView {

    public String gameInput(){
        System.out.println("숫자를 입력해줏세요 : ");
        return readLine();
    }

    public String reGameInput(){
        return readLine();
    }
}
