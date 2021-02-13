package Task;
/*Заполнить массив на 10 элементов случайными числами
от -10 до +10. Посчитать количество повторяющихся значе-
ний. Вывести на консоль только повторяющиеся элементы
и количество повторений.*/

import java.util.*;

public class Task05 {
    public static void main(String[] args) {
        int mas[] = new int[10];
        Random ran = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = -10 + ran.nextInt(10 - (-10) + 1);
        }
        System.out.println(Arrays.toString(mas));
        Arrays.sort(mas);
        System.out.println(Arrays.toString(mas));

        for (int i = 0; i < mas.length; i++) {
            int repeat = 0;
            if (i != 0 && mas[i] == mas[i - 1]) {
                continue;
            }
            for (int j = 0; j < mas.length; j++) {
                if (mas[i] == mas[j]) {
                    repeat++;
                }
            }
            if (repeat > 1) {

                System.out.println(mas[i] + " " + repeat);
            }
        }
    }
}
