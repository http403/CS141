import java.util.Scanner;

public class Day06CommonAlgos {

    public static void main(String[] args) {

        System.out.println( "Cumulative Sum = " + sumTo(10) );
//       System.out.println( findMax(console) + " was the highest value entered");
//       System.out.println( replicateLetter("apple") );
//       System.out.println( reverse("apple") );
    }

    // This method should take a number as a paramenter
    // and return all the numbers from 1 to n added together
    // returns 1+2+3+...+n
    public static int sumTo(int n) {
        return 0;
    }

    // This method should prompt for 5 int values
    // The method should return the highest value entered
    public static double findMax(Scanner console) {
        return 0;
    }

    // This method should take a string as a parameter
    // and return the string with each letter repeated
    // replicate("apple") --> "aappppllee"
    public static String replicateLetter(String s) {
        return "";
    }

    // This method should take a string as a parameter
    // and return the string reversed
    // reverse("apple") --> "elppa"
    public static String reverse(String s) {
        return "";
    }

    // PracticeIt Exercise 4.1
    public static double fractionSum(int n) {
        double sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += 1.0/i;
        }
        return sum;
    }
}