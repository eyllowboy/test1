package Task3;

public class Task33 {
    private final int a;
    private final int b;
    private final int c;

    public Task33(int a, int b, int c) throws CheckException {
        if (a + b > c || a + c > b || b + c > a) {
            this.a = a;
            this.b = b;
            this.c = c;
        } else {
            throw new CheckException();
        }
    }
}
