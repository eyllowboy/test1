package Task;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*Заполнить массив размерности n случайными строчны-
ми латинскими буквами. Подсчитать, сколько раз встреча-
ется каждая буква. Вывести буквы, которые встречаются
больше 3 раз. n – задается с клавиатуры.*/
public class Task08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите длинну массива");
        int n = scan.nextInt();
        char mas[] = new char[n];
        Random ran = new Random();

        for (int i = 0; i < mas.length; i++)
            mas[i] = (char) (97 + ran.nextInt((122 - 97) + 1));
        System.out.println(Arrays.toString(mas));
        Arrays.sort(mas);
        System.out.println(Arrays.toString(mas));

        for (int i = 0; i < mas.length; i++) {
            if (i != 0 && mas[i] == mas[i - 1]) {
                continue;
            }
            int count = 0;
            for (int j = 0; j < mas.length; j++) {
                if (mas[i] == mas[j])
                    count++;
            }
            if (count > 2) {
                System.out.println(mas[i] + " " + count);
            }
        }

    }
}
