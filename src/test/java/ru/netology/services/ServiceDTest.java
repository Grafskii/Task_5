package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceDTest {

    @Test
    public void countRestMonthsCase1 () {
        ServiceD serviceD = new ServiceD();

       int actual = serviceD.calculate(10_000, 3_000, 20_000);
       int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countRestMonthsCase2() {
        ServiceD serviceD = new ServiceD();

        int actual = serviceD.calculate(100_000, 60_000, 150_000);
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }

}