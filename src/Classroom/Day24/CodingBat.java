package Classroom.Day24;

public class CodingBat {
    public static void main(String[] args) {
//        System.out.println(sleepIn(true, true)); // true
//        System.out.println(frontBack("")); // eodc
        posNeg(-4, 5, true);
    }

//    posNeg(1, -1, true) → false
//    posNeg(-1, 1, false) → true
//    posNeg(-4, -5, true) → true

    public static boolean posNeg(int a, int b, boolean negative) {
        if(negative && a<0 && b<0){
            System.out.println("IF");
            return true;
        }
        else if(!negative && a>0 && b<0 || a<0 && b>0){
            System.out.println("ELSE IF");
            return true;
        }
        else{
            System.out.println("ELSE");
            return false;
        }
    }


    public static String startOz(String str) {
        if(str.isEmpty()){
            return "";
        }
        else if(str.startsWith("oz")){
            return "oz";
        }
        else if(str.charAt(0)=='o'){
            return "o";
        }
        else if(str.charAt(1)=='z'){
            return "z";
        }
            return "";
    }


    public static boolean sleepIn(boolean weekDay, boolean vacation){
        if(weekDay == false || vacation){
            return true;
        }
        else {
            return false;
        }
    }

    public static String frontBack(String str) {
        if(str.length()<2){
            return str;
        }


        return str.charAt(str.length()-1) +
                str.substring(1, str.length()-1) + str.charAt(0);
    }
}
