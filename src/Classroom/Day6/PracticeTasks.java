package Classroom.Day6;

public class PracticeTasks {


    public static void main(String[] args) {

        // Task 1
/*        double num1 = 29, num2 = 5;
        System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
        System.out.println(num1 + " % " + num2 + " = " + (num1%num2));

        // Task 2
        double d1 = 68, d2 = 81, d3 = 74, d4 = 70,
                d5 = 68, d6 = 65, d7 = 71;
        int average = (int)(d1+d2+d3+d4+d5+d6+d7)/7;
        System.out.println("The average degree in farhenheit for the " +
                "last week is " + average);

        // Task 3
        double miles = 54.3;
        System.out.println(miles + " miles = " + (int)(miles * 63360) + " inches");
        System.out.println(miles + " miles = " + (int)(miles * 5280) + " feet");
        System.out.println(miles + " miles = " + (int)(miles * 1609) + " meters");
        System.out.println(miles + " miles = " + (int)(miles * 1.609) + " kms");*/

        // Task 4

//        double num = 5.43;
//        num+=5;
//        num-=3.23;
//        num*=9;
//        num/=2;
//        num%=3;
//        System.out.println("result is " + num);

        // Task 5
//        int num1 = 5, num2 = 61, num3 = 92;
//
//
//        System.out.println(num1 + " - " + (num1 % 2 == 0));
//        System.out.println(num2 + " - " + (num2 % 2 == 0));
//        System.out.println(num3 + " - " + (num3 % 2 == 0));

        // Task 6
        int number = 543;
        int first = number / 100, second = number / 10 % 10,
                last = number % 10;
        System.out.println("1st digit: " + first);
        System.out.println("2nd digit: " + second);
        System.out.println("3rd digit: " + last);
        System.out.println("All digits: " + first +", " + second + ", and " + last);
    }
}
