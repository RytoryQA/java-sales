package ru.netology.stats;

public class StatsService {
    int sum = 0; // сумма всех элементов
    int average = 0; // среднее арифметическое элементов массива


    public int calculate1(int[] sales) {

        for (int s : sales) {
            sum += s;
        }
        return sum;
    }

    public int calculate2(int[] sales) {

        average = sum / sales.length;
        return average;
    }

    public int calculate3(int[] sales) {
        int maxMonth = 0; // номер месяца максимальных продаж
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int calculate4(int[] sales) {
        int minMonth = 0; // номер месяца минимальных продаж
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int calculate5(int[] sales) {
        int monthsBellowAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                monthsBellowAverage += 1;
            }
        }
        return monthsBellowAverage;
    }

    public int calculate6(int[] sales) {
        int monthAboveAverage = 0;
        for (int a : sales) {
            if (a > average) {
                monthAboveAverage += 1;
            }
        }
        return monthAboveAverage;
    }
}
