package com.example;

import junit.framework.TestCase;
import org.junit.Test;

public class CatTest extends TestCase {

    @Test
    public void testGetSound() {
        Cat cat = new Cat(new Feline());
        String expected = "Мяу";
        String actual = cat.getSound();
        assertEquals(expected, actual);
    }
}

