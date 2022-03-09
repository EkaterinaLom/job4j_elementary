package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        double first = x2 - x1;
        double second = y2 - y1;
        double third = Math.pow(first, 2);
        double fourth = Math.pow(second, 2);
        double fifth = third + fourth;
        double rsl = Math.sqrt(fifth);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        double result2 = Point.distance(2, 4, 3, 7);
        System.out.println("result (0, 0) to (2, 0) " + result);
        System.out.println("result2 (2, 4) to (3, 7) " + result2);
    }
}
