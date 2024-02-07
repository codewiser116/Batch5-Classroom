package Classroom.Day28.LibraryManagement;

public class Book {
    // multiple constructors - overloading
    // multiple methods with the same name - overloading

    String title;
    String author;
    int pages;
    boolean isAvailable = true;

    public Book(String title, String author, int pages){
        this.title = title;
        this.author = author;
        this.pages = pages;
    }


}
