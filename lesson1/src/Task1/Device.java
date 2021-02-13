package Task1;


public class Device {
    private String name;
    private String color;

    Device(String name, String color) {
        this.name = name;
        this.color = color;

    }

    public String getName() {
        return name;
    }

    void sound() {
    }

    ;

    void show() {
    }

    ;

    void desc() {
    }

    ;
}

class Kettle extends Device {
    Kettle(String name, String color) {
        super(name, color);

    }

    public void sound() {
        System.out.println("Чайник издает звук");
    }

    void show() {
        System.out.println("Имя чайника " + getName());
    }

    ;

    void desc() {
        System.out.println("Описание чайника");
    }
}


class Microvoln extends Device {
    Microvoln(String name, String color) {
        super(name, color);

    }

    public void sound() {
        System.out.println("Микроволновка издает звук");
    }

    void show() {
        System.out.println("Имя микроволновки " + getName());
    }

    ;

    void desc() {
        System.out.println("Описание микроволновки");
    }
}

class Car extends Device {
    Car(String name, String color) {
        super(name, color);

    }

    public void sound() {
        System.out.println("Машина издает звук");
    }

    void show() {
        System.out.println("Имя машины " + getName());
    }

    void desc() {
        System.out.println("Описание машины");
    }
}

class Steamboat extends Device {
    Steamboat(String name, String color) {
        super(name, color);

    }

    public void sound() {
        System.out.println("Пароход издает звук");
    }

    void show() {
        System.out.println("Имя парохода "+getName());
    }

    void desc() {
        System.out.println("Описание парохода");
    }
}

class Test1 {
    public static void main(String[] args) {
        Kettle ket = new Kettle("Tefal", "black");
        ket.show();
        ket.sound();
        ket.desc();
        Microvoln mic= new Microvoln("LG","green");
        mic.show();
        mic.sound();
        mic.desc();

    }
}