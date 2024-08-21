package io.github.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Math Utility Tests")
class MathUtilTest {

    @Test
    @DisplayName("Adds 4 and 1")
    void should_add_two_numbers() {
        int actual = MathUtil.add(4, 1);
        assertEquals(5, actual);
    }

    @Test
    @DisplayName("Subtracts 4 and 1")
    void should_subtract_two_numbers() {
        int actual = MathUtil.subtract(4, 1);
        assertEquals(2, actual);
    }

}