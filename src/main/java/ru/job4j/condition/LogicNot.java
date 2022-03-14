package ru.job4j.condition;

public class LogicNot {

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return !isPositive(num);
    }

    public static boolean notEvenAndPositive(int num) {
        return !isEven(num) && !isPositive(num);
    }

    public static boolean evenOrNotPositive(int num) {
        return isEven(num) || !isPositive(num);
    }

    public static void main(String[] args) {

        boolean num = LogicNot.isEven(2);
        System.out.println(num);
        num = LogicNot.isPositive(2);
        System.out.println(num);
        num = LogicNot.notEven(2);
        System.out.println(num);
        num = LogicNot.notPositive(2);
        System.out.println(num);
        num = LogicNot.notEvenAndPositive(2);
        System.out.println(num);
        num = LogicNot.evenOrNotPositive(2);
        System.out.println(num);

    }

}
