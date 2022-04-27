package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public int max(int left, int right, int third) {
        return max(left, max(right, third));
    }

    public int max(int left, int right, int third, int fourth) {
        return max(left, right, max(right, third, fourth));
    }

    public static void main(String[] args) {
        int res = Max.max(3, 2);
        System.out.println(res);
        Max three = new Max();
        int maxThree = three.max(3, 8, 12);
        System.out.println(maxThree);
        Max four = new Max();
        int fourMax = four.max(2, 7, 5, 8);
        System.out.println(fourMax);
    }
}
