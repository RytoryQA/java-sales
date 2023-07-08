package ru.netology.stats;

public class Main {
    int[] sales = new int[12];

    public static void main(String[] args) {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 180;
        int actual = service.calculate1(sales);
        System.out.println("1. " + expected + " == ? == " + actual);


        expected = 15;
        actual = service.calculate2(sales);
        System.out.println("2. " + expected + " == ? == " + actual);

        expected = 8;
        actual = service.calculate3(sales);
        System.out.println("3. " + expected + " == ? == " + actual);

        expected = 9;
        actual = service.calculate4(sales);
        System.out.println("4. " + expected + " == ? == " + actual);

        expected = 5;
        actual = service.calculate5(sales);
        System.out.println("5. " + expected + " == ? == " + actual);

        expected = 5;
        actual = service.calculate6(sales);
        System.out.println("6. " + expected + " == ? == " + actual);

    }
}
