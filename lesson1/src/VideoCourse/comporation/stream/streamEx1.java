package VideoCourse.comporation.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamEx1 {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Koly", 'm', 23, 4, 5.5);
        Student st3 = new Student("Elena", 'f', 19, 1, 9.1);
        Student st4 = new Student("Petr", 'm', 33, 5, 7.1);
        Student st5 = new Student("Maria", 'f', 22, 3, 6.6);
        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        students.stream().filter(elememt
                -> elememt.getAge() > 22 && elememt.getAvGrade() < 7.2).collect(Collectors.toList());
        System.out.println(students);
        Stream<Student> myStream= Stream.of(st1,st2,st3,st4,st5);
        myStream.filter(elememt
                -> elememt.getAge() > 22 && elememt.getAvGrade() < 7.2).collect(Collectors.toList());
    }

}

class Student {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avGrade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvGrade() {
        return avGrade;
    }

    public void setAvGrade(double avGrade) {
        this.avGrade = avGrade;
    }

    public Student(String name, char sex, int age, int course, double avGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avGrade = avGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avGrade=" + avGrade +
                '}';
    }
}
