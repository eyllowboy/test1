package VideoCourse.comporation.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamEx5 {
    public static void main(String[] args) {
        int[] array = {34, 53, 12, 34, 5, 22, 34, 54, 23, 9};
        int b = Arrays.stream(array).filter(e -> e % 2 == 0).map(e -> {
            if (e % 3 == 0) {
                e = e / 3;
            }
            return e;
        }).reduce((a, e) -> a + e).getAsInt();
        System.out.println(b);

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
        students.stream().map(e -> {
            e.setName(e.getName().toUpperCase());
            return e;
        }).filter(e -> e.getSex() == 'f').sorted((x, y) -> x.getAge() - y.getAge()).forEach(e -> System.out.println(e));
        System.out.println("____________________________________________________");
        Stream <Integer>stream1=Stream.of(1,2,4,2,5,3,4,4);
        Stream <Integer>stream2=Stream.of(1,2,3,4,5,6,1,2,7);
        Stream <Integer>stream3=Stream.concat(stream1,stream2);
        stream3.forEach(System.out::print);
        Stream <Integer>stream5=Stream.of(1,2,3,4,5,6,1,2,7);
        stream5.distinct().forEach(System.out::println);
        System.out.println("-----------------------");
        Stream <Integer>stream6=Stream.of(1,2,3,4,5,6,1,2,7);
        System.out.println(stream6.count());
        Stream <Integer>stream7=Stream.of(1,2,3,4,5,6,1,2,7);
        stream7.distinct().peek(System.out::println).count();
    }
}
