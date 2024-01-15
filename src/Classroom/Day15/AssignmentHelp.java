package Classroom.Day15;

public class AssignmentHelp {
    public static void main(String[] args) {
        String str = "i ding is";
        // is
        // s
        //  d
        // di
        // ...
        int count = 0;
        for(int i = 0; i < str.length()-1; i++){
            String twoChars = str.substring(i,i+2);
            if(twoChars.equals("is")){
                count++;
            }
        }
        System.out.println(count);


    }
}
