package Task;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*Заполнить массив размерности n случайными цифрами
от 3 до 13. Подсчитать, сколько раз встречается каждая циф-
ра. Вывести результат на экран. n – задается с клавиатуры.*/
public class Task07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите длинну массива");
        int n = scan.nextInt();
        int mas[] = new int[n];
        Random ran=new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] =  3 + ran.nextInt((13 - 3) + 1);
        }
        System.out.println(Arrays.toString(mas));
        Arrays.sort(mas);
        System.out.println(Arrays.toString(mas));

        for (int i = 0; i < mas.length; i++) {
            int count = 0;
            if (i != 0 && mas[i] == mas[i - 1]) {
                continue;
            }
            for (int j = 0; j < mas.length; j++) {
                if (mas[i] == mas[j]) {
                    count++;

                }

            }
            System.out.println(mas[i] + " Встречается " + count);
        }
    }
}
