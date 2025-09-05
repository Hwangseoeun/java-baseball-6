package baseball.view;

import baseball.model.Numbers;
import camp.nextstep.edu.missionutils.Console;

import java.util.Arrays;
import java.util.List;

public class InputView {
    public Numbers inputGuessedNumber() {
        final String guessedNumber = Console.readLine();

        return splitNumber(guessedNumber);
    }

    private Numbers splitNumber(String answer) {
        List<Integer> guessedNumber = Arrays.stream(answer.split(""))
            .mapToInt(Integer::parseInt)
            .boxed()
            .toList();

        return new Numbers(guessedNumber);
    }
}
