package Practic11;

import java.util.Arrays;

public class lesson7 {
    public static void main(String[] args) {
        System.out.println(NumProverka.numberLucky(123114));
    }
}

class NumProverka {
    static boolean numberLucky(int a) {
        String str = Integer.toString(a);
        char[] array = str.toCharArray();
        System.out.println(Arrays.toString(array));
        int sum123 = Integer.valueOf(array[0]) + Integer.valueOf(array[1] + Integer.valueOf(array[2]));
        int sum234 = Integer.valueOf(array[3]) + Integer.valueOf(array[4] + Integer.valueOf(array[5]));
        if (sum123 == sum234) {
            return true;
        } else  return false;
    }


}
