package baseball;

import baseball.domain.BaseBall;
import baseball.domain.Referee;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class RefereeTest {

    @DisplayName("심판의 콜사인을 테스트")
    @ParameterizedTest
    @CsvSource({"3,0,3스트라이크","1,2,2볼 1스트라이크","0,0,낫싱","0,3,3볼"})
    void refereeCallSign(int strike, int ball, String expected) {
        BaseBall result = new BaseBall(strike, ball);
        String actual = Referee.sign(result);

        assertThat(actual).isEqualTo(expected);
    }
}

