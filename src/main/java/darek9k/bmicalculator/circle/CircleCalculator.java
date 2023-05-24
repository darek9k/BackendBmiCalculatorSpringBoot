package darek9k.bmicalculator.circle;

import org.springframework.stereotype.Component;

@Component
class CircleCalculator {
    CircleData calculate(double radius){
        double field = Math.PI * radius * radius;
        double perimeter = 2 * Math.PI * radius;

        return new CircleData(field, perimeter);
    }
}
