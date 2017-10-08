package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcAverageTests {
    private static final double DELTA = 1e-15;

    @Test
    public void testCalcAve01() {
        assertEquals(1, CalcAverage.find_average(new int[]{1,1,1}), DELTA);
    }

    @Test
    public void testCalcAve02(){
        assertEquals(2,CalcAverage.find_average(new int[]{1,2,3}), DELTA);
    }

    @Test void testCalcAve03() {
        assertEquals(2.5,CalcAverage.find_average(new int[]{1,2,3,4}));
    }

    @Test void testCalcAve04() {
        assertEquals(0,CalcAverage.find_average(new int[]{}));
    }
}
