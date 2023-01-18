package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long amount = 0;
        for (long sale : sales) {
            amount = amount + sale;
        }
        return amount;
    }

    public Long average(long[] sales) {
        long amount = 0;
        for (long sale : sales) {
            amount = amount + sale;
        }
        return amount / sales.length;

    }

    public int maximumSale(long[] sales) {
        int maximumMonth = 0;
        long maximumSale = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maximumSale) {
                maximumMonth = i;
                maximumSale = sales[i];
            }
        }
        return maximumMonth + 1;
    }

    public int minimumSale(long[] sales) {
        int minimumMonth = 0;
        long minimumSale = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= minimumSale) {
                minimumMonth = i;
                minimumSale = sales[i];
            }
        }
        return minimumMonth + 1;
    }

    public int monthBelowAverage(long[] sales) {
        int counter = 0;
        for (Long sale : sales) {
            if (sale < average(sales)) {
                counter++;
            }
        }
        return counter;
    }

    public int monthHigherAverage(long[] sales) {
        int counter = 0;
        for (Long sale : sales) {
            if (sale > average(sales)) {
                counter++;
            }
        }
        return counter;
    }
}