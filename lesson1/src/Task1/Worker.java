package Task1;

public abstract class Worker {
    private String name;

    public Worker(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void print();
}

class President extends Worker {
    public President(String name) {
        super(name);
    }

    public void print() {
        System.out.println("Это президент его имя " + getName());
    }
}

class Security extends Worker {
    public Security(String name) {
        super(name);
    }

    public void print() {
        System.out.println("Это охрана его имя " + getName());
    }
}

class Manager extends Worker {
    public Manager(String name) {
        super(name);
    }

    public void print() {
        System.out.println("Это манеджер его имя " + getName());
    }
}

class Enginer extends Worker {
    public Enginer(String name) {
        super(name);
    }

    public void print() {
        System.out.println("Это президент, его имя " + getName());
    }
}

class TestWorker {
    public static void main(String[] args) {
        Worker w = new President("Александр");
        w.print();

    }
}