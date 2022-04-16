package baseball.domain;

public class Referee {

    public static String sign(BaseBall baseBall) {
        if (baseBall.ball() > 0 && baseBall.strike() > 0) {
            return baseBall.ball() + "볼 " + baseBall.strike() + "스트라이크";
        }
        if (baseBall.strike() > 0) {
            return baseBall.strike() + "스트라이크";
        }
        if (baseBall.ball() > 0) {
            return baseBall.ball() + "볼";
        }
        return "낫싱";
    }
}
