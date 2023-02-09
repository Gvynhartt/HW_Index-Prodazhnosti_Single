package ru.netology.stats;

public class SalesStatsServices {

    public int calcSalesTotal(int[] salesByMonths) { // подсчитывает общие продажи

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

    public int calcMonthlySales(int[] salesByMonths) { // подсчитывает средние продажи в месяц

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

    public int calcMaxSalesMonthNmb(int[] salesByMonths) { // находит месяц максимальных продаж

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

    public int calcMinSalesMonthNmb(int[] salesByMonths) { // находит месяц минимальных продаж

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

    public int calcMonthsBelowMean(int[] salesByMonths) {  // подсчитывает число месяцев с продажами ниже среднего

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
        int monthsBelowMean = 0; // сохраняет число месяцев с продажами ниже среднего

        for (int iterSalesByMonths : salesByMonths) {
            if (arrayPosition <= salesByMonths.length) {
                if (iterSalesByMonths < meanSalesHic) {
                    monthsBelowMean = monthsBelowMean + 1;
                    // System.out.println("Всего месяцев с продажами ниже среднего: " + monthsBelowMean);
                    arrayPosition = arrayPosition + 1;
                } else {
                    arrayPosition = arrayPosition + 1;
                }
            }
        }
        return monthsBelowMean;
    }

    public int calcMonthsAboveMean(int[] salesByMonths) { // подсчитывает число месяцев с продажами выше среднего

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
