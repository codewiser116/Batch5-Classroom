package Classroom.Day44;

public class FindFirstLast {
    public static void main(String[] args) {
//        array - [1,2,3,3,7], target = 3
        int[] array = {1,2,3,3,3,7};
        int target = 3;
        int first = -1, last = -1;
        for(int i = 0; i<array.length; i++){
            if (array[i]!=target){
                continue;
            }
            if(first==-1){
                first = i;
            }
            last = i;
        }
        System.out.println(first + " " + last);
    }
}
