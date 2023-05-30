package com.example.javaproject2.week7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Game369Test {

    @Test
    void game369() {
        assertEquals("****",Game369.is369(3333));
        assertEquals("***",Game369.is369(369));
    }
}