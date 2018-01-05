package com.javatests;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CounterTests {

    @Test
    public void test17() {
        boolean[] array1 = {true,  true,  true,  false,
                true,  true,  true,  true ,
                true,  false, true,  false,
                true,  false, false, true ,
                true,  true,  true,  true ,
                false, false, true,  true };
        assertEquals(17, new Counter().countSheeps(array1), "Expected 17 sheep.");
    }

    @Test
    public void test03() {
        boolean[] array1 = {true,  true,  false,  false,
                true,  false,false,false };
        assertEquals(3, new Counter().countSheeps(array1), "Expected 17 sheep.");
    }

    @Test
    public void testNone() {
        boolean[] array1 = {false};
        assertEquals(0, new Counter().countSheeps(array1), "Expected 17 sheep.");
    }

}
