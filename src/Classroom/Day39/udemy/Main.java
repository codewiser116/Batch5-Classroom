package Classroom.Day39.udemy;

public class Main {
    public static void main(String[] args) {
        Udemy udemy = new Udemy();
        // instructors
        Instructor instructor1 = new Instructor("John","Male",101,
                "9-5","John@gmail.com","DevOps Instructor");

        Instructor instructor2 = new Instructor("David","Male",102,
                "9-5","David@gmail.com","SDET Instructor");

        Instructor instructor3 = new Instructor("Karen","Female",103,
                "9-5","Karen@gmail.com","CyberSecurity instructor");
        // mentors
        Mentor mentor1 = new Mentor("Sara","Female",201,"9-5",
                "Sara@yahoo.com","DevOps Mentor");
        Mentor mentor2 = new Mentor("Jessica","Female",202,"9-5",
                "Jessica@yahoo.com","SDET Mentor");
        Mentor mentor3 = new Mentor("Alex","Male",203,"9-5",
                "alex@yahoo.com","CyberSecurity Mentor");

        // COURSES
        Course devOpsCourse = new Course(1, "DevOps", instructor1, mentor1);
        Course sdetCourse = new Course(2, "SDET", instructor2, mentor2);
        Course cyberSecurityCourse = new Course(3, "CyberSecurity", instructor3, mentor3);

        // ADDING 3 COURSES
        udemy.addCourse(devOpsCourse);
        udemy.addCourse(sdetCourse);
        udemy.addCourse(cyberSecurityCourse);

        udemy.displayCourses();

        //STUDENTS
        Student mike = new Student("Mike", "Male", 1);
        Student sara = new Student("Sara", "Female", 2);
        Student john = new Student("John", "Male", 3);
        Student josh = new Student("Josh", "Male", 4);
        Student steve = new Student("Steve", "Male", 5);
        Student ann = new Student("Ann", "Female", 6);

        devOpsCourse.addStudent(mike);
        devOpsCourse.addStudent(sara);

        sdetCourse.addStudent(john);
        sdetCourse.addStudent(josh);

        cyberSecurityCourse.addStudent(steve);
        cyberSecurityCourse.addStudent(ann);

        udemy.removeCourse(1);

        udemy.updateCourse(2,"Java");

        udemy.displayCourses();

        cyberSecurityCourse.updateStudent(5, "Zuck");

        cyberSecurityCourse.removeStudent(6);

        cyberSecurityCourse.displayStudents();


    }
}
