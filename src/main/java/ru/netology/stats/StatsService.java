package ru.netology.stats;

public class StatsService {

    public int getTotalSumSales(long[] sales) { //сумма всех продаж
        int sumSales = 0;
        for (int i = 0; i < sales.length; i++) {
            sumSales += sales[i];
        }
        return sumSales;
    }

    public int getAverageSumSales(long[] sales) { //средняя сумма продаж
        int totalSum = getTotalSumSales(sales);
        return totalSum / sales.length;
    }

    public int getMinSalesMonth(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }
        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int getMaxSalesMonth(long[] sales) { //месяц с максимальными продажами
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int getMonthsBelowAverage(long[] sales) { //количество месяцев, в которых продажи были ниже среднего
        int averageSum = getAverageSumSales(sales);
        int month = 0;
        for (long i : sales) {
            if (i < averageSum) {
                month = month +1;
            }
        }
        return month;
    }

    public int getMonthsAboveAverage(long[] sales) { //количество месяцев, в которых продажи были выше среднего
        int averageSum = getAverageSumSales(sales);
        int month = 0;
        for (long i : sales) {
            if (i > averageSum) {
                month = month +1;
            }
        }
        return month;
    }


}
