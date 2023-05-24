package darek9k.bmicalculator.circle;

import org.springframework.stereotype.Service;

@Service
public class CircleService {

    private final CircleCalculator circleCalculator;

    public CircleService(CircleCalculator circleCalculator) {
        this.circleCalculator = circleCalculator;
    }

    public CircleResponse calculate(double radius) {
        CircleData circleData = circleCalculator.calculate(radius);

        return CircleResponse.from(circleData);
    }
}
