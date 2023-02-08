package ru.netology.stats;

public class MonthsAboveMeanService {
    public int calcMonthsAboveMean(int[] salesByMonths) {

        int arrayPosition = 0; // показывает номер перебираемой ячейки в массиве
        int currentTotal = 0; // показывает текущий результат сложения продаж по месяцам

        for (int iterSalesByMonths : salesByMonths) {
            if (arrayPosition <= salesByMonths.length) {
                currentTotal = (currentTotal + salesByMonths[arrayPosition]);
                arrayPosition = arrayPosition + 1;
                // System.out.println("Перебираемое значение: " + currentTotal); данная строчка добавлена для контроля выполнения
            }
        }
        arrayPosition = 0;
        int meanSalesHic = (currentTotal / salesByMonths.length); // на всякий случай назовём переменную по-другому во избежание путаницы
        int monthsAboveMean = 0; // сохраняет число месяцев с продажами выше среднего

        for (int iterSalesByMonths : salesByMonths) {
            if (arrayPosition <= salesByMonths.length) {
                if (iterSalesByMonths > meanSalesHic) {
                    monthsAboveMean = monthsAboveMean + 1;
                    // System.out.println("Всего месяцев с продажами выше среднего: " + monthsAboveMean);
                    arrayPosition = arrayPosition + 1;
                } else {
                    arrayPosition = arrayPosition + 1;
                }
            }
        }
        return monthsAboveMean;
    }
}
