package com.javatests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AgeRangeCompatabilityCalculatorTests {
    @Test
    public void fifteenTwenty() {
        Assertions.assertEquals("15-20", AgeRangeCompatabilityCalculator.datingRange(17));
    }
    @Test
    public void tsss() {
        assertEquals("27-66",AgeRangeCompatabilityCalculator.datingRange(40));
    }
    @Test
    public void frtnsxtn() {
        assertEquals("14-16",AgeRangeCompatabilityCalculator.datingRange(15));
    }
    @Test
    public void twfrftysx() {
        assertEquals("24-56",AgeRangeCompatabilityCalculator.datingRange(35));
    }
    @Test
    public void nnllvn() {
        assertEquals("9-11",AgeRangeCompatabilityCalculator.datingRange(10));
    }
}
