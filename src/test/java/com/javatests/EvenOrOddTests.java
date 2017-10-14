package com.javatests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvenOrOddTests {
    EvenOrOdd eoo = new EvenOrOdd();

    @Test
    public void testEven() {
        assertEquals(eoo.even_or_odd(6), "Even");

    }
    @Test
    public void testOdd() {
        assertEquals(eoo.even_or_odd(7), "Odd");
    }
    @Test
    public void testOddNeg() {
        assertEquals(eoo.even_or_odd(-7), "Odd");
    }
    @Test
    public void testZero() {
        assertEquals(eoo.even_or_odd(0), "Even");

    }
    @Test
    public void testNegTwo() {
        assertEquals(eoo.even_or_odd(-2), "Even");

    }
}
