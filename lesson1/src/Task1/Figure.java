package Task1;

public abstract class Figure {
    int a;
    int b;
    int c;
    int d;

    Figure(int a, int b) {
        this(a);
        this.b = b;
    }

    Figure(int a) {
        this.a = a;
    }

    Figure(int a, int b, int c, int d) {
        this(a, b);
        this.c = c;
        this.d = d;
    }

    public abstract double area();
}

class Rectangle extends Figure {
    Rectangle(int a, int b) {
        super(a, b);
    }

    public double area() {
        return a * b;
    }
}

class Circle extends Figure {
    public Circle(int a) {
        super(a);
    }

    public double area() {
        return (Math.pow(a, 2) * 3.14);
    }
}

class Triangle extends Figure {
    public Triangle(int a, int b) {
        super(a, b);
    }

    public double area() {
        return a * b / 2;
    }
}

class Trapeze extends Figure {
    Trapeze(int a, int b, int c, int d) {
        super(a, b, c, d);
    }

    public double area() {
        return ((a + b) / 2) * Math.sqrt(Math.pow(c, 2) - ((Math.sqrt(Math.sqrt(a - b) + Math.sqrt(c) - Math.sqrt(d)) / (2 * (a - b)))));
    }
}

class TestFigure {
    public static void main(String[] args) {
        Figure f1 = new Rectangle(4, 5);
        Figure f2 = new Circle(2);
        Figure f3 = new Triangle(3, 3);
        Figure f4 = new Trapeze(6, 3, 4, 4);
        Figure[] array = {f1, f2, f3, f4};
        for (Figure f:array){
            System.out.println(f.area());
        }

    }
}