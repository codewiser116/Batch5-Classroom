package Classroom.Day43Extra;

import javax.imageio.IIOException;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class CheckedException {
    public static void main(String[] args)  {
        try{
            FileWriter fileWriter = new FileWriter("/Users/codewiseacademy/Desktop/Batch5/Classroom/src/Classroom/Day43Extra/text.txt");
            System.out.println("Hello world");
        }catch(IOException e){
            System.out.println("Exception was created and the reason is: invalid file path");
        }

    }
}
