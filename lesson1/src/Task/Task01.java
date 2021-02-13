package Task;

import java.util.Scanner;

/*Условие задачи:
Необходимо написать простой консольный калькулятор на Java. Все делать через статические методы.

Метод int getInt() - должен считывать с консоли целое число и возвращать его
Метод char getOperation() - должен считывать с консоли какое-то значение и возвращать символ с операцией (+, -, * или /)
Метод int calc(int num1, int num2, char operation) - должен выполнять над числами num1 и num2 арифметическую операцию, заданную operation.
Метод main() - должен считывать 2 числа (с помощью getInt()), считать операцию (с помощью getOperation(), передать все методу calc() и вывести на экран результат.
Решить проблему связанную с деление на 0.
*/
public class Task01 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int num1 = Task01.getInt();
        int num2 = Task01.getInt();
        char operation = Task01.getOperation();
        int result = Task01.calc(num1, num2, operation);
        System.out.printf("Результат операции %d", result);
    }

    static int getInt() {
        System.out.println("Введите число");
        int num = sc.nextInt();
        return num;
    }

    static char getOperation() {
        System.out.println(" Введите символ +, -, * или /");
        char ch = sc.next().charAt(0);
        return ch;
    }

    static int calc(int num1, int num2, char operation) {
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
                if (num2 == 0) {
                    System.out.println("На ноль делить нельзя введите 2ое число ");
                    return result = calc(num1, Task01.getInt(), operation);
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Повторите ввод символа +, -, * или /");
                return result = calc(num1, num2, Task01.getOperation());
        }


        return result;

    }
}
