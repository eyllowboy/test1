package Task;

import java.util.Arrays;
import java.util.Scanner;

/*Заполнить массив размерности n словами, состоящими
только из строчных латинских букв. Слова между собой раз-
делены пробелами, количество пробелов случайное – от 1 до
5. Подсчитать общее количество слов в массиве. n – задается
с клавиатуры.*/
public class Task11 {
    public static void main(String[] args) {
        System.out.println("Введите длинну массива");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String array[] = new String[n];
        int j = 0;
    O:    for (int i = j; i < array.length;) {

            int probel = (int) (1 + (Math.random() * (5 - 1) + 1));
            array[i] = "massiv";
            i++;
            while (probel > 0) {
                if (i ==array.length){
                    break O;
                }
                array[i] = " ";
                i++;
                probel--;
                j = i ;
                if (i >= array.length ) {
                    break ;
                }
            }


        }
        System.out.println(Arrays.toString(array));
        int count=0;
        for (int i=0;i<array.length;i++){
            if(array[i]!=" "){
                count++;
            }
        }
        System.out.println("В массиве имеется " +count +" слов ");
    }
}
