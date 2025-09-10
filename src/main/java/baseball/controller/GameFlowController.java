package baseball.controller;

import baseball.model.RandomNumberPicker;
import baseball.dto.JudgeResultCountDto;
import baseball.model.Numbers;
import baseball.view.InputView;
import baseball.view.OutputView;

public class GameFlowController {

    private final InputView inputView;
    private final OutputView outputView;

    public GameFlowController(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void gameFlow() {
        System.out.println("숫자 야구 게임을 시작합니다.");

        final Numbers answerDigits = RandomNumberPicker.answerDigits();

        boolean isGameContinue = true;

        while (isGameContinue) {
            final Numbers guessedNumberDigits = inputView.inputGuessedNumber();

            isGameContinue = !Numbers.isGuessedNumberMatchAnswer(answerDigits, guessedNumberDigits);

            final JudgeResultCountDto judgeResultCount = answerDigits.judgeResultCount(guessedNumberDigits);

            outputView.outputJudgeResult(judgeResultCount);
        }

        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }
}
