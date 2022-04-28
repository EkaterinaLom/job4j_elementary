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

    @Test
    public void when204to406then4() {
        Point a = new Point(2, 0, 4);
        Point b = new Point(4, 0, 6);
        double dist = a.distance3d(b);
        double expected = 4;
        Assert.assertEquals(expected, 4.0, 0.0);
    }
}