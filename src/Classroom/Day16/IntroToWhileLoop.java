package Classroom.Day16;

public class IntroToWhileLoop {
    public static void main(String[] args) {
        /*
        print numbers from 1 to 5 using for loop
         */

        for (int i = 1; i <= 5; i++){
            System.out.println(i);
        }

        //using while loop

        int i = 1;
        while(i <= 5){
            System.out.println(i);
            i++;
        }

        /*
        using for loop, print:

        Jan 1
        Jan 2
        Jan 3
        ..
        Jan 31
         */

        for (int k = 1; k <= 31; k++){
            System.out.println("Jan " + k);
        }

        // same thing using while loop
        int k = 1;
        while (k <= 31){
            System.out.println("Jan " + k);
            k++;
        }

        // for loop, print all odd numbers from 1 to 100
        // using while loop, do the same thing
        int p = 1;
        for ( ; p <= 100; ){
            if (p % 2 != 0){
                System.out.println(p);
            }
            p++;
        }
//        ------------------------------------------

        int q = 1;

        while (q <= 100){
            if (q % 2 != 0){
                System.out.println(q);
            }
            q++;
        }

        /*
        int x = 1;
        int y = 10;

        print the sum of all numbers between x and y
         1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10

         1. using for loop
         2. using while loop
         */

        int result = 0;
        for (int w = 1; w <= 10; w++){
            result = result + w;
        }

        System.out.println("The sum of numbers from 1 to 10: " + result);

        // while loop

//        int x = 1;
//        int y = 10;
//        int sum = 0;
//        while (x <= y){
//            sum = sum + x;
//            x++;
//        }
//        System.out.println(sum);
//--------------------------

        int x = 1;
        int y = 10;
        int sum = 0;
        boolean b = true;
        while (b){
            sum += x;
            x++;

            if (x > y){
                b = false;
            }
        }

        System.out.println(sum);
//        =============================

        String word = "Welcome to coding!";

        // reverse using for loop
        // reverse using while loop

        for (int j = word.length() - 1; j >= 0; j--){
            System.out.print(word.charAt(j));
        }

        System.out.println();

        int l = word.length() - 1;
        while (l >= 0){
            System.out.print(word.charAt(l));
            l--;
        }





    }
}
