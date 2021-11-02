import java.util.Scanner;

public class EasterDate {
    public static boolean isValidYear(int userInput){
        return userInput > 1899 && userInput < 2100;
    }
    public static String dateOfEaster(int year){
        int a = year % 19;
        int b = year % 4;
        int c = year % 7;
        int d = (19 * a + 24) % 30;
        int e = (2*b + 4*c + 6*d + 5) % 7;
        String month;
        int day;
        if (year == 1954 || year == 1981 || year == 2049 || year == 2076) day = 15 + d + e;
        else day = 22 + d + e;
        if (day <= 31) month = "March";
        else {
            day -= 31;
            month = "April";
        }
        return "In " + year + " Easter is on " + month + " " + day;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean e = true;
        while (e) {
            System.out.println("Please enter a year between 1900 and 2099");
            int year = scan.nextInt();
            if (EasterDate.isValidYear(year)) {
                System.out.println(dateOfEaster(year));
                e = false;
            }
            else System.out.println("Try again!");
        }
    }
}
