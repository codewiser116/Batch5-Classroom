package Classroom.Day12;

public class NestedConditionals {
    public static void main(String[] args) {
        String name = "Mike";
        int age = 19;
        String gender = "MALE";
        if (gender.equals("MALE")) {
            if (age >= 21) {
                System.out.println("You can go to NC");
            }
            else {
                System.out.println("You can't go to NC");
            }
        }
    }
}
