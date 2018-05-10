import java.io.*;
import java.util.*;

public class Day11FileProcessing {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner numFile = new Scanner(new File("src/day11/numbers.txt"));
        //echo10(numFile);
        //echoAll(numFile);
        //sumAll(numFile);
        //System.out.println("Are all tokens increasing? " + isIncreasing(numFile));

        //Scanner wordsFile = new Scanner(new File("src/day11/words.txt"));
        //echoWords(wordsFile);
        //abcWords(wordsFile);

        Scanner checkFile = new Scanner(new File("src/day11/grades.txt"));
        gradeReport(checkFile);
    }

    // echos the first 10 ints in a file
    public static void echo10(Scanner in) {
        for (int i = 1; i <= 10; i++) {
            int token = in.nextInt();
            System.out.println("number = " + token);
        }
    }

    // echos all the ints in a file
    public static void echoAll(Scanner in ) {
        while ( in .hasNextInt()) {
            int token = in .nextInt();
            System.out.println("number = " + token);
        }
    }

    // reads all int tokens from an input file, adding them up
    // prints total ints found, sum of all numbers, and the average
    public static void sumAll(Scanner in) {
        int total = 0;
        int sum = 0;
        while (in.hasNextInt()) {
            int token = in.nextInt();
            total++;
            sum += token;
        }
        System.out.printf("total = %d\n", total);
        System.out.printf("sum   = %d\n", sum);
        System.out.printf("avg   = %f\n", (double)sum/total);
    }

    // determines whether or not all the tokens in an input file
    // are in increasing order (compares token to token)
    public static boolean isIncreasing(Scanner in ) {
        int n = Integer.MIN_VALUE;
        while (in.hasNextInt()) {
            int k = in.nextInt();
            if (n > k) {
                return false;
            }
            n = k;
        }
        return true;
    }

    // echos all the words in a file
    public static void echoWords(Scanner in ) {
        while(in.hasNext()) {
            String word = in.next();
            System.out.println(word);
        }
    }

    // prints the number of A, B, and C words in a file
    public static void abcWords(Scanner in ) {
        int a = 0, b = 0, c = 0;
        while(in.hasNext()) {
            char word = in.next().toLowerCase().charAt(0);
            if (word == 'a') {
                a++;
            } else if (word == 'b') {
                b++;
            } else if (word == 'c') {
                c++;
            }
        }
        System.out.printf("Number of As: %d\n", a);
        System.out.printf("Number of Bs: %d\n", b);
        System.out.printf("Number of Cs: %d\n", c);
    }

    // Reads file containing a series of student grade summaries:
    //    each summary contains a name followed by GPA grades
    // Report each student's average in the following format:
    //    Nikita = 3.83 average for 3 grades
    public static void gradeReport(Scanner in ) {
        while(in.hasNext()) {
            String name = in.next();
            double score = 0;
            int grades = 0;
            while(in.hasNextDouble()) {
                score += in.nextDouble();
                grades++;
            }
            double average = score/grades;
            System.out.printf("%s = %.2f average for %d grades\n", name, average, grades);
        }
    }
}
