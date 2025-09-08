package baseball.view;

import baseball.model.Numbers;
import camp.nextstep.edu.missionutils.Console;

import java.util.Arrays;
import java.util.List;

public class InputView {
    public Numbers inputGuessedNumber() {
        System.out.print("숫자를 입력해주세요 : ");
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

    public int inputChooseGameRestart() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

        return Integer.parseInt(Console.readLine());
    }
}
