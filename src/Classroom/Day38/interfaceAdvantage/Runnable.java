package Classroom.Day38.interfaceAdvantage;

public interface Runnable extends WalkAble{
    default void run(){
        System.out.println("run");
    }
}
