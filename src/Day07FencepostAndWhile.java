import java.util.Scanner;

public class Day07FencepostAndWhile {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

//        fencepost(10);
//        whileAndDoWhile(console);
//       System.out.println("firstDigit(1234) = " + firstDigit(1234) );
//       System.out.println("firstDigit(-910) = " + firstDigit(-910) );
       showTwos(7);
       showTwos(18);
       showTwos(68);
       showTwos(120);
    }

    // This method demonstrates fencepost problems
    public static void fencepost(int n) {
        for(int i = 1; i <= n; i++) {
            System.out.print(i);
        }
        System.out.println();
    }

    // This method demonstrates while and do while loops
    public static void whileAndDoWhile(Scanner console) {
    }

    // returns the first digit of a number
    // e.g. firstDigit(1234) --> 1
    // e.g. firstDigit(-910) --> 9
    public static int firstDigit(int num) {
        while(Math.abs(num) > 9) {
            num /= 10;
        }
        return num;
    }

    // returns a summary of the factors of two for a given number
    // the logic is that you divide your number by 2 until you reach an odd number
    // e.g. showTwos(18) --> prints "18 = 2 * 9"
    // e.g showTwos(120) --> prints "120 = 2 * 2 * 2 * 15"
    public static void showTwos(int num) {
        System.out.print(num + " = ");
        while (num % 2 == 0) {
            num /= 2;
            System.out.print("2 * ");
        }
        System.out.println(num);
    }
}
