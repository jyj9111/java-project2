package com.example.javaproject2.week7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CMathTest {

    @Test
    void testPrime() {
        assertTrue(CMath.isPrime(2));
        assertTrue(CMath.isPrime(3));
        assertTrue(CMath.isPrime(7));
        assertFalse(CMath.isPrime(10));
    }

    @Test
    void testPerpectionNumber() {
        assertTrue(CMath.isPerpectionNumber(6));
        assertTrue(CMath.isPerpectionNumber(28));
        assertFalse(CMath.isPerpectionNumber(120));
    }

    @Test
    void testFactors() {
        assertEquals("[1, 2, 4, 8]", CMath.factors(16));
    }
}