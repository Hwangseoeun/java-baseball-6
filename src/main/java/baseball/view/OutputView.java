package baseball.view;

import baseball.model.Numbers;

import java.util.List;

import static baseball.model.ResultJudger.judgeBallResult;
import static baseball.model.ResultJudger.judgeNothingResult;
import static baseball.model.ResultJudger.judgeStrikeResult;

public class OutputView {

    public static void outputJudgeResult(Numbers answerDigits, Numbers guessedNumberDigits) {

        List<Integer> answer = answerDigits.getNumberDigits();
        List<Integer> guessedNumber = guessedNumberDigits.getNumberDigits();

        String ballResult = judgeBallResult(answer, guessedNumber);
        String strikeResult = judgeStrikeResult(answer, guessedNumber);
        String nothingResult = judgeNothingResult(answer, guessedNumber);

        System.out.println(ballResult + strikeResult + nothingResult);
    }
}
