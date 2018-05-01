import java.util.Random;

public class Day08RandomBooleansAssertions {

    public static void main(String[] args) {
        int x = random();
//       boolean factor = isFactor(3,x);
//       System.out.println("result of isFactor(3,x) where x = " + x + " is " + factor);
//       System.out.println( isEven(x) );
//       System.out.println( allSmallDigits(x) );
//       System.out.println( isReverse("hello","olleh") );
    }

    // returns a random integer between 1 and 100
    public static int random() {
        return 0;
    }

    // returns true if x is a factor of y
    // Question: is x here the same as the x in the main?
    public static boolean isFactor(int x, int y) {
        return false;
    }

    // returns true is num is even, false if it's odd
    // e.g. isEven(10) --> true
    // e.g. isEven(-1) --> false
    public static boolean isEven(int num) {
        return false;
    }

    // returns true if all digits are smaller than 5
    // e.g. allSmallDigits(1233) --> true
    // e.g. allSmallDigits(99) --> false
    // e.g. allSmallDigits(1190) --> false
    // Question: is x here the same as the x in the main?
    public static boolean allSmallDigits(int x) {
        return false;
    }

    // returns true if the strings are reverse of each other
    // e.g. isReverse("hello","olleh") --> true
    // e.g. isReverse("time","fine") --> false
    public static boolean isReverse(String s1, String s2) {
        return false;
    }
}