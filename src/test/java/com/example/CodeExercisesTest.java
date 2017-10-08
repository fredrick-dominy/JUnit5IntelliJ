package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CodeExercisesTest {
    @Test
    void testGetDisplayName() {
        CodeExercises codeExercises = new CodeExercises("CodeWars Java Tests");
        String displayName = codeExercises.getDisplayName();
        assertEquals("CodeWars Java Tests", displayName);
    }
}