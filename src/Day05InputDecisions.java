import java.util.Scanner;

public class Day05InputDecisions {

    public static void main(String[] args) {
        // creates a Scanner object called console for User Input
        Scanner console = new Scanner(System.in);

//        repeatPhrase();
//        repeatPhrase(console);

       double finalPercentage = calcGrade(console);
       System.out.println("Expected Final Grade: " + finalPercentage);
       double finalGpa = calcGPA(finalPercentage);
       System.out.println("Expected Final GPA: " + finalGpa);
    }

    // takes a phrase and a number
    // prints the phrase to the screen that number of times
    // what if "returns"?
    public static String repeatPhrase(String word, int iter) {
        String out = "";
        for (int i = 0; i < iter; i++) {
//            System.out.println(word);
            out += word + "\n";
        }
        return out;
    }

    // prompts for a phrase and a number
    // prints the phrase to the screen, one letter per line, all caps
    // repeatPhrase() where the user types in "try" and 3
   /* should produce: 
      TTT
      RRR
      YYY
   */
    public static void repeatPhrase(Scanner console) {
        System.out.print("Pharse: ");
        String word = console.next();

        System.out.print("Repeats: ");
        int iter = console.nextInt();

        // convert all charters to upper case
        word = word.toUpperCase();

        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < iter; j++) {
                System.out.print(word.charAt(i));
            }
            System.out.println();
        }
    }

    // prompts for your percentage grade in the following categories:
    // Individual Homework (30%)
    // Learning Practice (20%)
    // Midterm (20%)
    // Final (30%)
    // returns the calculated final percentage for the class
    public static double calcGrade(Scanner console) {
        System.out.println("Enters your percentage(%) grade in the following categories");
        System.out.print("Individual Homework: "); double individualHomeork = console.nextInt();
        System.out.print("Learning Practice: ");   double learningPractice = console.nextInt();
        System.out.print("Midterm: ");             double midterm = console.nextInt();
        System.out.print("final: ");               double finals = console.nextInt();

        return individualHomeork * 0.3 + learningPractice * 0.2 + midterm * 0.2 + finals * 0.3;
    }

    // takes a percentage grade as a parameter
    // returns the calculated gpa, according to the following:
    // >= 95% is a 4.0
    // 94 is a 3.9
    // 93 is a 3.8
    // 92 is a 3.7
    // 91 is a 3.6
    // 90 is a 3.5
    // else return 2.0 for now
    public static double calcGPA(double grade) {
        if (grade >= 95) {
            return 4.0;
        }
        if (grade >= 90) {
            for (double i = 1; i <= 5; i++) {
                if (95 - i == grade) {
                    return 4.0 - i / 10;
                }
            }

        }

        return 2.0;
    }
}