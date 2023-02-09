package ru.netology.stats;

public class Main {
    public static void main(String[] args) {
        // собственно инициализация нашего массива
        int[] salesByMonths = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        // ПУНКТ 1 - сумма всех продаж
        StatsService soldOverall = new StatsService();
        int totalSum = soldOverall.calcSalesTotal(salesByMonths);
        System.out.println("Общая сумма продаж составляет " + totalSum);

        // ПУНКТ 2 - средняя сумма продаж в месяц
        StatsService averageSoldPerMonth = new StatsService();
        int meanSales = averageSoldPerMonth.calcMonthlySales(salesByMonths);
        System.out.println("В среднем в месяц продаётся " + meanSales + " *Родин*");

        // ПУНКТ 3 - номер месяца с максимальными продажами
        StatsService monthMaxNmb = new StatsService();
        int maxSoldIn = monthMaxNmb.calcMaxSalesMonthNmb(salesByMonths);
        System.out.println("Максимальные продажи были в(о) " + maxSoldIn + " месяце");

        // ПУНКТ 4 - номер месяца с минимальными продажами
        StatsService monthMinNmb = new StatsService();
        int minSoldIn = monthMinNmb.calcMinSalesMonthNmb(salesByMonths);
        System.out.println("Минимальные продажи были в(о) " + minSoldIn + " месяце");

        // ПУНКТ 5 - число месяцев с продажами НИЖЕ среднего
        StatsService mthsBelowMeanNmb = new StatsService();
        int belowMeanTotal = mthsBelowMeanNmb.calcMonthsBelowMean(salesByMonths);
        System.out.println("Всего месяцев с продажами ниже среднего было: " + belowMeanTotal);

        // ПУНКТ 6 - число месяцев с продажами ВЫШЕ среднего
        StatsService mthsAboveMeanNmb = new StatsService();
        int aboveMeanTotal = mthsAboveMeanNmb.calcMonthsAboveMean(salesByMonths);
        System.out.println("Всего месяцев с продажами выше среднего было: " + aboveMeanTotal);
    }
}