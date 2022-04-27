package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public int threeMax(int left, int right, int third) {
        return max(left, max(right, third));
    }

    public int fourMax(int left, int right, int third, int fourth) {
        return threeMax(left, right, threeMax(right, third, fourth));
    }

    public static void main(String[] args) {
        int res = Max.max(3, 2);
        System.out.println(res);
        Max three = new Max();
        int threeMax = three.threeMax(3, 8, 12);
        System.out.println(threeMax);
        Max four = new Max();
        int fourMax = four.fourMax(2, 7, 5, 8);
        System.out.println(fourMax);
    }
}
