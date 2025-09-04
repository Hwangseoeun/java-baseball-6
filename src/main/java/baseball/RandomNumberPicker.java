package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RandomNumberPicker {

    public static List<Integer> answerDigits() {
        Set<Integer> answerDigits = new HashSet<>();

        while (answerDigits.size() < 3) {
            answerDigits.add(pickRandomNumber());
        }

        return new ArrayList<>(answerDigits);
    }

    private static int pickRandomNumber() {
        return Randoms.pickNumberInRange(1,9);
    }
}
