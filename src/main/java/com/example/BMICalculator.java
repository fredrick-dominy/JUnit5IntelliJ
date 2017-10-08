package com.example;

/*
*
* Write function bmi that calculates body mass index (bmi = weight / height ^ 2).
*   if bmi <= 18.5 return "Underweight"
*   if bmi <= 25.0 return "Normal"
*   if bmi <= 30.0 return "Overweight"
*   if bmi > 30 return "Obese"
*
*   */

public class BMICalculator {

    public static String bmi() {
        return "No parameters sent";
    }

    public static String bmi(double weight, double height)  {
        String verdict;

        double bmiNum = weight/Math.pow(height, 2);
        if(bmiNum > 30) {
            verdict = "Obese";
        } else if(bmiNum > 25) {
            verdict = "Overweight";
        } else if (bmiNum > 18.5) {
            verdict = "Normal";
        } else {
            verdict = "Underweight";
        }
        return verdict;
    }
}
