package Classroom.Day39.udemy;

public class Student extends Person{
    int sId;


    public Student(String name, String gender, int sId) {
        super(name, gender);
        this.sId = sId;
    }
}
