package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3To1Then3() {
        int left = 3;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To2Then2() {
        int left = 2;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenThreeMax3To8To12Then12() {
        Max three = new Max();
        int rsl = three.threeMax(3, 8, 12);
        int expected = 12;
        Assert.assertEquals(rsl, expected);
    }

    @Test
    public void whenfourMax2To7To5To8Then8() {
        Max four = new Max();
        int rsl = four.fourMax(2, 7, 5, 8);
        int expected = 8;
        Assert.assertEquals(rsl, expected);
    }
}