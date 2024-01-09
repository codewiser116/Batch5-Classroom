package Classroom.Day12;

public class WithoutNestedConditionals {
    public static void main(String[] args) {
        String name = "Mike";
        int age = 19;
        String gender = "MALE";
        if (gender.equals("MALE") && age>=21) {
            System.out.println("You can go to NC");
        }
        else if(gender.equals("FEMALE")){
            System.out.println("You can go to NC");
        }
        else{
            System.out.println("You can't go to NC");
        }
    }
}
