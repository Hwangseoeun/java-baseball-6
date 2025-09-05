package baseball.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Numbers {

    private final static int ANSWER_SIZE = 3;
    private final static int MIN_DIGIT = 1;
    private final static int MAX_DIGIT = 9;

    List<Integer> numberDigits;

    public Numbers(final List<Integer> numberDigits) {
        validateNumberSize(numberDigits);
        validateDigitRange(numberDigits);

        this.numberDigits = numberDigits;
    }

    private static void validateNumberSize(List<Integer> splitGuessedNumber) {
        Set<Integer> splitGuessedNumbers = new HashSet<>(splitGuessedNumber);

        if(splitGuessedNumbers.size() != ANSWER_SIZE) {
            throw new IllegalArgumentException("잘못된 값입니다.");
        }
    }

    private static void validateDigitRange(List<Integer> splitGuessedNumber) {
        for(Integer number : splitGuessedNumber) {
            if(number<MIN_DIGIT || number>MAX_DIGIT) {
                throw new IllegalArgumentException("잘못된 값입니다.");
            }
        }
    }
}
