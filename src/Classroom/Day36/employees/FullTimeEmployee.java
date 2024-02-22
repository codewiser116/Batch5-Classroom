package Classroom.Day36.employees;

public class FullTimeEmployee extends Employee {

    int bonus;

    public FullTimeEmployee(int id, String name, double salary, int bonus){
        super(id,name, salary);
        this.bonus = bonus;
    }

    public void calculateSalary(){
        System.out.println("Full-time employee salary: " + (salary + bonus));
    }



}
