package VideoCourse.comporation.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx4 {
    public static void main(String[] args) {
        int [] array={3,4,12,43,64,2,4,76,3,63};
        array=Arrays.stream(array).sorted().toArray();
        System.out.println(Arrays.toString(array));

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
        students=students.stream().sorted((x,y)->x.getName().compareTo(y.getName())).collect(Collectors.toList());
        System.out.println(students);
    }
}
