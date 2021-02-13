package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee implements Comparable<Employee>{
    String name;
    int id;
    int salary;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }

    public Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;


    }

    @Override
    public int compareTo(Employee o) {
        if(this.id==o.id) return 0;
        else if(this.id<o.id) return -1;
        else return 1;
    }
}class test{
    public static void main(String[] args) {
        ArrayList<Employee> list= new ArrayList<>();
        Employee e1= new Employee("siarhei",10,100);
        Employee e2= new Employee("koly",4,200);
        Employee e3= new Employee("pety",80,140);
        Employee e4= new Employee("sasha",12,400);
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        System.out.println(list);
        Collections.sort(list,new idcomparator());
        System.out.println(list);



    }
}
class idcomparator  implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
       if(o1.id==o2.id){return 0;}
       if(o1.id<o2.id){return -1;}
       else{return 1;}
    }
}