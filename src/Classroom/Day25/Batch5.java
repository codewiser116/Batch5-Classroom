package Classroom.Day25;

import java.util.Arrays;

public class Batch5 {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Mike Alex";
        Student student2 = new Student();
        student2.name = "Sara Ann";
        Student student3 = new Student();
        student3.name = "John";

        int n1 = 5;
        int n2 = 6;
        int n3 = 10;
        int[] array = {n1, n2, n3};


        Student[] students = {student1, student2, student3};
        for(int i = 0; i < students.length; i++){
            if(students[i].name.length()>=6){
                System.out.println(students[i].name);
            }
        }
    }
}
