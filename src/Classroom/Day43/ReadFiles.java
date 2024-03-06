package Classroom.Day43;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Logger;

public class ReadFiles {
    public static void main(String[] args) {
        String path = "/Users/codewiseacademy/Desktop/Batch5/Classroom1/src/Classroom/Day43/Text.txt";
        try(FileReader fileReader = new FileReader(path)){

            Scanner scanner = new Scanner(fileReader);
            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        }
        catch(IOException e){
            System.out.println("File not found exception!");
        }
    }
}
