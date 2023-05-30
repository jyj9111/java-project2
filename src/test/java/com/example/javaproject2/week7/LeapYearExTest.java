package com.example.javaproject2.week7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearExTest {

    @Test
    void checkLeapYear() {
        assertEquals(false, LeapYearEx.checkLeapYear(1700));
    }
}