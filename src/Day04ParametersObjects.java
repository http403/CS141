public class Day04ParametersObjects {

    public static void main(String[] args) {
        methodsWithParams();
        //ten();
        //quadratic(1, -7, 12);       // 4.0, 3.0
        //quadratic(1, 3, 2);         // -1.0, -2.0
        //sillyString("Shoreline");
        //sillyString("Hello World");
    }

    // this methods shows calling a method with different arguments
    public static void methodsWithParams() {
        love("naps", "sunrises", "vacation");
        love("dogs", "lattes", "running");
        love("homework",200);
    }

    // this method prints out three items that are loved
    // What happens if the order of the parameters is changed?
    // What happens if you try to call this method without 3 arguments?
    public static void love(String fave1, String fave2, String fave3) {
        System.out.println("I love:");
        System.out.println("\t1. " + fave1);
        System.out.println("\t2. " + fave2);
        System.out.println("\t3. " + fave3);
        System.out.println();
    }

    // this method overloads "love" for 2 parameters
    public static void love(String fave, int num) {
        System.out.println("I love " + fave + " " + num + " times more than anything else in the world!");
    }

    // this method should return the int literal 10
    public static void ten() {
        System.out.println("10");
    }

    // From PracticeIt BJP4 Exercise 3.8: quadratic
    // This method solves quadratic equations and prints their roots
    // A quadratic roots can be found using the equations:
    // first root: x = (-b + squareroot(square(b) - 4ac)) / 2a
    // second root: x = (-b - squareroot(square(b) - 4ac)) / 2a
    public static void quadratic(int a, int b, int c) {
//       double firstRoot = quadPlus(a,b,c);
//       double secondRoot = quadMinus(a,b,c);

    }

    // This method prints out information about a given String
    public static void sillyString(String s) {
        System.out.println("Given the string: " + s);
        System.out.println("First letter: ");
        System.out.println("Last letter: ");
        System.out.println("Everything but the first and last: ");
        System.out.println("In all caps: ");
        System.out.println("In all lowercase: ");
        System.out.println("Is is \"Hello World\"? ");
        System.out.println("Index of \"e\"? ");
    }
}
