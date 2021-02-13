package Task;
/*Написать программу, которая проверяет, все ли значения
элементов массива одинаковые. Вывести: Yes – если все оди-
наковы и No – если имеется хоть одно различие. Массив за-
дается и инициализируется в начале программы.*/
public class Task03 {
    public static void main(String[] args) {
        int mas[] = new int[]{3, 3, 3, 3, 3};
        int m = mas[0];
        String result = null;
        for (int i=0;i<mas.length;i++){
            if (mas[i]==m)
            result="Yes";
            else {result="No";
        break;}
        }
        System.out.println("Все числа массива равны? "+result);
    }
}
