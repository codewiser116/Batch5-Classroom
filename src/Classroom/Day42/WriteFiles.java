package Classroom.Day42;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteFiles {

    // Path to java class WriteFiles
    // /Users/codewiseacademy/Desktop/Batch5/Classroom1/src/Classroom/Day42/WriteFiles.java

    // Path to package Day42
    // /Users/codewiseacademy/Desktop/Batch5/Classroom1/src/Classroom/Day42


    public static void logException(String message) throws IOException {
        String path = "/Users/codewiseacademy/Desktop/Batch5/Classroom1/src/Classroom/Day42";
        path+="/Logger.txt";
        FileWriter fileWriter = new FileWriter(path,true);
        fileWriter.write(message+"\n");
        fileWriter.close();
    }

}
