package ru.netology.stats;

public class SalesByMonthsTotalService {
    // подсчитывает сумму всех значений в массиве
    public int calcSalesTotal(int[] salesByMonths) {

       /* int[] salesByMonths = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };*/
        int arrayPosition = 0; // показывает номер перебираемой ячейки в массиве
        int currentTotal = 0; // показывает текущий результат сложения продаж по месяцам

        for (int iterSalesByMonths : salesByMonths) {
            if (arrayPosition <= salesByMonths.length) {
                currentTotal = (currentTotal + salesByMonths[arrayPosition]);
                arrayPosition = arrayPosition + 1;
                // System.out.println("Перебираемое значение: " + currentTotal); данная строчка добавлена для контроля выполнения
            }
        }
        return currentTotal;
    }
}
