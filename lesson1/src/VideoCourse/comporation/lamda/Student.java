package VideoCourse.comporation.lamda;

public class Student {
    String name;
    char sex;
    int age;
    int course;
    double agGrade;

    public Student(String name, char sex, int age, int course, double agGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.agGrade = agGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", agGrade=" + agGrade +
                '}';
    }
}
