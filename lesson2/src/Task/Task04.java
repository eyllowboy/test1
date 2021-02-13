package Task;
/*Написать программу, которая проверяет, все ли значения
элементов массива различные (не повторяются). Вывести:
Yes – если все различные и No – если имеется хоть одно по-
вторение. Массив задается и инициализируется в начале
программы.*/
public class Task04 {
    public static void main(String[] args) {
        int mas[] = new int[]{1, 1, 1, 1};

        int count =0;
        for (int i = 0; i < mas.length - 1; i++) {

            if (mas[i] == mas[i + 1]) {

                count++;
            } else {

            }

        }
        if (count==3){
        System.out.println("Yes Все элеиенты различные");}
        else {System.out.print("No Имеется хотя бы одно повторение");}
    }
}
