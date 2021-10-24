public class Palindrome {

    // Write your isPalindrome method in the space below.
    // You do not need to write a main method for this program
    // Your method should be static.
    public static boolean isPalindrome(int number){
        boolean palin;
        String numString = String.valueOf(number);
        System.out.println(numString.length());
        if (numString.length() == 5){
            String numReversed = numString.substring(4) + numString.charAt(3) +
                    numString.charAt(2) + numString.charAt(1) + numString.charAt(0);
            System.out.println(numString);
            System.out.println(numReversed);
            palin = numReversed.equals(numString);
        }
        else{
            palin = false;
        }
        return palin;
    }
}
