package Classroom.Day28.LibraryManagement;

public class Student {
    String name;
    int age;

    Book currentlyReading;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void startReading(Book book){
        // Whether Student can start a new book - true
        // Whether books is available - true
        // Student borrows a book

        if(currentlyReading == null && book.isAvailable){
            currentlyReading = book;
            book.isAvailable = false;
            System.out.println(name + " successfully borrowed " + book.title );
        }
        else{
            System.out.println(name + " failed to borrow " + book.title);
        }
    }

    public void returnBook(){
        // Check whether we have a currently reading book
        if(currentlyReading != null){
            currentlyReading.isAvailable = true;
            System.out.println(name + " successfully returned " + currentlyReading.title);
            currentlyReading = null;
        }
        else{
            System.out.println(name + " doesn't have a book to return!");
        }
    }



}
