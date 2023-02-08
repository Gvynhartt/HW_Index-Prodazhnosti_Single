package ru.netology.stats;

public class MinSalesMonthService {
    public int calcMinSalesMonthNmb(int[] salesByMonths) {

        int arrayPosition = 0; // показывает номер перебираемой ячейки в массиве
        int currentMin = salesByMonths[0]; // сохраняет минимальное значение из всех перебранных на текущей итерации
        int minSalesMonth = 0; // сохраняет номер месяца с минимальными продажами

        for (int iterSalesByMonths : salesByMonths) {
            if (arrayPosition <= salesByMonths.length) {
                if (currentMin >= salesByMonths[arrayPosition]) {
                    currentMin = salesByMonths[arrayPosition];
                    minSalesMonth = arrayPosition + 1;
                    arrayPosition = arrayPosition + 1;
                } else {
                    arrayPosition = arrayPosition + 1;
                }
                // System.out.println("Перебираемое значение: " + salesByMonths[arrayPosition - 1] + ", минимальные продажи: " + minSalesMonth);
                // данная строчка добавлена для контроля выполнения
            }
        }
        return minSalesMonth; // копипаст по-прежнему сила
    }
}
