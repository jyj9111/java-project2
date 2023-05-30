package com.example.javaproject2.week7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearExTest {

    @Test
    void checkLeapYear() {
        assertEquals(false, LeapYearEx.checkLeapYear(1700));
    }
    @Test
    void testLeapYear() {
        assertEquals(true, LeapYearEx.isLeapYear(2020));
        assertEquals(false, LeapYearEx.isLeapYear(1900));
        assertEquals(true, LeapYearEx.isLeapYear(2400));
    }
}