package Classroom.Day36.employees;

public class ContractEmployee extends Employee{

    int contractDuration;
    int hourlyRate;

    public ContractEmployee(int id, String name, int contractDuration, int hourlyRate){
        super(id, name, hourlyRate * 165);
        this.contractDuration = contractDuration;
        this.hourlyRate = hourlyRate;
    }

    public void calculateSalary(){
        System.out.println("Contract salary: " + hourlyRate * 165);
    }

    public void calculateSalary(double hourlyR, int hoursWorked){
        System.out.println("Contract employee earned: " + hourlyR * hoursWorked);
    }
}
