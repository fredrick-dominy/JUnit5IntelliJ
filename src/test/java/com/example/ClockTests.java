package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClockTests {
    @Test
    void oneMOneS() {
        assertEquals(Clock.Past(0,1,1),61000);
    }
    @Test
    void oneDay() {
        assertEquals(Clock.Past(24,0,0), 86400000);
    }
    @Test
    void threeH15Min33Sec() {
        assertEquals(Clock.Past(3,15,33), 11733000);
    }
}
