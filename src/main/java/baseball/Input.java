package baseball;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class Input {

    public String gameInput(){
        System.out.println("숫자를 입력해줏세요 : ");
        return readLine();
    }

    public String reGameInput(){
        return readLine();
    }
}
