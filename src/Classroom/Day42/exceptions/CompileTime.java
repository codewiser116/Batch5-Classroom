package Classroom.Day42.exceptions;

import Classroom.Day42.WriteFiles;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Scanner;

public class CompileTime {
    public static void main(String[] args) throws IOException {

        try{
            String path = "/Users/codewiseacademy/Desktop/Batch5/Classroom1/src/Classroom/Day42/Logger.txt";
            FileReader fileReader = new FileReader(path);
            Scanner scanner = new Scanner(fileReader);
            // checks whether we have lines
            while(scanner.hasNextLine()){
                // then print the line
                System.out.println(scanner.nextLine());
            }
        }
        catch (FileNotFoundException e){
            String message = LocalDateTime.now() + " file wasn't found";
            WriteFiles.logException(message);
        }
        finally {
            System.out.println("FINALLY BLOCK");
        }

    }
}
