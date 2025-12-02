package baseball;

import java.util.ArrayList;
import java.util.List;

public class NumberManagement {
    private final String number;

    public NumberManagement(String number) {
        numberValidator(number);
        this.number = number;

    }

    public List<Integer> parsingNumber() {
        List<Integer> human = new ArrayList<>();

        String[] strNumbers = number.split("");
        for (String s : strNumbers) {
            human.add(Integer.parseInt(s));
        }

        return human;
    }

    private void numberValidator(String number) {
        if (number.length() != 3) {
            throw new IllegalArgumentException("세자리가 아닙니다.");
        }
    }
}
