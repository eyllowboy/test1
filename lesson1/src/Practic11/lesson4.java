package Practic11;

public class lesson4 {
    public static void main(String[] args) {
    System.out.println(maxchar.maximum(3,15,8,11));

    }
}

class maxchar {
    static int maximum(int a, int b, int c, int d) {
        if (a > b && a > c && a > d){
            return a;
        }
        else if (b > a && b > c && b > d){
            return b;
        }
        else if (c > a && c > b && c > d){
            return c;
        }
        else return d;
    }
}