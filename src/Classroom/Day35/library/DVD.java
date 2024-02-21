package Classroom.Day35.library;

public class DVD extends LibraryItem{
    String director;

    public DVD(String title, String director) {
        super(title);
        this.director = director;
    }
}
