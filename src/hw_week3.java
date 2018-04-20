// Hartman Tam
// CS 141
// HW Core Topics: java.util.Scanner, for loops, if statements
//
// This program will print out a scalable firecracker

import java.util.Scanner;

public class hw_week3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Please enter the size of firecracker: ");
        int size = console.nextInt();

//        int size = 8;

        cone(size + 1);
        stageConnector(size + 1);
        secondStage(size - 2);
        stageConnector(size + 1);
        thridStage(size);
        stageConnector(size + 1);
        nozzle(size - 1);
    }

    // This method generate and prints out the cone on the top with specified layers.
    public static void cone(int layers) {
        for (int i = 0; i < layers; i++) {
            for (int k = (layers - i - 1); k > 0; k--) {
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
    public static void secondStage(int layers) {
        for (int i = 0; i < layers; i++) {
            System.out.print("  ");
            for (int j = 0; j < 2 * layers + 2; j++) {
                if (j % 2 == 0) {
                    System.out.print("|");
                } else {
                    System.out.print("-");
                }
            }
            System.out.print("|");
            System.out.println();
        }
    }

    // This method generate and prints out the cone on the top with specified layers.
    public static void thridStage(int layers) {
        for (int i = layers; i > 0; i--) {
            System.out.print(" |");
            for (int k = 0; k < layers - i; k++) {
                System.out.print(".");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("~");
            }
            for (int m = 0; m < layers - i; m++) {
                System.out.print(".");
            }
            System.out.print("|");
            System.out.println();
        }
    }

    // This method generate and prints out the cone on the top with specified layers.
    public static void stageConnector(int span) {
        System.out.print("[");
        for (int i = 0; i < 2 * span - 1; i++) {
            if (i % 2 == 0) {
                System.out.print("=");
            } else {
                System.out.print("I");
            }
        }
        System.out.print("]");
        System.out.println();
        for (int i = 0; i < 2 * span + 1; i++) {
            System.out.print("=");
        }
        System.out.println();
    }

    // This method generate and prints out the cone on the top with specified layers.
    public static void nozzle(int layers) {
        for (int i = 0; i < layers; i++) {
            for (int j = layers + 2; j > i; j--) {
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
