import java.util.Scanner;

public class DiscriminantAndRoots {

    // Create the method roots in the space below.
    public static String roots(int a, int b, int c) {
        int discriminant = (b * b - 4 * a * c);
        String rootStatus;
        if (discriminant > 0){
            rootStatus = "2 real roots";
        }
        else if (discriminant < 0) {
            rootStatus = "2 imaginary roots";
        }
        else{
            rootStatus = "1 real root.";
        }
        // update this line so that it returns properly formatted output
        return a + "x^2 + " + b + "x + " + c + " has " + rootStatus;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the coefficients for a quadratic equation");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        System.out.println(DiscriminantAndRoots.roots(a, b, c));
    }

}
