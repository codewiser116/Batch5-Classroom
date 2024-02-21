package Classroom.Day35.library;

import java.util.ArrayList;

public class Library {
    ArrayList<LibraryItem> items = new ArrayList<>();

    public void addLibraryItem(LibraryItem item){
        items.add(item);
        System.out.println(item.title + " is added!!!" );
    }

    public void displayItems(){
        for(LibraryItem i: items){
            System.out.println(i.title);
            if(i instanceof Book){
                Book book = ((Book)i);
                System.out.println(book.author);
            }
            else{
                DVD dvd = ((DVD)i);
                System.out.println(dvd.director);
            }
        }
    }

    public void deleteItem(String title){


    }

    // updatebook method



    // updatedvd method




}
