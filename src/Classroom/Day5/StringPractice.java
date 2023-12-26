package Classroom.Day5;

public class StringPractice {
    public static void main(String[] args) {
        // 1. Literal strings
        // basic form of a String
        String str1 = "Hello"; // String pool
        String str2 = "Hello"; // String pool
        String str3 = "hello"; // String pool
        // 2. Strings with new keyword
        // complex form of a String
        String str4 = new String("Hello"); // Heap
        String str5 = new String("Hello");

        // they share the same object, they have the same address
        System.out.println(str1 == str2);

        // they don't share the same object, they share different addresses
        System.out.println(str1 == str3);

        // str1 -> string pool
        // str4 -> heap memory
        System.out.println(str1 == str4); // false

        System.out.println(str4.equals(str5)); // true

        // == compares addresses
        // .equals() compares values
        // str1 = "Hello", str2 = "Hello"


    }
}
