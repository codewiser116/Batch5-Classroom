package Classroom.Day39.udemy;

public class Instructor extends Employee implements InstructorAble{
    public Instructor(String name, String gender, int eId, String email, String workHours, String position) {
        super(name, gender, eId, email, workHours, position);
    }

    @Override
    public void recordClass() {
        System.out.println(name + " is recording a class");
    }
}
