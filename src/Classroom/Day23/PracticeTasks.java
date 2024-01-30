package Classroom.Day23;

public class PracticeTasks {
    public static void main(String[] args) {
//        int[] array = {1,2,9,4,5};
//        int n = 9;
//        System.out.println(findElement(array, 9));
//        printStr("f");
//        validPassword("hellobatch5");
        int[] array = {1,2,55,12,14,13,6,7,99};
        findSumUntil13(array);
    }

    public static boolean findElement(int[] array, int n){
        for(int i = 0; i < array.length; i++){
            if(array[i] == n){
                return true;
            }
        }
        return false;
    }

    public static void printStr(String str){
        if(str.length()<2){
            System.out.println("Too short string");
        }
        else{
            System.out.println(str.substring(1,str.length()-1));
        }
    }

    public static void validPassword(String password){
        System.out.println(password.length()>10 && password.contains("@"));
    }

    public static void findSumUntil13(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == 13){
                break;
            }
            sum+=array[i];
        }
        System.out.println(sum);
    }
}
