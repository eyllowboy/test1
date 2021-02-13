package Task;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*Заполнить массив размерности n случайными цифрами
от –2 до n. Если в массиве есть хотя бы одно отрицательное
значение меньше -1, заменить все отрицательные значение
в массиве на квадрат (в степени 2) этих значений. Вывести
исходный и результирующий массив на консоль.*/
public class Task09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите длинну массива");
        int n = scan.nextInt();
        int mas[] = new int[n];
        Random ran=new Random();


        for (int i = 0; i < mas.length; i++)
            mas[i] = -2 + ran.nextInt ((n - (-2)) + 1);
        System.out.println(Arrays.toString(mas));
        boolean minus1 = false;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < -1) {
                minus1 = true;
                break;
            }
        }
        if (minus1) {
            for (int j = 0; j < mas.length; j++) {
                if (mas[j] < 0) {
                    mas[j] = mas[j] * mas[j];
                }
                System.out.print(mas[j] + "  ");
            }
        }
    }
}
