package Classroom.Day5;

public class ComparisonOperators {
    public static void main(String[] args) {
        // <  SHIFT and  ,
        // >  SHIFT and .
        // = SHIFT and +
        // ! SHIFT and 1
        int n1 = 20, n2 = 30;
        boolean b1 = n1 < n2;
        boolean b2 = n1 > n2;
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(20==20); // true
        System.out.println(20<=21); // true
        System.out.println(20>=21); // false
        System.out.println(1!=2); // true
        System.out.println(1!=1); // false
        System.out.println(25%2==0); // false
        System.out.println(8%2==0); // true
    }
}
