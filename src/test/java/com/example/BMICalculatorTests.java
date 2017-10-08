package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BMICalculatorTests {
    @Test
    public void validateUnderweightBMI(){
        assertEquals("Underweight", BMICalculator.bmi(50,1.80));
    }
    @Test
    public void validateNormalBMI() {
        assertEquals("Normal", BMICalculator.bmi(80, 1.80));
    }
    @Test
    public void validateOverweightBMI(){
        assertEquals("Overweight", BMICalculator.bmi(90,1.80));
    }
    @Test
    public void validateObeseBMI(){
        assertEquals("Obese", BMICalculator.bmi(150,1.80));
    }
    @Test
    public void validateEmptyParams(){
        assertEquals("No parameters sent", BMICalculator.bmi());
    }
}
