import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {

    @Test
    // тестирует рвботу с массивом из одного значения

    public void shdCalcTotalSalesWithOneValue() {

        int[] salesByMonths = {15};
        int expectedTotal = 15;

        StatsService salesTotal = new StatsService();
        int actualTotal = salesTotal.calcSalesTotal(salesByMonths);
        Assertions.assertEquals(expectedTotal, actualTotal);
    }

    @Test
    // проверяет корректность округления при подсчётах
    public void shdCalcMeanWithFloor() {

        int[] salesByMonth = {20, 6, 23, 15, 25, 30, 5, 45, 10, 30};
        int expectedMean = 20;
        StatsService meanSales = new StatsService();
        int actualMean = meanSales.calcMonthlySales(salesByMonth);
        Assertions.assertEquals(expectedMean, actualMean);
    }

    @Test
    // проверяет корректность определния месяца максимальных продаж для первого месяца
    public void shdCalcMaxMonthForFirst() {

        int[] salesByMonth = {20, 13, 13, 13, 13};
        int expectedMaxMonth = 1; // т. к. в задании требовалось, чтобы указывался именно последний при наличии нескольких равных
        StatsService maxMonth = new StatsService();
        int actualMaxMonth = maxMonth.calcMaxSalesMonthNmb(salesByMonth);
        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    @Test
    // проверяет корректность определния месяца минимальных продаж для первого месяца
    public void shdCalcMinMonthForFirst() {
        int[] salesByMonth = {10, 14, 14, 14, 14};
        int expectedMinMonth = 1;
        StatsService minMonth = new StatsService();
        int actualMinMonth = minMonth.calcMinSalesMonthNmb(salesByMonth);
        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test
    // проверяет корректность определения числа месяцев с продажами ниже среднего при равных значениях
    public void shdCalcMonthsBelowMeanWithEquals() {
        int[] salesByMonth = {66, 66, 66, 66, 66};
        int expMonthsBelowMean = 0;
        StatsService belowMonths = new StatsService();
        int actMonthsBelowMean = belowMonths.calcMonthsBelowMean(salesByMonth);
        Assertions.assertEquals(expMonthsBelowMean, actMonthsBelowMean);
    }

    @Test
    // проверяет корректность определения числа месяцев с продажами выше среднего при равных значениях
    public void shdCalcMonthsAboveMeanWithEquals() {
        int[] salesByMonth = {300, 300, 300, 300, 300};
        int expMonthsAboveMean = 0;
        StatsService aboveMonths = new StatsService();
        int actMonthsAboveMean = aboveMonths.calcMonthsAboveMean(salesByMonth);
        Assertions.assertEquals(expMonthsAboveMean, actMonthsAboveMean);
    }
}
