package com.javatests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ReversedNumArrayTests {
    @Test
    public void reverse35231 () {
        assertArrayEquals(new int[] {1, 3, 2, 5, 3}, ReversedNumArray.digitize(35231));
    }
    @Test
    public void reverse0 () {
        assertArrayEquals(new int[] {0}, ReversedNumArray.digitize(0));
    }
    @Test
    public void reverse35point231 () {
        assertArrayEquals(new int[] {1,2,4,4,4,4,5,3}, ReversedNumArray.digitize((long) 35444421));
    }

}
