package Classroom.Day39.udemy;

public class Employee extends Person{
    int eId;
    String email;
    String workHours;
    String position;

    public Employee(String name, String gender, int eId, String email, String workHours, String position) {
        super(name, gender);
        this.eId = eId;
        this.email = email;
        this.workHours = workHours;
        this.position = position;
    }
}
