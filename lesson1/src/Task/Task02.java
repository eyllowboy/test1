package Task;

import java.util.Scanner;

public class Task02 {
    int num1;
    int num2;
    char operation;

    Task02(int num1, int num2, char operation) {
        this.num1 = num1;
        this.num2 = num2;
        this.operation = operation;

    }

    int calc() {
        int result;

        switch (operation) {
            case ('+'):
                result = num1 + num2;
                break;
            case ('-'):
                result = num1 - num2;
                break;
            case ('*'):
                result = num1 * num2;
                break;
            case ('/'):

                result = num1 / num2;
                break;
            default:

                result = 0;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("Введите 1 число");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Введите 2 число");
        int num2 = sc.nextInt();
        System.out.println("Введите символ +, -, * или /");
        char ch = sc.next().charAt(0);
        if (!(ch == '+' | ch == '/' | ch == '-' | ch == '*')) {
            while (!(ch == '+' | ch == '/' | ch == '-' | ch == '*')) {
                System.out.println("Введите символ еще раз +, -, * или /");
                ch = sc.next().charAt(0);
            }
        }

        if (num2 == 0 && ch == '/') {
            System.out.println("На ноль делить нельзя");
            while (num2 == 0) {
                System.out.println("Введите 2 число");
                num2 = sc.nextInt();
            }
        }
        sc.close();
        Task02 obj = new Task02(num1, num2, ch);
        int result = obj.calc();
        System.out.println("Результат " + result);

    }


}