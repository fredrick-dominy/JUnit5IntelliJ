package com.javatests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmashWordsTests {

    @Test
    public void validate() {
        assertEquals("Bilal Djaghout", SmashWords.smash(new String[] { "Bilal", "Djaghout" }));
    }

    @Test
    public void validateNewString() {
        assertEquals("Fredrick Dominy", SmashWords.smash(new String[] { "Fredrick", "Dominy" }));
    }

    @Test
    public void validateEmpty() {
        assertEquals("", SmashWords.smash(new String[] {}));
    }
}
