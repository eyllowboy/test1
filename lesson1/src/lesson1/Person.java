package lesson1;

public class Person {
   private int age;
    private String sex;
    private String name;
    private String surname;
        int qqqq=10;
    public Person(int age, String sex, String name, String surname) {
        this.age = age;
        this.sex = sex;
        this.name = name;
        this.surname = surname;
    }

    public Person() {
    }
    public static void eat(){ System.out.println("Person eat");}
    public void run(){ System.out.println("Person run");}
    public void sleep(){ System.out.println("Person sleep");}
}

class Wife extends Person{
    public Wife(int age, String sex, String name, String surname,String haracter) {
        super(age, sex, name, surname);
        this.haracter=haracter;
    }
    int qqqq=19;
    String haracter;
    public static void eat(){System.out.println("Wife eat");}
    public void run(){ System.out.println("Wife run");}
    public void sleep(){ System.out.println("Wife sleep");}
    public void coock(){ System.out.println("Wife coocking");}

}
class Example{
    public static void main(String[] args) {
        Person p=new Wife(14,"M","Siarhei","Ponomarev","kind");
        System.out.println(p.qqqq);
         


    }
}