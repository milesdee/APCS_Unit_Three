import java.util.Scanner;
public class AddToPositiveOrNegativeSum {
    public static void main(String[] args) {
        // declare and instantiate a Scanner variable and object
        Scanner scan = new Scanner(System.in);
        // declare and initialize variables for a positive and negative sum
        int posSum = 0;
        int negSum = 0;
        for (int i = 1; i <= 10; i++) {
            /* in this block, allow the user to input a number and add the number to the appropriate sum */
            System.out.println("Enter a number: ");
            int input = scan.nextInt();
            if (input > 0){
                posSum += input;
            }
            else{
                negSum += input;
            }
        } // end of for loop
        // output the sums. Make sure the format matches the sample
        System.out.println("The sum of the positive numbers is " + posSum);
        System.out.println("The sum of the negative numbers is " + negSum);
    }
}

