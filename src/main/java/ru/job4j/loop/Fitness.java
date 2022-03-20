package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nik) {
        int month = 0;
        while (nik >= ivan) {
            System.out.println(month);
            if (ivan * 3 > nik * 2) {
                month = month + 1;
            }
        }
            return month;
        }
    }
