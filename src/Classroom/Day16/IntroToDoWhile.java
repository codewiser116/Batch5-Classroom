package Classroom.Day16;

public class IntroToDoWhile {
    public static void main(String[] args) {

        // print numbers from 1 to 5

        int i = 1;
        while (i > 9)

        {
            System.out.println(i);
            i++;
        }
//       ==============================

        int j = 1;
        do {
            System.out.println(j);
            j++;
        }
        while(j > 9);

        // print numbers from 1 to 50
        // using while loop
        // using do while loop

        int a = 1;
        int b = 50;

        do {
            System.out.println(a);
            a++;
        }while(a <= 50);

        /*
        print all even numbers from 100 to 1000
        1. while loop
        2. do while loop
         */

        int x = 100;
        int y = 1000;

        do {
            System.out.println(x);
            x += 2;
        }while (x <= y);

 //        second way ===============

        int f = 100;
        int g = 1000;
        do {
            if (f % 2 == 0){
                System.out.println(f);
            }
            f++;
        }while (f <= g);





    }
}
