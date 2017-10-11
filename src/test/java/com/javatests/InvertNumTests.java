package com.javatests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InvertNumTests {
    @Test
    public void invert0() {
        assertEquals(0, InvertNum.opposite(0));
    }
    @Test
    public void invert1() {
        assertEquals(-1, InvertNum.opposite(1));
    }
    @Test
    public void invertNeg1() {
        assertEquals(1, InvertNum.opposite(-1));
    }
    @Test
    public void invertHuge() {
        assertEquals(-1432423222, InvertNum.opposite(1432423222));
    }
}
