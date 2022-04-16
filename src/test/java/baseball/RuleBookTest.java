package baseball;

import baseball.domain.RuleBook;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EmptySource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RuleBookTest {

    @DisplayName("입력된 값이 룰을 준수하는 값인지 테스트")
    @ParameterizedTest
    @CsvSource({"123","456","789","346","428"})
    void ruleFalseTest(String number) {
        boolean actual = RuleBook.validateRule(number);

        assertThat(actual).isFalse();
    }

    @DisplayName("입력된 값이 룰을 위반하는 값인지 테스트")
    @ParameterizedTest
    @CsvSource({"a12","112","998","각32","1234"})
    @EmptySource
    void ruleTrueTest(String number) {
        assertThrows(IllegalArgumentException.class, () -> RuleBook.validateRule(number));
    }
}
