package darek9k.bmicalculator.bmi;

import darek9k.bmicalculator.BmiNote;

final class BmiCalculation {
    private final double bmi;
    private final BmiNote bmiNote;

    public BmiCalculation(double bmi, BmiNote bmiNote) {
        this.bmi = bmi;
        this.bmiNote = bmiNote;
    }

    public double getBmi() {
        return bmi;
    }

    public BmiNote getBmiNote() {
        return bmiNote;
    }
}
