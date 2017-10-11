package com.javatests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CockroachTests {
    @Test
    public void speed0() throws Exception {
        Cockroach cockroach = new Cockroach();
        assertEquals(0, cockroach.cockroachSpeed(0));
    }
    @Test
    public void speed108() throws Exception {
        Cockroach cockroach = new Cockroach();
        assertEquals(30, cockroach.cockroachSpeed(1.08));
    }
    @Test
    public void speed109() throws Exception {
        Cockroach cockroach = new Cockroach();
        assertEquals(30, cockroach.cockroachSpeed(1.09));
    }
}
