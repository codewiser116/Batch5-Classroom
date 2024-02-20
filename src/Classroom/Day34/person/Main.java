package Classroom.Day34.person;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Zack",15, "MALE","Address1",9, "Math");
        Student student2 = new Student("Sara",10, "FEMALE","Address2",5, "History");

        Teacher teacher = new Teacher("Mike",45, "MALE", "Address2","CS",20);

        Library library = new Library();
        library.addMember(student1);
        library.addMember(student2);
        library.addMember(teacher);

        library.displayMembers();

    }
}
