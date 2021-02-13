package VideoCourse.comporation.lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Function;

public class StudentInfo {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Koly", 'm', 23, 4, 5.5);
        Student st3 = new Student("Elena", 'f', 19, 1, 9.1);
        Student st4 = new Student("Petr", 'm', 33, 5, 7.1);
        Student st5 = new Student("Maria", 'f', 22, 3, 6.6);
        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        StudentInfo info = new StudentInfo();
       // info.testStudents(students,new CheckOverGrade());
//        info.testStudents(students, new StudentChecks() {
//            @Override
//            public boolean check(Student s) {
//                return s.age<30;
//            }
//        });
        info.testStudents(students,(Student s)->{ return s.age<30;
        });
//        info.testStudents(students,s->s.age<30
//        );
        System.out.println("_____________________________________________");
        System.out.println(overSmth(students,stu ->stu.agGrade ));
    }
    public static double overSmth(List<Student> list, Function<Student, Double> f) {
        double result=0;
        for(Student st:list){
            result+=f.apply(st);
        }
        result=result/list.size();
        return result;
    }
    void testStudents (ArrayList < Student > a1, Predicate <Student> pr){
        for (Student s : a1) {
            if (pr.test(s)) {
                System.out.println(s);
            }
        }
    }
}

//interface StudentChecks {
//    boolean check(Student s);
//}

//class CheckOverGrade implements StudentChecks{
//    @Override
//    public boolean check(Student s) {
//        return s.agGrade>8;
//    }
//}