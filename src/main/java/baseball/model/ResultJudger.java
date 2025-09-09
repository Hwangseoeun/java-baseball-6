package baseball.model;

import java.util.List;

public class ResultJudger {

    public static String judgeBallResult(Numbers answerDigits, Numbers guessedNumberDigits) {

        final List<Integer> answer = answerDigits.getNumberDigits();
        final List<Integer> guessedNumber = guessedNumberDigits.getNumberDigits();

        final long ballCount = guessedNumber.stream()
            .filter(number -> answer.contains(number) && answer.indexOf(number) != guessedNumber.indexOf(number))
            .count();

        if(ballCount == 0) {
            return "";
        }

        return ballCount + ResultType.BALL.getMessage() + " ";
    }

    public static String judgeStrikeResult(Numbers answerDigits, Numbers guessedNumberDigits) {

        final List<Integer> answer = answerDigits.getNumberDigits();
        final List<Integer> guessedNumber = guessedNumberDigits.getNumberDigits();

        final long strikeCount = guessedNumber.stream()
            .filter(number -> answer.contains(number) && answer.indexOf(number) == guessedNumber.indexOf(number))
            .count();

        if(strikeCount == 0) {
            return "";
        }

        return strikeCount + ResultType.STRIKE.getMessage() + " ";
    }

    public static String judgeNothingResult(Numbers answerDigits, Numbers guessedNumberDigits) {

        final List<Integer> answer = answerDigits.getNumberDigits();
        final List<Integer> guessedNumber = guessedNumberDigits.getNumberDigits();

        final long strikeCount = guessedNumber.stream()
            .filter(answer::contains)
            .count();

        if(strikeCount != 0) {
            return "";
        }

        return ResultType.NOTHING.getMessage();
    }
}
