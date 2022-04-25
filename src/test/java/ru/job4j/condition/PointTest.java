package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to20then2() {
        Point a = new Point(0, 2);
        Point b = new Point(0, 0);
        double dist = a.distance(b);
        double expected = 2;
        Assert.assertEquals(expected, 2.0, 0.0);
    }
}