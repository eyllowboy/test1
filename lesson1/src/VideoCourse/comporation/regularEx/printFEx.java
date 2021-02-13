package VideoCourse.comporation.regularEx;

public class printFEx {
    static void emploeeInfo(Employee emp){
        System.out.printf("%03d \t %-12s \t  \n",emp.id,emp.name,emp.salary*(1+emp.bonus));
    }
    public static void main(String[] args) {

        Employee emp1= new Employee("siarhei",1,1212121,0.2);
        emploeeInfo(emp1);
    }
}
class Employee{
    String name;
    int id;
    int salary;
    double bonus;

    public Employee(String name, int id, int salary, double bonus) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.bonus = bonus;
    }
}