public class Day03ForLoops {
    // class constant - cannot be reassigned; ALL_CAPS; must be given a value at start
    public static final int SIZE = 15;

    public static void main(String[] args) {
        dotBox();
        dotNumBox();
        dollarFigure();
        scaledDotNumBox();
        dollarFigure2();
    }

    /*
       This method creates a box made out of periods (5 x 4)
       ....
       ....
       ....
       ....
       ....
       How do we make this dot-box longer? wider?
       How could we print the line number at the front of each row?
    */
    public static void dotBox() {
        for(int line = 1; line <= 5; line++) {
            for(int dot = 1; dot <= 4; dot++) {
                System.out.print(".");
            }
            System.out.println();
        }
    }

    // This method shows how to systematically produce repetitive ASCII art
  /*
    .......1
    ......2
    .....3
    ....4
    ...5
    ..6
    .7
    8
  */
    public static void dotNumBox() {
        // First without a systematic approach
//        for (int i = 1; i <= 8; i++) {
//            for (int j = 8; j > i; j--) {
//                System.out.print(".");
//            }
//            System.out.println(i);
//        }

        // With a systematic approach
//        for (int i = 1; i <= 8; i++) {
//            for (int j = 0; j < -1 * i + 8; j++) {
//                System.out.print(".");
//            }
//            System.out.println(i);
//        }
        // With a second set of dots
        for (int i = 1; i <= 8; i++) {
            for (int j = 8; j > i; j--) {
                System.out.print(".");
            }
            System.out.print(i);
            for (int k = 0; k < i - 1; k++) {
                System.out.print(".");
            }
            System.out.println();
        }
    }

    // This is PracticeIt Exercise 2.22 which produces:
   /*
      $$$$$$$**************$$$$$$$
      **$$$$$$************$$$$$$**
      ****$$$$$**********$$$$$****
      ******$$$$********$$$$******
      ********$$$******$$$********
      **********$$****$$**********
      ************$**$************
   */
    public static void dollarFigure() {
        for (int line = 0; line < 7; line++) {
            for (int j = 0; j < 2 * line; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 7 - line; j++) {
                System.out.print("$");
            }
            for (int j = 0; j < 2 * (7 - line); j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 7 - line; j++) {
                System.out.print("$");
            }
            for (int j = 0; j <2 * line; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // This method allows the dot/num box above to be scaled using the class constant
    public static void scaledDotNumBox() {
        for (int i = 1; i <= SIZE; i++) {
            for (int j = SIZE; j > i; j--) {
                System.out.print(".");
            }
            System.out.print(i);
            for (int k = 0; k < i - 1; k++) {
                System.out.print(".");
            }
            System.out.println();
        }
    }

    // This is PracticeIt Exercise 2.23 which is a scalable version of Ex 2.22:
    public static void dollarFigure2() {
        for (int line = 0; line < SIZE; line++) {
            for (int j = 0; j < 2 * line; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < SIZE - line; j++) {
                System.out.print("$");
            }
            for (int j = 0; j < 2 * (SIZE - line); j++) {
                System.out.print("*");
            }
            for (int j = 0; j < SIZE - line; j++) {
                System.out.print("$");
            }
            for (int j = 0; j <2 * line; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}