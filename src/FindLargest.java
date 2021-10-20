import java.util.Scanner;

public class FindLargest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // Prompt the user for two integer variables
        System.out.print("Give me the first number: ");
        int firstNumber = scan.nextInt();
        System.out.print("Give me the second number: ");
        int secondNumber = scan.nextInt();
        // Create a series of if statements that will print which number is larger or if they are equal
        if (firstNumber > secondNumber){
            System.out.println(firstNumber + " is larger than " + secondNumber);
        }
        if (firstNumber < secondNumber){
            System.out.println(secondNumber + " is larger than " + firstNumber);
        }
        if (firstNumber == secondNumber){
            System.out.println(firstNumber + " and " + secondNumber + " are equal");
        }
        // Make sure your output matches the samples or the tests will not pass.
    }
}
