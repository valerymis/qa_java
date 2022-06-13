package com.example;

import org.junit.Assert;
import org.junit.Test;

public class AnimalTest {
    @Test
    public void testGetFoodThrowsException() {
        try {
            Animal animal = new Animal();
            animal.getFood("Млекопитающие");
        } catch (Exception e) {
            Assert.assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", e.getMessage());
        }
    }

    @Test
    public void testGetFamily() {
        Animal animal = new Animal();
        String actual = animal.getFamily();
        Assert.assertEquals(actual, "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи");
    }
}