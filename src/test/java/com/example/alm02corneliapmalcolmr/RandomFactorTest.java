package com.example.alm02corneliapmalcolmr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomFactorTest {
    RandomFactor rf = new RandomFactor();

    @Test
    void randomStringFromLastName() {
        assertEquals(rf.randomStringFromLastName("Rudhag"), "your neighbors cat ");
        assertEquals(rf.randomStringFromLastName("Persson"), "your neighbors cat ");
        assertEquals(rf.randomStringFromLastName(""), "you ");
        assertEquals(rf.randomStringFromLastName("Hunchback"), "your secret lover ");
        assertEquals(rf.randomStringFromLastName("Bilbo"), "your prison cellmate ");
        assertEquals(rf.randomStringFromLastName("Bob"), "your pole dancing teacher ");
    }

    @Test
    void randomStringFromCurrentPartners() {
        for (int i = 0; i < 100 ; i++) {
        System.out.println(rf.randomStringFromCurrentPartners(2));
        }
    }

    @Test
    void randomStringFromZodiacSign(){
        for (int i = 0; i < 100 ; i++) {
            System.out.println(rf.randomStringFromZodiacSign("vaduren"));
        }
    }
}