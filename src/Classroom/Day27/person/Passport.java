package Classroom.Day27.person;

public class Passport {
    String fullName;
    String citizenship;

    public Passport(String fullName, String citizenship){
        this.fullName = fullName;
        this.citizenship = citizenship;
    }

    public String toString(){
        return fullName + " " + citizenship;
    }
}
