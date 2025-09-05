package baseball;

import baseball.model.Numbers;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RandomNumberPicker {

    public static Numbers answerDigits() {
        Set<Integer> answerDigits = new HashSet<>();

        while (answerDigits.size() < 3) {
            answerDigits.add(pickRandomNumber());
        }

        final List<Integer> numbers = new ArrayList<>(answerDigits);

        return new Numbers(numbers);
    }

    private static int pickRandomNumber() {
        return Randoms.pickNumberInRange(1,9);
    }
}
