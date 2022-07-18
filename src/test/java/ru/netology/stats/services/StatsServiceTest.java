package ru.netology.stats.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void sum() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 180;
        int actual = service.sumSales(sales);

        Assertions.assertEquals(expectedSum, actual);
    }

    @Test
    public void sumMiddle() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMiddle = 15;
        int actual = service.middleSum(sales);

        Assertions.assertEquals(expectedMiddle, actual);
    }

    @Test
    public void maxMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 7;
        int actual = service.getMaxMonth(sales);

        Assertions.assertEquals(expectedMonth, actual);
    }

    @Test
    public void minMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 8;
        int actual = service.getMinMonth(sales);

        Assertions.assertEquals(expectedMonth, actual);

    }

    @Test
    public void lowMiddle() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMiddle = 5;
        int actual = service.lowMiddleSum(sales);

        Assertions.assertEquals(expectedMiddle, actual);
    }

    @Test
    public void AfterMiddle() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMiddle = 5;
        int actual = service.AfterMiddleSum(sales);

        Assertions.assertEquals(expectedMiddle, actual);
    }

}



