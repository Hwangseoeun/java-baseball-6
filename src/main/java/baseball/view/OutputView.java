package baseball.view;

import baseball.dto.JudgeResultCountDto;
import baseball.model.JudgeResultMessage;

public class OutputView {

    public void outputJudgeResult(JudgeResultCountDto judgeResultCount) {

        if(judgeResultCount.ballCount() == 0 && judgeResultCount.strikeCount() == 0) {
            System.out.print(JudgeResultMessage.NOTHING.getMessage());
        }

        if(judgeResultCount.ballCount() > 0) {
            System.out.print(judgeResultCount.ballCount() + JudgeResultMessage.BALL.getMessage() + " ");
        }

        if(judgeResultCount.strikeCount() > 0) {
            System.out.print(judgeResultCount.strikeCount() + JudgeResultMessage.STRIKE.getMessage() + " ");
        }

        System.out.println();
    }
}
