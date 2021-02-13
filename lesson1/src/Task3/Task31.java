package Task3;

import java.util.*;

public class Task31 {
    public static void main(String[] args) {
        divideNumber();
    }

    static void divideNumber() {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int a = (int) (Math.random() *10) +1;
        System.out.println("long array" + a);
        int array[] = new int[a];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 21) - 10;
            try {
                System.out.println("Number" + array[i]);
                System.out.println(number / array[i]);
            } catch (ArithmeticException | NumberFormatException | InputMismatchException e) {
                System.err.print("Mistake" + e.getMessage());

            } finally {

                scanner.close();
            }


        }

    }
}
