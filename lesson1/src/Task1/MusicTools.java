package Task1;

public class MusicTools {
    private String name;
    private String color;

    public MusicTools(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void sound() {
    }

    public void show() {
    }

    public void desk() {
    }

    public void history() {
    }

    public String getName() {
        return name;
    }
}

class Scrypka extends MusicTools {
    Scrypka(String name, String color) {
        super(name, color);
    }

    public void sound() {
        System.out.println("Скрипка издает звук ");
    }

    public void show() {
        System.out.println("Имя скрипки " + getName());
    }

    public void desk() {
        System.out.println("Описание скрипки ");
    }

    public void history() {
        System.out.println("История скрипки ");
    }

}

class Trambon extends MusicTools {
    Trambon(String name, String color) {
        super(name, color);
    }

    public void sound() {
        System.out.println("Тромбон издает звук ");
    }

    public void show() {
        System.out.println("Имя тромбона " + getName());
    }

    public void desk() {
        System.out.println("Описание трамбога ");
    }

    public void history() {
        System.out.println("История трамбона ");
    }
}

class Ukelele extends MusicTools {
    Ukelele(String name, String color) {
        super(name, color);
    }

    public void sound() {
        System.out.println("Укелеле издает звук ");
    }

    public void show() {
        System.out.println("Имя Укелеле " + getName());
    }

    public void desk() {
        System.out.println("Описание укелеле ");
    }

    public void history() {
        System.out.println("История укелеле ");
    }
}

class Violonchel extends MusicTools {
    Violonchel(String name, String color) {
        super(name, color);
    }

    public void sound() {
        System.out.println("Виолончель издает звук ");
    }

    public void show() {
        System.out.println("Имя виолончели" + getName());
    }

    public void desk() {
        System.out.println("Описание виолончеля ");
    }

    public void history() {
        System.out.println("История виолончеля ");
    }
}

class TestMusictools {
    public static void main(String[] args) {
        Scrypka sc = new Scrypka("Stradivary", "red");
        sc.sound();
        sc.show();
        sc.desk();
        sc.history();
    }
}