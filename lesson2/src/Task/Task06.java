package Task;
/*Заполнить массив на 10 элементов случайными числами
от -10 до +10. Посчитать количество уникальных значений
(встречающихся в массиве один раз). Вывести на консоль
значения уникальных элементов и индексы, под которыми
они находятся в массиве.*/

import java.util.Arrays;
import java.util.Random;

public class Task06 {
    public static void main(String[] args) {
        int mas[] = new int[10];
        Random ran = new Random();
        for (int i = 0; i < mas.length; i++)
            mas[i] = -10 + ran.nextInt(10 - (-10) + 1);
        System.out.println(Arrays.toString(mas));

        for (int i = 0; i < mas.length; i++) {
            int count = 0;
            for (int j = 0; j < mas.length; j++) {

                if (mas[i] == mas[j]) {
                    count++;

                }

            }
            if (count == 1) {
                System.out.println("Уникальный элемент " + mas[i] + " Позиция " + i);
            }
        }
    }
}
