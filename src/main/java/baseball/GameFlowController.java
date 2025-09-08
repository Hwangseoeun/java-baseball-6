package baseball;

import baseball.model.Numbers;
import baseball.view.InputView;

import static baseball.model.Numbers.isGuessedNumberMatchAnswer;
import static baseball.view.OutputView.outputJudgeResult;

public class GameFlowController {

    private final InputView inputView;

    public GameFlowController(InputView inputView) {
        this.inputView = inputView;
    }

    public void gameFlow() {
        System.out.println("숫자 야구 게임을 시작합니다.");

        final Numbers answerDigits = RandomNumberPicker.answerDigits();

        boolean isGameContinue = true;

        while (isGameContinue) {
            final Numbers guessedNumberDigits = inputView.inputGuessedNumber();

            isGameContinue = !isGuessedNumberMatchAnswer(answerDigits, guessedNumberDigits);

            outputJudgeResult(answerDigits, guessedNumberDigits);
        }

        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }
}
