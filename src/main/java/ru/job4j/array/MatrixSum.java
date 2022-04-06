package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int rsl = 0;
        for (int rov = 0; rov < array.length; rov++) {
            for (int cell = 0; cell < array[rov].length; cell++) {
                rsl += array[rov][cell];
            }
        }
        return rsl;
    }
}
