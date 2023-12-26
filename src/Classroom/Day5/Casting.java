package Classroom.Day5;

public class Casting {

    // Instance variable
    int number = 10;


    public static void main(String[] args) {

        // Local variables: int1, double1, long1, b1

        // Implicit casting - smaller to larger type
        int int1 = 10;
        double double1 = int1;
        System.out.println("int = " + int1);
        System.out.println("double = " + double1);

        // Explicit casting - larger to smaller type
        long long1 = 394;
        byte b1 = (byte) long1;
        System.out.println("long = " + long1);
        System.out.println("short = " + b1);
    }
}
