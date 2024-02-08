package Classroom.Day28.LibraryManagement;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Book book1 = new Book("Book1","Author1", 300);
        Book book2 = new Book("Book2","Author2", 400);
        Book book3 = new Book("Book3","Author3", 500);
        Book book4 = new Book("Book4","Author4", 600);

        Library library = new Library("Des Plaines Public Library");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        library.displayBooks();

        Student student1 = new Student("Jake", 19);
        Student student2 = new Student("Paul", 23);
        Student student3 = new Student("Sara", 20);

        student1.startReading(book1);
        student1.startReading(book2);
        student2.startReading(book1);

        student1.returnBook();
        student1.startReading(book4);

        student3.returnBook();

        library.displayBooks();

    }

}
