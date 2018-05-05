// Hartman Tam
// CS 141
// HW Core Topics: loops, Scanner, return, parameter
//
// This program will compare two days net calories and determine performance.

import java.util.Scanner;

public class MyCalorieTracker {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // get basic information
        welcome();
        int goal = setGoal(console);

        // day 1
        int d1_intake = dailyIntake(console, 1);
        int d1_burned = dailyBurnedOut(console);

        // day 2
        int d2_intake = dailyIntake(console, 2);
        int d2_burned = dailyBurnedOut(console);

        // print summary
        int d1_net = summary(1, d1_intake, d1_burned);
        int d2_net = summary(2, d2_intake, d2_burned);

        // print misc.
        printTwoDayComparision(goal, d1_net, d2_net);
        printTwoDaysAverage(d1_net, d2_net);
        printDisclaimer();
    }

    // Print out welcome text
    public static void welcome() {
        System.out.println("This program compares your daily caloric intake\n" +
                "for two days and determines which day was better\n" +
                "in regards to reaching your fitness goals.\n");
    }

    // Set daily calories goal
    public static int setGoal(Scanner console) {
        System.out.print("What is your calories goal for the day? > ");
        int goal = console.nextInt();
        System.out.println();
        return goal;
    }

    // Get user's daily calories intake
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

    // Get user's daily burned calories
    public static int dailyBurnedOut(Scanner console) {
        System.out.print("\t\twhat was your activity level? 1) not active 2) lightly active\n" +
                "\t\t\t\t\t\t\t\t\t  3) active or 4) very active? ");
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

    // print summary; return net calories
    public static int summary(int day, int intake, int burned) {
        int net = netCalories(intake, burned);
        System.out.printf("Day %d Net Calories = %d\n", day, net);
        return net;
    }

    // print comparision
    public static void printTwoDayComparision(int goal, int day1_net, int day2_net) {
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

    // print two days average
    public static void printTwoDaysAverage(int day1_net, int day2_net) {
        System.out.printf("Average Net Calories = %.1f\n\n", averageOfTwoNumbers(day1_net, day2_net));
    }

    // average number helper function
    public static double averageOfTwoNumbers(double a, double b) {
        return (a + b) / 2;
    }

    // net number helper function
    public static int netCalories(int intake, int burned) {
        return intake - burned;
    }

    // print disclaimer
    public static void printDisclaimer() {
        System.out.println("** DISCLAIMER: Summary results are probably wrong. I\n" +
                "wouldn't trust them if I were you.");
    }
}
/*
    Output:

    This program compares your daily caloric intake
    for two days and determines which day was better
    in regards to reaching your fitness goals.

    What is your calories goal for the day? > 1200

    Information for Day #1:
    how many meals did you eat? > 3
    how many calories were consumed in meal 1? 350
    how many calories were consumed in meal 2? 350
    how many calories were consumed in meal 3? 600
    -- Total caloric intake = 1300 --
    what was your activity level? 1) not active 2) lightly active
    3) active or 4) very active? 1
    -- Estimated active caloric burn = 0 --

    Information for Day #2:
    how many meals did you eat? > 5
    how many calories were consumed in meal 1? 250
    how many calories were consumed in meal 2? 180
    how many calories were consumed in meal 3? 400
    how many calories were consumed in meal 4? 250
    how many calories were consumed in meal 5? 600
    -- Total caloric intake = 1680 --
    what was your activity level? 1) not active 2) lightly active
    3) active or 4) very active? 3
    -- Estimated active caloric burn = 500 --

    Day 1 Net Calories = 1300
    Day 2 Net Calories = 1180
    You were closer to your goal on Day 2**
    Average Net Calories = 1240.0

    ** DISCLAIMER: Summary results are probably wrong. I
    wouldn't trust them if I were you.

*/
