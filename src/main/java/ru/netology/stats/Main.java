package ru.netology.stats;

public class Main {
    int[] sales = new int[12];

    public static void main(String[] args) {
        StatisticsService service = new StatisticsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 180;
        int actual = service.getAmountAllSales(sales);
        System.out.println("1. " + expected + " == ? == " + actual);


        expected = 15;
        actual = service.getAverageMonthlySales(sales);
        System.out.println("2. " + expected + " == ? == " + actual);

        expected = 8;
        actual = service.getMonthMaxSales(sales);
        System.out.println("3. " + expected + " == ? == " + actual);

        expected = 9;
        actual = service.getMonthMinSales(sales);
        System.out.println("4. " + expected + " == ? == " + actual);

        expected = 5;
        actual = service.getMonthsBellowAverage(sales);
        System.out.println("5. " + expected + " == ? == " + actual);

        expected = 5;
        actual = service.getMonthsAboveAverage(sales);
        System.out.println("6. " + expected + " == ? == " + actual);

    }
}
