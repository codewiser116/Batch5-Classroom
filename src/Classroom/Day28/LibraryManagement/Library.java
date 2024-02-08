package Classroom.Day28.LibraryManagement;

public class Library {

    String name;
    int numberOfBooks = 0;
    Book[] books = new Book[4];

    public Library(String name){
        this.name = name;
    }

    public void addBook(Book book){
        books[numberOfBooks] = book;
        numberOfBooks++;
    }

    public void displayBooks(){
        for(int i = 0; i < numberOfBooks; i++){
            System.out.println(books[i].title);
            System.out.println(books[i].author);
            System.out.println(books[i].pages);
            System.out.println("------------------");
        }
    }

}
