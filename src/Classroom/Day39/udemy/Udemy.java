package Classroom.Day39.udemy;

import java.util.ArrayList;

public class Udemy {
    ArrayList<Course> courses = new ArrayList<>();

    public void addCourse(Course course){
        this.courses.add(course);
        System.out.println(course.courseName + " was added!");
    }

    public void findCourse(int cId){
        for(Course i : courses){
            if(i.cId == cId){
                i.displayCourse();
            }
        }
    }

    public void removeCourse(int cId){
        for(int i = 0; i < courses.size(); i++){
            if(courses.get(i).cId == cId){
                System.out.println(courses.get(i).courseName + " was removed!");
                courses.remove(i);
                break;
            }
        }
    }

    public void updateCourse(int cId, String newCourseName){
        for(int i = 0; i < courses.size(); i++){
            if(courses.get(i).cId == cId){
                System.out.println("Course name was updated!");
                courses.get(i).courseName = newCourseName;
                break;
            }
        }
    }

    public void displayCourses(){
        for (Course course : courses) {
            // to display single course
            course.displayCourse();
        }
    }
}
