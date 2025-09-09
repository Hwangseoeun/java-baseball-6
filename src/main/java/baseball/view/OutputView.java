package baseball.view;

import baseball.model.Numbers;

import static baseball.model.ResultJudger.judgeBallResult;
import static baseball.model.ResultJudger.judgeNothingResult;
import static baseball.model.ResultJudger.judgeStrikeResult;

public class OutputView {

    public static void outputJudgeResult(Numbers answerDigits, Numbers guessedNumberDigits) {

        String ballResult = judgeBallResult(answerDigits, guessedNumberDigits);
        String strikeResult = judgeStrikeResult(answerDigits, guessedNumberDigits);
        String nothingResult = judgeNothingResult(answerDigits, guessedNumberDigits);

        System.out.println(ballResult + strikeResult + nothingResult);
    }
}
