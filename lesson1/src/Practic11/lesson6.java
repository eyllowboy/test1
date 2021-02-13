package Practic11;

public class lesson6 {
    public static void main(String[] args) {
        System.out.println(numbers.prostoeChislo(11));
    }
}

class numbers {
    static boolean prostoeChislo(int a) {
        int count = 0;
        for (int i = 2; i <= a; i++) {
            if (a % i == 0) {
                count++;
            }
        }
        if (count < 3) {
            return true;
        } else return false;
    }

}