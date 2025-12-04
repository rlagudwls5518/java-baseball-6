package baseball.model;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class RandomNumber {
    private final int RANDOM_NUMBER_SIZE = 3;
    private final int START_NUMBER = 1;
    private final int END_NUMBER = 9;

    public List<Integer> RandomNumber() {
        List<Integer> computer = new ArrayList<>();

        while (computer.size() < RANDOM_NUMBER_SIZE) {
            int randomNumber = Randoms.pickNumberInRange(START_NUMBER, END_NUMBER);
            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber);
            }
        }

        return computer;
    }
}
