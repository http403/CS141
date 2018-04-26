// Hartman Tam
// CS 141
// HW Core Topics: class constants, nested loops, if statements
//
// This program will print out a scalable firecracker

import java.util.Scanner;

public class MyCalorieTracker {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        welcome();
        int goal = setGoal(console);
        int d1_intake = dailyIntake(console, 1);
        int d1_burned = dailyBurnedOut(console);

        int d2_intake = dailyIntake(console, 2);
        int d2_burned = dailyBurnedOut(console);

        int d1_net = summary(1, d1_intake, d1_burned);
        int d2_net = summary(2, d2_intake, d2_burned);

        twoDayComparsion(goal, d1_net, d2_net);
        printTwoDaysAverage(d1_net, d2_net);
        printDisclaimer();
    }
    public static void welcome() {
        System.out.println("This program compares your daily caloric intake\n" +
                "for two days and determines which day was better\n" +
                "in regards to reaching your fitness goals.\n");
    }
    public static int setGoal(Scanner console) {
        System.out.print("What is your calories goal for the day? > ");
        return console.nextInt();
    }
    public static int dailyIntake(Scanner console, int day) {
        System.out.printf("Information for Day #%d:\n" +
                "\t\thow many meals did you eat? > ", day);
        int meals = console.nextInt();
        int calories = 0;
        for (int i = 0; i < meals; i++) {
            System.out.printf("\t\t\thow many calories were consumed in meal %d? ", i + 1);
            calories += console.nextInt();
        }
        System.out.printf("\t\t-- Total caloric intake = %d --\n", calories);
        return calories;
    }
    public static int dailyBurnedOut(Scanner console) {
        System.out.print("\t\t\twhat was your activity level? 1) not active 2) lightly active\n" +
                "\t\t\t\t\t\t\t\t\t\t\t3) active or 4) very active? ");
        int burned = console.nextInt();
        if (burned == 2) {
            burned = 250;
        } else if (burned == 3) {
            burned = 500;
        } else if (burned == 4) {
            burned = 750;
        } else {
            burned = 0;
        }
        System.out.printf("\t\t-- Estimated active caloric burn = %d --\n\n", burned);
        return burned;
    }
    public static int summary(int day, int intake, int burned) {
        int net = netCalores(intake, burned);
        System.out.printf("Day %d Net Calories = %d\n", day, net);
        return net;
    }
    public static void twoDayComparsion(int goal, int day1_net, int day2_net) {
        int delta_d1 = Math.abs(goal - day1_net);
        int delta_d2 = Math.abs(goal - day2_net);
        if (delta_d1 == delta_d2) {
            System.out.println("Both Day 1 and Day 2 net calories were the same**");
        } else {
            if (delta_d1 > delta_d2) {
                System.out.println("You were closer to your goal on Day 2**");
            } else {
                System.out.println("You wre closer to you goal on Day 1**");
            }
        }
    }
    public static void printTwoDaysAverage(int day1_net, int day2_net) {
        System.out.printf("Average Net Calories = %.1f\n\n", averageOfTwoNumbers(day1_net, day2_net));
    }
    public static double averageOfTwoNumbers(double a, double b) {
        return (a + b) / 2;
    }
    public static int netCalores(int intake, int burned) {
        return intake - burned;
    }
    public static void printDisclaimer() {
        System.out.println("** DISCLAIMER: System results are probably wrong. I\n" +
                "wouldn't trust them if I were you.");
    }
}
