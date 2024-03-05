package Classroom.Day42;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;

public class TryCatch {
    public static void main(String[] args) throws IOException {
        try{
            // 2.
            int[] array = {1,2,3,4,5};
            System.out.println(array[7]);

            // 1.
            int a = 5;
            int b = 0;
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            // write here code that will log those errors
            String message = LocalDateTime.now() + " can't divide by zero";
            WriteFiles.logException(message);
        }
        catch(ArrayIndexOutOfBoundsException e){
            String message = LocalDateTime.now() + " index out of bounds";
            WriteFiles.logException(message);
        }
        System.out.println("Hello");

    }
}
