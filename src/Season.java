import java.util.Scanner;

public class Season {
    public static String season(int month, int day){
        String season;
        if (day <= 0 ) season = "Invalid Input";
        else if((month == 12 && (21 <= day && day <= 31)) || (month > 0 && month < 3) ||
                (month == 3 && day < 20)) season = "Winter";
        else if((month >= 3 && month <= 5) || (month == 6 && day <= 19)) season = "Spring";
        else if((month >= 6 && month < 9) || (month == 9 && day <= 21)) season = "Summer";
        else if(month >= 9 && month <= 12) season = "Fall";
        else season = "Invalid Input";
        return season;
    }
}
