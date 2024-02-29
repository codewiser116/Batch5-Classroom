package Classroom.Day40;

import Classroom.Day25.Student;

import java.util.ArrayList;

public class University {

    ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student();
        University university = new University();

//         1st way
        university.students.add(student1);
        System.out.println("student was added");
        university.students.add(student2);
        System.out.println("student was added");



//        // 2nd way
//        university.addStudent(student1);
//        university.addStudent(student2);

        System.out.println(university.students.size());

    }

    public void addStudent(Student student){
        this.students.add(student);
        System.out.println("Student was added!");
    }
}
