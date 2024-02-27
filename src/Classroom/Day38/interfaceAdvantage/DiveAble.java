package Classroom.Day38.interfaceAdvantage;

public interface DiveAble {
    default void dive(){
        System.out.println("Dive");
    }
}
