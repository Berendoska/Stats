package ru.netology.stats.services;

public class StatsService {
    public int sumSales(int[] sales) {
        int[] arr = new int[11];
        int sum = sales[0] + sales[1] + sales[2] + sales[3] + sales[4] + sales[5] + sales[6] + sales[7] + sales[8]
                + sales[9] + sales[10] + sales[11];
        return sum;
    }

    public int middleSum(int[] sales) {
        int middle = sumSales(sales) / 12;
        return middle;
    }

    public int getMaxMonth(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth;
    }


    public int getMinMonth(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth;
    }

    public int lowMiddleSum(int[] sales) {
        int middle = middleSum(sales);
        int count = 0;
        for (int sale : sales) {
           if (sale < middle) {
                count++;
            }
        }
       return count;
   }
    public int AfterMiddleSum(int[] sales) {
        int middle = middleSum(sales);
        int count = 0;
        for (int sale : sales) {
            if (sale > middle) {
                count++;
            }
        }
        return count;
    }

}



















