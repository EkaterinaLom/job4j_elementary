package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return  rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float expected2 = 2.3333333f;
        float out2 = Converter.rubleToDollar(in);
        boolean passed2 = expected2 == out2;
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        System.out.println(" 140 rubles are 2.3333333. Test result : " + passed2);
    }
}
