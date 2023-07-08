package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test

    public void testGetAmountAllSales() {
        StatsService service = new StatsService();

        int expected = 180;
        int actual = service.calculate1(sales);
        Assertions.assertEquals(expected, actual);
    }

    public void testGetAverageMonthlySales() {
        StatsService service = new StatsService();

        int expected = 15;
        int actual = service.calculate2(sales);
        Assertions.assertEquals(expected, actual);
    }

    public void testGetNumberMonthSalesMaxAmount() {
        StatsService service = new StatsService();

        int expected = 8;
        int actual = service.calculate3(sales);
        Assertions.assertEquals(expected, actual);
    }

    public void testGetNumberMonthSalesMinAmount() {
        StatsService service = new StatsService();

        int expected = 9;
        int actual = service.calculate4(sales);
        Assertions.assertEquals(expected, actual);
    }

    public void testGetQuantityMonthsWhereSalesBellowAverageMonthly() {
        StatsService service = new StatsService();

        int expected = 5;
        int actual = service.calculate5(sales);
        Assertions.assertEquals(expected, actual);
    }

    public void testGetQuantityMonthsWhereSalesAboveAverageMonthly() {
        StatsService service = new StatsService();

        int expected = 5;
        int actual = service.calculate6(sales);
        Assertions.assertEquals(expected, actual);
    }
}
