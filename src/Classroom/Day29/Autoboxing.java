package Classroom.Day29;

public class Autoboxing {
    public static void main(String[] args) {
        // Autoboxing process
        // Conversion is done by jvm
        // Conversion from primitive to Wrapper
        int num1 = 10;
        Integer num2 = num1;

        // Automatic-Unboxing
        // Conversion is done by jvm
        // Conversion from Wrapper to primitive
        Integer num3 = 25;
        int num4 = num3;

        // Unboxing
        // We do manually conversion
        Integer num5 =  35;
        int num6 = num5.intValue();


        // Boxing
        // We do manually conversion
        int num7 = 99;
        Integer num8 = Integer.valueOf(num7);


    }
}
