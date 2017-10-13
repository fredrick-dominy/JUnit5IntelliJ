package com.javatests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NoZerosForHerosTests {

    private static void testing(int actual, int expected) {
        assertEquals(expected, actual);
    }

    @Test
    public void test1() {
        System.out.println("Fixed Tests: noBoringZeros");
        testing(NoZerosForHeros.noBoringZeros(1450), 145);
    }
    @Test
    public void test2(){
        testing(NoZerosForHeros.noBoringZeros(960000), 96);
    }
    @Test
    public void test3(){
        testing(NoZerosForHeros.noBoringZeros(1050), 105);
    }
    @Test
    public void test4(){
        testing(NoZerosForHeros.noBoringZeros(-1050), -105);
    }
    @Test
    public void test5(){
        testing(NoZerosForHeros.noBoringZeros(0), 0);
    }
}


