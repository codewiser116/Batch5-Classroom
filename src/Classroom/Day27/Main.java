package Classroom.Day27;

public class Main {
    public static void main(String[] args) {
        System.out.println(Computer.number);
    }

    public static boolean noTriples(int[] array){
        for(int i = 0; i < array.length-2; i++){
            if(array[i] == array[i+1] && array[i+1] == array[i+2]){
                return false;
            }
        }
        return true;
    }
}
