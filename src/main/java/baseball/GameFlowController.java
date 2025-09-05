package baseball;

import baseball.model.Numbers;
import baseball.view.InputView;

public class GameFlowController {

    private final InputView inputView;

    public GameFlowController(InputView inputView) {
        this.inputView = inputView;
    }

    public void gameFlow() {
        System.out.println("숫자 야구 게임을 시작합니다.");

        final Numbers answerDigits = RandomNumberPicker.answerDigits();
        final Numbers guessedNumberDigits = inputView.inputGuessedNumber();
    }
}
