package ru.netology.stats;

public class MeanSalesPerMonthService {

    public int calcMonthlySales(int[] salesByMonths) {

    int arrayPosition = 0; // показывает номер перебираемой ячейки в массиве
    int currentTotal = 0; // показывает текущий результат сложения продаж по месяцам

        for (int iterSalesByMonths : salesByMonths) {
        if (arrayPosition <= salesByMonths.length) {
            currentTotal = (currentTotal + salesByMonths[arrayPosition]);
            arrayPosition = arrayPosition + 1;
            // System.out.println("Перебираемое значение: " + currentTotal); данная строчка добавлена для контроля выполнения
        }
    }
        return (currentTotal / salesByMonths.length); // а почему я должен делать этот пункт НЕ копипастом?
}
}
