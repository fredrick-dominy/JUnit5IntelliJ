package com.javatests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumWOHighLowTests {
    @Test
    public void BasicTests() {
        assertEquals(16, SumWOHighLow.sum(new int[] { 6, 2, 1, 8, 10}));
    }
    @Test
    public void testOfOne() {
        assertEquals(0, SumWOHighLow.sum(new int[] { 6 }));
    }
    @Test
    public void testOfThree() {
        assertEquals(2, SumWOHighLow.sum(new int[] { 1,2,3 }));
    }
    @Test
    public void testOfFourNeg() {
        assertEquals(3, SumWOHighLow.sum(new int[] { 1,2,3,-2 }));
    }
    @Test
    public void testOfSixNeg() {
        assertEquals(4, SumWOHighLow.sum(new int[] { 1,2,-5,3,-2,8 }));
    }
    @Test
    public void testOfNullArray() {
        assertEquals(0, SumWOHighLow.sum(null));
    }
}
