package darek9k.bmicalculator.bmi;

import darek9k.bmicalculator.BmiNote;

public final class BmiCalculateResponse {
    private final double bmi;
    private final BmiNote bmiNote;

    public BmiCalculateResponse(double bmi, BmiNote bmiNote) {
        this.bmi = bmi;
        this.bmiNote = bmiNote;
    }
    public double getBmi() {
        return bmi;
    }
    public BmiNote getBmiNote() {
        return bmiNote;
    }
    public static BmiCalculateResponse from(BmiCalculation bmiCalculation){
        return new BmiCalculateResponse(bmiCalculation.getBmi(), bmiCalculation.getBmiNote());
    }

}
