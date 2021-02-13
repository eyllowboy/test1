package Task;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*Заполнить массив размерности n случайными циф-
рами от 0 до 33. Найти элемент массива, который делится
без остатка на значение элемента слева и значение элемен-
та справа. Вывести на консоль значения исходного массива.
Вывести индекс найденного элемента, если такой не найден,
вывести -1. n – задается с клавиатуры.*/
public class Task10 {
    public static void main(String[] args) {
        System.out.println("Введите длинну массива");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int mas[] = new int[num];
        Random ran=new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = ran.nextInt(33+1) ;
        }
        System.out.println(Arrays.toString(mas));
        boolean count = false;
        for (int i = 1; i < mas.length - 1; i++) {

            if (mas[i] % mas[i - 1] == 0 && mas[i] % mas[i + 1] == 0) {
                System.out.println("Значение массива " + mas[i] + " Индекс " + i);
                count = true;
            }
        }
        if (count==false) {
            System.out.println(-1);
        }
    }
}
