package baseball.model;

import java.util.List;

public class ResultJudger {

    public static String judgeBallResult(List<Integer> answerDigits, List<Integer> guessedNumberDigits) {
        final long ballCount = guessedNumberDigits.stream()
            .filter(number -> answerDigits.contains(number) && answerDigits.indexOf(number) != guessedNumberDigits.indexOf(number))
            .count();

        if(ballCount == 0) {
            return "";
        }

        return ballCount + "볼 ";
    }

    public static String judgeStrikeResult(List<Integer> answerDigits, List<Integer> guessedNumberDigits) {
        final long strikeCount = guessedNumberDigits.stream()
            .filter(number -> answerDigits.contains(number) && answerDigits.indexOf(number) == guessedNumberDigits.indexOf(number))
            .count();

        if(strikeCount == 0) {
            return "";
        }

        return strikeCount + "스트라이크 ";
    }

    public static String judgeNothingResult(List<Integer> answerDigits, List<Integer> guessedNumberDigits) {
        final long strikeCount = guessedNumberDigits.stream()
            .filter(answerDigits::contains)
            .count();

        if(strikeCount != 0) {
            return "";
        }

        return "낫싱";
    }
}
