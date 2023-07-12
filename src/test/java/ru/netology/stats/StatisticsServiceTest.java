package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatisticsServiceTest {
  

    @Test

    public void testGetAmountAllSales() {
        StatisticsService service = new StatisticsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.getAmountAllSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    public void testGetAverageMonthlySales() {
        StatisticsService service = new StatisticsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.getAverageMonthlySales(sales);
        Assertions.assertEquals(expected, actual);
    }

    public void testGetMonthMaxSales() {
        StatisticsService service = new StatisticsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.getMonthMaxSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    public void testGetMonthMinSales() {
        StatisticsService service = new StatisticsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.getMonthMinSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    public void testGetMonthsBellowAverage() {
        StatisticsService service = new StatisticsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.getMonthsBellowAverage(sales);
        Assertions.assertEquals(expected, actual);
    }

    public void testGetMonthsAboveAverage() {
        StatisticsService service = new StatisticsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.getMonthsAboveAverage(sales);
        Assertions.assertEquals(expected, actual);
    }
}
