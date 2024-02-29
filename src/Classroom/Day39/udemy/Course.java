package Classroom.Day39.udemy;

import java.util.ArrayList;

public class Course {
    int cId;
    String courseName;
    Instructor instructor;
    Mentor mentor;
    ArrayList<Student> students = new ArrayList<>();

    public Course(int cId, String courseName, Instructor instructor,
                  Mentor mentor){
        this.cId = cId;
        this.courseName = courseName;
        this.instructor = instructor;
        this.mentor = mentor;
    }

    public void addStudent(Student student){
        this.students.add(student);
        System.out.println(student.name + " was added!");
    }

    public void displayCourse(){
        System.out.println("Course id: " + cId);
        System.out.println("Course name: " + courseName);
        System.out.println("Instructor: " + instructor.name);
        System.out.println("Mentor: " + mentor.name);
        System.out.println("----------------");
    }

    public void displayStudents(){
        for(Student i : students){
            System.out.println("Student ID: " + i.sId);
            System.out.println("Name: " + i.name);
            System.out.println("Gender: " + i.gender);
        }
    }
    // TODO
    public void removeStudent(int sId){
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).sId == sId){
                System.out.println(students.get(i).name + " was deleted!");
                students.remove(i);
                break;
            }
        }
    }

    public void updateStudent(int sId, String newName){
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).sId == sId){
                System.out.println(students.get(i).name + " was updated to " + newName);
                students.get(i).name = newName;
                break;
            }
        }
    }
}
