public class text {

        public static void main(String[] args) {
            System.out.println(A.staticField);
            A a = new A();
            A b = new A();
            System.out.println(a.staticField);
            a.staticField = 5;
            System.out.println(b.staticField);
            System.out.println(a.staticField);
        }
    }
    class A {
        public static int staticField = 1;

        public static void main(String[] args) {
            System.out.println("dfdfdfdf");
        }
    }