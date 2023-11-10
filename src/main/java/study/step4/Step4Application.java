package study.step4;

import java.util.List;

import static study.step4.InputView.requestRule;
import static study.step4.ResultView.getWinners;
import static study.step4.ResultView.show;

public class Step4Application {

    public static void main(String[] args) {
        Racing racing = new Racing(new RandomNumberGenerator());
        Rule rule = requestRule();
        List<Car> result = racing.run(rule);
        show(getWinners(result));
    }
}
