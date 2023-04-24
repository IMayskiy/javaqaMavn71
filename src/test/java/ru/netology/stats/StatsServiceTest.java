package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void findTotalSumSales() {
        StatsService service = new StatsService();
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int expectedSum = 180;
        long actualSum = service.getTotalSumSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void findAverageSumSales() {
        StatsService service = new StatsService();
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int expectedAverage = 15;
        long actualAverage = service.getAverageSumSales(sales);

        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void findMinimumSalesMonth() {
        StatsService service = new StatsService();
            long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
            int expectedMinMonth = 9;
            long actualMinMonth = service.getMinSalesMonth(sales);

        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test
    public void findMaximumSalesMonth() {
        StatsService service = new StatsService();
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int expectedMaxMonth = 8;
        long actualMaxMonth = service.getMaxSalesMonth(sales);

        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    @Test
    public void findMonthsBelowAverage() {
        StatsService service = new StatsService();
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int expectedBelowAverage = 5;
        long actualBelowAverage = service.getMonthsBelowAverage(sales);

        Assertions.assertEquals(expectedBelowAverage, actualBelowAverage);
    }

    @Test
    public void findMonthsAboveAverage() {
        StatsService service = new StatsService();
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int expectedAboveAverage = 5;
        long actualAboveAverage = service.getMonthsAboveAverage(sales);

        Assertions.assertEquals(expectedAboveAverage, actualAboveAverage);
    }


}