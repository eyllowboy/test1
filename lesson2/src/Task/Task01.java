package Task;

 //Числа Фебоначи

public class Task01 {
    public static void main(String[] args) {
        int mas[] = new int[15];
        for (int i = 0; i < mas.length; i++) {
            if (i < 2) {
                mas[i] = i;
            } else {
                mas[i] = mas[i - 2] + mas[i - 1];
            }

        }

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] % 2 == 0) {
                System.out.println(mas[i]);
            }
        }
    }
}
