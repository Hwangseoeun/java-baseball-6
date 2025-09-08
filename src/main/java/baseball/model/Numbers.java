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

    public List<Integer> getNumberDigits() {
        return numberDigits;
    }

    private static void validateNumberSize(List<Integer> splitGuessedNumber) {
        Set<Integer> splitGuessedNumbers = new HashSet<>(splitGuessedNumber);

        if(splitGuessedNumbers.size() != ANSWER_SIZE) {
            throw new IllegalArgumentException("잘못된 값입니다.");
        }
    }

    //TODO: 현재 depth 2이기에 1로 줄이는 방법 생각 필요
    private static void validateDigitRange(List<Integer> splitGuessedNumber) {
        for(Integer number : splitGuessedNumber) {
            if(number<MIN_DIGIT || number>MAX_DIGIT) {
                throw new IllegalArgumentException("잘못된 값입니다.");
            }
        }
    }

    public static boolean isGuessedNumberMatchAnswer(Numbers answerDigits, Numbers guessedNumberDigits) {
        List<Integer> answer = answerDigits.getNumberDigits();
        List<Integer> guessedNumber = guessedNumberDigits.getNumberDigits();

        return answer.equals(guessedNumber);
    }
}
