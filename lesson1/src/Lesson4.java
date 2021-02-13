public class Lesson4 {
    int a;
    int b;
    int c;
    int d;

    static int min(int... array) {
        int f = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                f = array[i];

            }
        }
        return f;
    }

    static int max(int... array) {
        int f = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                f = array[i];

            }
        }
        return f;
    }

    static double srednee(int... array) {
        int summa = 0;
        int srednee = 0;
        for (int i = 0; i < array.length; i++) {
            summa += array[i];
            if (i == array.length - 1) {
                srednee = summa / (i+1);
            }
        }
        return srednee;
    }

    static int factorial(int  n) {
        int fact=1;

        for (int i = 1; i <= n; i++) {
            fact=fact*i;
        }
        return fact;
    }

    public static void main(String[] args) {
        System.out.println(Lesson4.factorial(2));
    }
}
