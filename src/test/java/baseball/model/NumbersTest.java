package baseball.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class NumbersTest {

    private static Numbers createNumbers(List<Integer> numberDigits) {
        return new Numbers(
            numberDigits
        );
    }

    @DisplayName("생성자에 유효한 입력값(숫자 리스트)을 입력하면 Numbers 인스턴스가 생성된다.")
    @Test
    void createNumbersSuccess() {
        //Given
        final List<Integer> numberDigits = List.of(1, 2, 3);

        //When & Then
        assertThatCode(() -> new Numbers(
            numberDigits
        ))
        .doesNotThrowAnyException();
    }

    @DisplayName("두 값이 일치하면 true를 반환한다.")
    @Test
    void returnTrueWhenNumbersIsMatch() {
        //Given
        final List<Integer> answer = List.of(1, 2, 3);
        final List<Integer> guessedNumber = List.of(1, 2, 3);

        Numbers numbers1 = createNumbers(answer);
        Numbers numbers2 = createNumbers(guessedNumber);

        //When
        final boolean match = Numbers.isGuessedNumberMatchAnswer(numbers1, numbers2);

        // Then
        assertThat(match).isTrue();
    }

    @DisplayName("두 값이 일치하지 않으면 false 반환한다.")
    @Test
    void returnFalseWhenNumbersIsNotMatch() {
        //Given
        final List<Integer> answer = List.of(1, 2, 3);
        final List<Integer> guessedNumber = List.of(9, 8, 7);

        Numbers numbers1 = createNumbers(answer);
        Numbers numbers2 = createNumbers(guessedNumber);

        //When
        final boolean match = Numbers.isGuessedNumberMatchAnswer(numbers1, numbers2);

        // Then
        assertThat(match).isFalse();
    }

    @DisplayName("생성자 입력값에 숫자가 3개 초과로 들어오면 예외가 발생한다.")
    @Test
    void throwExceptionWhenNumberDigitsSizeIsOver() {
        //Given
        final List<Integer> numberDigits = List.of(1, 2, 3, 4);

        //When & Then
        assertThatThrownBy(() -> createNumbers(numberDigits))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("잘못된 값입니다.");
    }

    @DisplayName("생성자 입력값으로 들어온 숫자가 1~9 이내가 아니면 예외가 발생한다.")
    @Test
    void throwExceptionWhenNumberDigitsRangeIsOver() {
        //Given
        final List<Integer> numberDigits = List.of(0, 10, 11);

        //When & Then
        assertThatThrownBy(() -> createNumbers(numberDigits))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("잘못된 값입니다.");
    }
}
