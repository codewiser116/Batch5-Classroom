package Classroom.Day36.employees;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FullTimeEmployee fe = new FullTimeEmployee(1, "Mike", 8000, 500);
        ContractEmployee ce = new ContractEmployee(2, "Sara",  6, 60);

        // 1. Method overriding
        fe.calculateSalary();
        ce.calculateSalary();

        // 2. Method overloading
        ce.calculateSalary(60,900);

        // 3. Reference type Polymorphism
        ArrayList<Employee> employees = new ArrayList<>();

    }
}
