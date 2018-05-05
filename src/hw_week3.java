// Hartman Tam
// CS 141
// HW Core Topics: class constants, nested loops, if statements
//
// This program will print out a scalable firecracker

public class hw_week3 {
    public static final int SIZE = 5;

    public static void main(String[] args) {
        cone();
        stageConnector();
        secondStage();
        stageConnector();
        thridStage();
        stageConnector();
        nozzle();
    }

    // This method generate and prints out the cone on the top with specified layers.
    public static void cone() {
        for (int i = 0; i < SIZE + 1; i++) {
            for (int j = (SIZE - i); j > 0; j--) {
                System.out.print(" ");
            }
            System.out.print("/");
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("x");
            }
            System.out.print("\\");
            System.out.println();
        }
    }

    // This method generate and prints out the cone on the top with specified layers.
    public static void secondStage() {
        for (int i = 0; i < SIZE -2; i++) {
            System.out.print("  ");
            for (int j = 0; j < SIZE - 1; j++) {
                System.out.print("|-");
            }
            System.out.print("|");
            System.out.println();
        }
    }

    // This method generate and prints out the cone on the top with specified layers.
    public static void thridStage() {
        for (int i = SIZE; i > 0; i--) {
            System.out.print(" |");
            for (int j = 0; j < SIZE - i; j++) {
                System.out.print(".");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("~");
            }
            for (int j = 0; j < SIZE - i; j++) {
                System.out.print(".");
            }
            System.out.print("|");
            System.out.println();
        }
    }

    // This method generate and prints out the cone on the top with specified layers.
    public static void stageConnector() {
        System.out.print("[");
        for (int i = 0; i < 2 * SIZE + 1; i++) {
            if (i % 2 == 0) {
                System.out.print("=");
            } else {
                System.out.print("I");
            }
        }
        System.out.print("]");
        System.out.println();
        for (int i = 0; i < 2 * SIZE + 3; i++) {
            System.out.print("=");
        }
        System.out.println();
    }

    // This method generate and prints out the cone on the top with specified layers.
    public static void nozzle() {
        for (int i = 0; i < SIZE - 1; i++) {
            for (int j = SIZE + 1; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("/");
            }
            System.out.print("|");
            for (int j = 0; j < i; j++) {
                System.out.print("\\");
            }
            System.out.println();
        }
    }
}

/* Output, SIZE = 5

         /x\
        /xxx\
       /xxxxx\
      /xxxxxxx\
     /xxxxxxxxx\
    /xxxxxxxxxxx\
    [=I=I=I=I=I=]
    =============
      |-|-|-|-|
      |-|-|-|-|
      |-|-|-|-|
    [=I=I=I=I=I=]
    =============
     |~~~~~~~~~|
     |.~~~~~~~.|
     |..~~~~~..|
     |...~~~...|
     |....~....|
    [=I=I=I=I=I=]
    =============
          |
         /|\
        //|\\
       ///|\\\

*/
