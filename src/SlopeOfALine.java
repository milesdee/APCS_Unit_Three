import java.util.Scanner;

public class SlopeOfALine {

    /**
     * Calculates slope (y2-y1)/(x2-x1) of a line as long as x2 - x1 != 0
     * @param x1 - x-coordinate of first point
     * @param y1 - y-coordinate of first point
     * @param x2 - x-coordinate of second point
     * @param y2 - y-coordinate of second point
     * @return - Different strings based on whether the line is vertical or not
     */
    public static String slope(double x1, double y1, double x2, double y2) {
        double slope;
        String response;
        slope = ((y2-y1)/(x2-x1));
        if (slope == Double.POSITIVE_INFINITY){
            slope = 0;
            response = "The slope of " + (int)x1 + ", " + (int)y1 + ", " + (int)x2 + ", " +
                    (int)y2 + " is a vertical line and therefore " + (int)slope;
        }
        if (slope == Double.NEGATIVE_INFINITY){
            slope = 0;
            response = "The slope of " + (int)x1 + ", " + (int)y1 + ", " + (int)x2 + ", " +
                    (int)y2 + " is a vertical line and therefore " + (int)slope;
        }
        else {
            response = "The slope of " + (int) x1 + ", " + (int) y1 + ", " + (int) x2 + ", " +
                    (int) y2 + " is " + slope;
        }
        return response;
    }

    public static void main(String[] args) {
        // Get input from the user (you will need to create a Scanner object)
        // Call and print the result of the slope method as shown in the instructions.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter x1: ");
        double x1 = scan.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scan.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = scan.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scan.nextDouble();

        System.out.println(SlopeOfALine.slope(x1, y1, x2, y2));
    }
}
