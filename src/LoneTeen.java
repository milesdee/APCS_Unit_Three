public class LoneTeen {

    public static boolean loneTeen(int num1, int num2){
        if ((num1 >= 13) && (num1 <= 19)){
            if ((num2 >= 13) && (num2 <= 19)) return false;
            else return true;
            }
        else if ((num2 >= 13) && (num2 <= 19)) return true;
        else return false;
    }
}
