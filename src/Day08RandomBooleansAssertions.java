import java.security.SecureRandom;
import java.util.Random;

public class Day08RandomBooleansAssertions {

    public static void main(String[] args) {
        int x = random();
        System.out.printf("x is %d\n", x);
        boolean factor = isFactor(3,x);
        System.out.println("result of isFactor(3,x) where x = " + x + " is " + factor);
        System.out.println( isEven(x) ? "Even Number" : "Odd Number" );
        System.out.println( allSmallDigits(x) ? "Hey, they all fits!" : "Some of them are two fat!!!!" );
//        System.out.println( isReverse("hello","olleh") );
    }

    // returns a random integer between 1 and 100
    public static int random() {
        Random randGen = new Random();
        int num = randGen.nextInt(100) + 1;
        return num;
    }

    // returns true if x is a factor of y
    // Question: is x here the same as the x in the main?
    public static boolean isFactor(int x, int y) {
        return x != 0 && y % x == 0;
    }

    // returns true is num is even, false if it's odd
    // e.g. isEven(10) --> true
    // e.g. isEven(-1) --> false
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    // returns true if all digits are smaller than 5
    // e.g. allSmallDigits(1233) --> true
    // e.g. allSmallDigits(99) --> false
    // e.g. allSmallDigits(1190) --> false
    // Question: is x here the same as the x in the main?
    public static boolean allSmallDigits(int x) {
        boolean status = true;

        while (x > 0) {
            status &= x % 10 < 5;
            x /= 10;
        }
        return status;
    }

    // returns true if the strings are reverse of each other
    // e.g. isReverse("hello","olleh") --> true
    // e.g. isReverse("time","fine") --> false
    public static boolean isReverse(String s1, String s2) {
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(s2.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}