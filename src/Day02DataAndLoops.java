// Hartman Tam
// CS 141
// HW Core Topics: 
//
// This program will 

/*
|   literal type       |  examples           | java data type
|----------------------|---------------------|-----------------
| whole numbers        |    |
| decimal numbers      |    |
| series of characters |    |
*/

public class Day02DataAndLoops {

    public static void main(String[] args) {
        expressionMystery();
        forLoop();
        beer();
        nestedLoop();
    }

    // should print the "beer song" from 10 to 1
    public static void beer() {
        for (int i=10;i>0;i++) {
            System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer");
            System.out.println("Take one down, pass it around, "+ (i-1) +" bottles of beer on the wall");
        }
    }

    public static void forLoop() {
//        for (int i=0; i<=10; i++) {
//            System.out.println(i);
//        }
        for (int i=10;i>0;i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void nestedLoop() {

    }

    // evaluating expressions
    public static void expressionMystery() {
        System.out.println("A look at expression evaulation: ");

        System.out.print("4 + 7 * 3 = ");
        System.out.println(4+7*3);// 4 + 7 * 3 );

        System.out.print("(4 + 7) * 3 = ");
        System.out.println((4+3)*3);// (4 + 7) * 3 );

        System.out.print("2 * 3 * 2 + 1 * 9 * 3 = ");
        System.out.println(2*3*2+1*9*3);// 2 * 3 * 2 + 1 * 9 * 3 );

        System.out.print("105 % 10 - 2 = ");
        System.out.println(105%10-2);// 105 % 10 - 2 );

        System.out.print("1 / 2 = ");
        System.out.println(1/2);// 1 / 2 );

        System.out.print("1.0 / 2 = ");
        System.out.println(1.0/2);// 1.0 / 2 );

        System.out.print("(double)(1 / 2) = ");
        System.out.println((double) (1/2));// (double)(1 / 2) );

        System.out.print("(double) 1 / 2 = ");
        System.out.println((double) 1/2);// (double) 1 / 2 );

        System.out.print("4 + 4 + \"hello\" = ");
        System.out.println(4+4+"\"hello\"");// 4 + 4 + "hello" );

        System.out.print("\"hello\" + 4 + 4 = ");
        System.out.println("\"hello\""+4+4);// "hello" + 4 + 4 );
    }
}