package Classroom.Day6;

public class Day6 {
    public static void main(String[] args) {



        String name1 = "Hello"; //ox1234
        String name2 = "Hello";  //ox1234

        String name3 = new String("Hello"); //ox1233


        System.out.println(name1 == name2); //true
        System.out.println(name1 == name3);// false
        System.out.println(name1.equals(name3));// true

        name1 = "World!"; //ox1235

        System.out.println(name1 == name2); //false
        System.out.println(name1 == name3); //false
        System.out.println(name2.equals(name3)); //true


        System.out.println("Hello, World!");
    }
}
