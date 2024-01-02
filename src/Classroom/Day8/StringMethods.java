package Classroom.Day8;

public class StringMethods {
    public static void main(String[] args) {
        String str1 = "laptoplap";
        String str2 = "";

//        System.out.println(str1.length()); // 8 length
//        System.out.println(str1.length()-1); // index of last e letter
//
//        System.out.println(str1.equals(str2)); // false
//        System.out.println(str1.equalsIgnoreCase(str2)); // true
//
//        System.out.println("Temporary copy: " + str1.toLowerCase());
//        System.out.println("Original string: " + str1); // hello

//        System.out.println("Temporary copy: " + str1.toUpperCase());
//        str1 = str1.toUpperCase();
//        System.out.println("Original string: " + str1);

//        System.out.println(str1.charAt(4));
//        System.out.println(str1.charAt(0) + " " + str1.charAt(1));
//        System.out.println(str1.toUpperCase()); // HELLO

//        System.out.println(str1.indexOf("p")); // 2
//        System.out.println(str1.lastIndexOf("p")); // 8
//        System.out.println(str1.indexOf("lap")); //  0

        // "laptoplap"
//        System.out.println(str1.isEmpty()); // false
//        System.out.println(str2.isEmpty()); // true
        String l = "  java programming language language  ";
//        System.out.println(l.replace("j","c"));
//        System.out.println(l.replace(" ", "c"));
//        System.out.println(l.replace("java","english"));
//        System.out.println(l.replace("an","ar"));
//        l = l.replace("a","?");

//        System.out.println(l.startsWith("ja"));
//        System.out.println(l.endsWith("age"));

//        System.out.println(l.trim());
//        System.out.println(l);

//        System.out.println(l.contains("z"));
//        System.out.println(l.contains("java"));
//        System.out.println(l.contains("language"));

        String str = "java p l";
        System.out.println(str.substring(1));
        System.out.println(str.substring(3));
        System.out.println(str.substring(2));

        System.out.println(str.substring(2,5)); // "va "
        System.out.println(str.substring(0,3)); // "jav"


        System.out.println("HELLO".toLowerCase().toUpperCase().replace("H","Java")
                .substring(4).toLowerCase()); // JavaELLO


    }
}
