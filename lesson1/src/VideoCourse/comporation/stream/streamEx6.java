package VideoCourse.comporation.stream;

import java.util.ArrayList;
import java.util.List;

public class streamEx6 {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Koly", 'm', 23, 4, 5.5);
        Student st3 = new Student("Elena", 'f', 19, 1, 9.1);
        Student st4 = new Student("Petr", 'm', 33, 5, 7.1);
        Student st5 = new Student("Maria", 'f', 22, 3, 6.6);
        List<Student> students = new ArrayList<>();

        Faculty f1=new Faculty("Econ");
        Faculty f2=new Faculty("Math");







    }
}
class Faculty{
    String name;
    List <Student>stFac;

    public List<Student> getStFac() {
        return stFac;
    }

    public Faculty(String name) {
        this.name = name;
        stFac=new ArrayList<>();
    }
}
