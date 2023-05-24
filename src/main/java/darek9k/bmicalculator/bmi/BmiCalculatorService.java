package darek9k.bmicalculator.bmi;

import org.springframework.stereotype.Service;

@Service
class BmiCalculatorService {
    private final BmiCalculator bmiCalculator;

    public BmiCalculatorService(BmiCalculator bmiCalculator) {
        this.bmiCalculator = bmiCalculator;
    }

    BmiCalculateResponse calculate(Integer weight, Integer heightInCm) {

        BmiCalculation calculation = bmiCalculator.calculate(weight, heightInCm);

        return BmiCalculateResponse.from(calculation);
    }
}
