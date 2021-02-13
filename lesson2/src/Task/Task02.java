package Task;
/*Заполнить массив на 30 элементов случайными числами
от -70 до +50. Найти минимальный элемент и вывести его
на консоль. Найти максимальный элемент и вывести его на
консоль.*/
import java.util.*;

public class Task02 {
    public static void main(String[] args) {
        int[] array = new int[30];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * 120) - 70);
        }
        System.out.println(Arrays.toString(array));
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            } else if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Минимальный элемент массива " + min);
        System.out.println("Максимальный элемент массива " + max);
    }
}
