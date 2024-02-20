package Classroom.Day34.person;

public class Teacher extends Person{

    String subject;
    int yearsExperience;

    public Teacher(String name, int age, String gender, String address, String subject, int yearsExperience){
        super(name, age, gender, address);
        this.subject = subject;
        this.yearsExperience = yearsExperience;
    }

    public void postAssignment(){
        System.out.println(name + " created a new Assignment");
    }

}
