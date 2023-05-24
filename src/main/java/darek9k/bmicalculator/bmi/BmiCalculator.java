package darek9k.bmicalculator.bmi;

import darek9k.bmicalculator.BmiNote;
import org.springframework.stereotype.Component;

@Component
class BmiCalculator {
    BmiCalculation calculate(Integer weight, Integer heightInCm){

        double heightInMeters = heightInCm / 100.0;
        double bmi = weight / heightInMeters / heightInMeters;

        BmiNote bmiNote;
        if(bmi>25){
            bmiNote = BmiNote.OVERWEIGHT;
        }else if(bmi<25 && bmi>=20){
            bmiNote = BmiNote.OK;
        }else{
            bmiNote = BmiNote.UNDERWEIGHT;
        }
        System.out.println("BMI :" + bmi);
        System.out.println("BmiNote: " + bmiNote);

        return new BmiCalculation(bmi, bmiNote);
    }
}
