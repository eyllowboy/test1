package Practic11;

public class lesson3 {
    public static void main(String[] args) {
    lines.lineschar(19,true,'W');
    }
}

class lines {
    static void lineschar(int dlina, boolean napr, char ch) {
        if (napr) {
            for (int i = 0; i < dlina; i++) {
                System.out.print(ch);
            }
        } else for (int i = 0; i < dlina; i++) {
            System.out.println(ch);
        }
    }
}