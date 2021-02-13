package VideoCourse.comporation;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Test1 implements Comparable<Test1>{
    int id;
    String name;
    String surname;

    public Test1(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Test1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    @Override
    public int compareTo(Test1 o) {
       if (this.id==o.id){
           return 0;}
           else if(this.id<o.id){
               return -1;
           }
           else{return 1;}
       }
    }

class Example{
    public static void main(String[] args) {
        List <Test1> list =new ArrayList<>();
        Test1 t1=new Test1(13,"pety","petrov");
        Test1 t2=new Test1(10,"ivan","ivanov");
        Test1 t3=new Test1(22,"sasha","svetlov");
        Test1 t4=new Test1(15,"ivan","ivanov");
        list.add(t1);
        list.add(t2);
        list.add(t3);
        list.add(t4);
        Collections.sort(list);
        System.out.println(list);
    }
}