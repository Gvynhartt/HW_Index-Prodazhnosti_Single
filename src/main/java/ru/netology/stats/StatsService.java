package ru.netology.stats;

public class StatsService {

    public int calcSalesTotal(int[] salesByMonths) { // подсчитывает общие продажи

        int currentTotal = 0; // показывает текущий результат сложения продаж по месяцам


            for (int arrayPosition = 0; arrayPosition < salesByMonths.length; arrayPosition++) {
                currentTotal = (currentTotal + salesByMonths[arrayPosition]);
                // не совсем понятно, в чём смысл замены одного типа циклов на другой? for-each делает то же
                // самое, с менее громоздкой записью, ещё и не выдаёт исключений при достижении конца массива
            }
        return currentTotal;
    }

    public int calcMonthlySales(int[] salesByMonths) { // подсчитывает средние продажи в месяц
        // ДОРАБОТАН С ЗАМЕНОЙ КОПИПАСТНОЙ ЛОГИКИ ВЫЗОВОМ МЕТОДА

        /*for (int iterSalesByMonths : salesByMonths) {
            if (arrayPosition <= salesByMonths.length) {
                currentTotal = (currentTotal + salesByMonths[arrayPosition]);
                arrayPosition = arrayPosition + 1;
                // System.out.println("Перебираемое значение: " + currentTotal); данная строчка добавлена для контроля выполнения
            }
        }*/
        return (calcSalesTotal(salesByMonths) / salesByMonths.length); // вычисление средних продаж сокращено до этой строки
        // с использованием вызова метода подсчёта общих продаж
    }

    public int calcMaxSalesMonthNmb(int[] salesByMonths) { // находит месяц максимальных продаж

        int currentMax = salesByMonths[0]; // сохраняет максимальное значение из всех перебранных на текущей итерации
        int maxSalesMonth = 0; // сохраняет номер месяца с максимальными продажами

        for (int arrayPosition = 0; arrayPosition < salesByMonths.length; arrayPosition++) { // ПЕРЕПИСАНО С FOR
            if (currentMax <= salesByMonths[arrayPosition]) {
                currentMax = salesByMonths[arrayPosition];
                maxSalesMonth = arrayPosition + 1;
            }
        }
        return maxSalesMonth;
    }

        public int calcMinSalesMonthNmb(int[] salesByMonths) { // находит месяц минимальных продаж

        int currentMin = salesByMonths[0]; // сохраняет минимальное значение из всех перебранных на текущей итерации
        int minSalesMonth = 0; // сохраняет номер месяца с минимальными продажами

        for (int arrayPosition = 0; arrayPosition < salesByMonths.length; arrayPosition++) { // ПЕРЕПИСАНО С FOR
                if (currentMin >= salesByMonths[arrayPosition]) {
                    currentMin = salesByMonths[arrayPosition];
                    minSalesMonth = arrayPosition + 1;
                }
            }
        return minSalesMonth;
    }

    public int calcMonthsBelowMean(int[] salesByMonths) {  // подсчитывает число месяцев с продажами ниже среднего;
        // ДОРАБОТАН С ЗАМЕНОЙ КОПИПАСТНОЙ ЛОГИКИ ВЫЗОВОМ МЕТОДА

        // int arrayPosition = 0; // показывает номер перебираемой ячейки в массиве
        // int currentTotal = 0; // показывает текущий результат сложения продаж по месяцам

        /*for (int iterSalesByMonths : salesByMonths) {
            if (arrayPosition <= salesByMonths.length) {
                currentTotal = (currentTotal + salesByMonths[arrayPosition]);
                arrayPosition = arrayPosition + 1;
                // System.out.println("Перебираемое значение: " + currentTotal); данная строчка добавлена для контроля выполнения
            }
        }*/

        int arrayPosition = 0;
        int meanSalesHic = calcMonthlySales(salesByMonths); // подсчёт среднего сокращён до вызова метода, вычисляющего
        // среднемесячные продажи
        int monthsBelowMean = 0; // сохраняет число месяцев с продажами ниже среднего

        for (int iterSalesByMonths : salesByMonths) { // конкретно здесь итеративная переменная таки используется, поэтому for-each оправдан
            // да, в for тоже можно вызвать перебираемое значение, но в таком виде это проще, ИМХО
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
        // ДОРАБОТАН С ЗАМЕНОЙ КОПИПАСТНОЙ ЛОГИКИ ВЫЗОВОМ МЕТОДА

        // int arrayPosition = 0; // показывает номер перебираемой ячейки в массиве
        // int currentTotal = 0; // показывает текущий результат сложения продаж по месяцам

        /*for (int iterSalesByMonths : salesByMonths) {
            if (arrayPosition <= salesByMonths.length) {
                currentTotal = (currentTotal + salesByMonths[arrayPosition]);
                arrayPosition = arrayPosition + 1;
                // System.out.println("Перебираемое значение: " + currentTotal); данная строчка добавлена для контроля выполнения
            }
        }*/

        int arrayPosition = 0;
        int meanSalesHic = calcMonthlySales(salesByMonths); // подсчёт среднего сокращён до вызова метода, вычисляющего
        // среднемесячные продажи
        int monthsAboveMean = 0; // сохраняет число месяцев с продажами выше среднего

        for (int iterSalesByMonths : salesByMonths) { // конкретно здесь итеративная переменная таки используется, поэтому for-each оправдан
            if (arrayPosition <= salesByMonths.length) {
                if (iterSalesByMonths > meanSalesHic) {
                    monthsAboveMean = monthsAboveMean + 1;
                    arrayPosition = arrayPosition + 1;
                } else {
                    arrayPosition = arrayPosition + 1;
                }
            }
        }
        return monthsAboveMean;
    }
}
