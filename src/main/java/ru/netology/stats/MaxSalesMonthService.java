package ru.netology.stats;

public class MaxSalesMonthService {

    public int calcMaxSalesMonthNmb(int[] salesByMonths) {

        int arrayPosition = 0; // показывает номер перебираемой ячейки в массиве
        int currentMax = salesByMonths[0]; // сохраняет максимальное значение из всех перебранных на текущей итерации
        int maxSalesMonth = 0; // сохраняет номер месяца с максимальными продажами

        for (int iterSalesByMonths : salesByMonths) {
            if (arrayPosition <= salesByMonths.length) {
                    if (currentMax <= salesByMonths[arrayPosition]) {
                        currentMax = salesByMonths[arrayPosition];
                        maxSalesMonth = arrayPosition + 1;
                        arrayPosition = arrayPosition + 1;
                    } else {
                        arrayPosition = arrayPosition + 1;
                    }
               // System.out.println("Перебираемое значение: " + salesByMonths[arrayPosition - 1] + ", максимальные продажи: " + maxSalesMonth);
                // данная строчка добавлена для контроля выполнения
            }
        }
        return maxSalesMonth;
    }
}
