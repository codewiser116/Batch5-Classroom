package Classroom.Day36.employees;

public class Employee {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void calculateSalary(){
        System.out.println(salary);
    }


}
