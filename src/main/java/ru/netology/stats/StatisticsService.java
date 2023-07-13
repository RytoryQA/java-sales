package ru.netology.stats;

public class StatisticsService {
    public int getAmountAllSales(int[] sales) {
        int summa = 0;
        for (int i = 0; i < sales.length; i++) {
            summa = summa + sales[i];
        }
        return summa;
    }

    public int getAverageMonthlySales(int[] sales) {
        int average = 0;
        int summa = getAmountAllSales(sales);
        average = summa / sales.length;
        return average;
    }

    public int getMonthMaxSales(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int getMonthMinSales(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int getMonthsBellowAverage(int[] sales) {
        int monthsBellowAverage = 0;
        int average = getAverageMonthlySales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                monthsBellowAverage += 1;
            }
        }
        return monthsBellowAverage;
    }

    public int getMonthsAboveAverage(int[] sales) {
        int monthsAboveAverage = 0;
        int average = getAverageMonthlySales(sales);
        for (int averageSales : sales) {
            if (averageSales > average) {
                monthsAboveAverage += 1;
            }
        }
        return monthsAboveAverage;
    }
}
