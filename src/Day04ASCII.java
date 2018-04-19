public class Day04ASCII {

    public static void main(String[] args) {
//        numberTri();
        hourglass();
//        hourglass_reverse_cone();
    }

    public static final int LINES = 8;


    /* This method should produce the following
       -----1-----
       ----333----
       ---55555---
       --7777777--
       -999999999-
    */
    public static void numberTri() {
    }

    /* This method should produce the following
       |""""""""""|
        \::::::::/
         \::::::/
          \::::/
           \::/
            ||
           /::\
          /::::\
         /::::::\
        /::::::::\
       |""""""""""|
    */
    public static void hourglass() {
        hourglass_cap(LINES);
        hourglass_reverse_cone(LINES);
        hourglass_belt(LINES);
        hourglass_cone(LINES);
        hourglass_cap(LINES);
    }

    public static void hourglass_cap(int lines) {
        System.out.print("|");
        for (int i = 0; i < 2 * lines + 2; i++) {
            System.out.print("\"");
        }
        System.out.println("|");
    }

    public static void hourglass_belt(int lines) {
        for (int i = 0; i < lines + 1; i++) {
            System.out.print(" ");
        }
        System.out.println("||");
    }

    public static void hourglass_cone(int lines) {
        // Define the number of lines
        for (int i = 0; i < lines; i++) {
            // Print out space padding
            for (int k = (lines - i); k > 0; k--) {
                System.out.print(" ");
            }
            // Starts to print actual shape
            System.out.print("/");
            for (int j = 0; j < (i * 2 + 2); j++) {
                System.out.print(":");
            }
            System.out.println("\\");
        }
    }

    public static void hourglass_reverse_cone(int lines) {
        for (int i = 0; i < lines; i++) {
            // Print out space padding
            for (int k = 0; k < i + 1; k++) {
                System.out.print(" ");
            }
            // Starts to print actual shape
            System.out.print("\\");
            for (int j = (2 * (lines - i)); j > 0; j--) {
                System.out.print(":");
            }
            System.out.println("/");
        }
    }
}