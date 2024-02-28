package Classroom.Day39.udemy;

public class Mentor extends Employee implements MentorAble{
    public Mentor(String name, String gender, int eId, String email, String workHours, String position) {
        super(name, gender, eId, email, workHours, position);
    }

    @Override
    public void mentorSupport() {
        System.out.println(name + " is holding a QA session");
    }
}
