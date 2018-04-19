public class Day04ASCII {

    public static void main(String[] args) {
//        numberTri();
        hourglass();
//        hourglass_reverse_cone();
    }


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
        hourglass_cap();
        hourglass_reverse_cone();
        hourglass_belt();
        hourglass_cone();
        hourglass_cap();
    }

    public static void hourglass_cap() {
        System.out.print("|");
        for (int i = 0; i < 10; i++) {
            System.out.print("\"");
        }
        System.out.println("|");
    }

    public static void hourglass_belt() {
        for (int i = 0; i < 5; i++) {
            System.out.print(" ");
        }
        System.out.println("||");
    }

    public static void hourglass_cone() {
        // Define the number of lines
        for (int i = 0; i < 4; i++) {
            // Print out space padding
            for (int k = (4 - i); k > 0; k--) {
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

    public static void hourglass_reverse_cone() {
        for (int i = 0; i < 4; i++) {
            // Print out space padding
            for (int k = 0; k < i + 1; k++) {
                System.out.print(" ");
            }
            // Starts to print actual shape
            System.out.print("\\");
            for (int j = (8 - 2 * i); j > 0; j--) {
                System.out.print(":");
            }
            System.out.println("/");
        }
    }
}