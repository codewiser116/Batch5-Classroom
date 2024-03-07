package Classroom.Day43;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFiles {
    public static void main(String[] args) {
        String path =  "/Users/codewiseacademy/Desktop/Batch5/Classroom1/src/Classroom/Day43";
        path+="/"+"Text.txt";

        try(FileWriter fw = new FileWriter(path, true)) {
            fw.write("Batch5+\n");
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
