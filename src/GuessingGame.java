// Hartman Tam
// CS 141
// HW Core Topics: loops, Scanner, return, parameter, random
//
// This program will let user play a number guessing game.

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    // Define the max number to guess
    public static final int MAX_GUESS = 100;

    public static void main(String[] args) {
        int temp;
        int played = 0;
        int guessed = 0;
        int best_guess = Integer.MAX_VALUE;

        welcome();
        do {
            temp = play(new Random().nextInt(MAX_GUESS) + 1);   // Initialize play()
            played++;
            if (temp < best_guess) {
                best_guess = temp;
            }
            guessed += temp;
        } while (playAgain());
        summary(played, guessed, best_guess);
    }

    // Simple helper for prompting user
    public static String prompt(String str) {
        Scanner console = new Scanner(System.in);
        System.out.print(str + " ");
        return console.next();
    }

    // Greet the player
    public static void welcome() {
        System.out.printf("This program allows you to play a guessing game.\n" +
                "I will think of a number between 1 and\n" +
                "%d and you will allow you to guess until\n" +
                "you get it. For each guess, I will tell you\n" +
                "wheter the right answer is higher or lower\n" +
                "than you guess.\n\n", MAX_GUESS);
    }

    // Actual game logic
    public static int play(int random) {
        System.out.printf("\nI'm thinking of a number between 1 and %d\n", MAX_GUESS);
        System.out.printf("P.S.: The number I'm thinking of is %d\n", random);    // Debug line
        int count = 0;
        int result = -1;
        while (result != random) {
            result = Integer.parseInt(prompt("Your guess?"));
            count++;
            if (result > random) {
                System.out.println("It's lower.");
            } else if (result < random) {
                System.out.println("It's higher.");
            }
        }
        if (count == 1) {
            System.out.println("You got it right on the first guess!!");
        } else {
            System.out.printf("You got it right in %d guesses\n", count);
        }

        return count;
    }

    // Print overall results
    public static void summary(int played, int guessed, int best_guess) {
        System.out.print("\nOverall results:\n");
        System.out.printf("\tTotal games  = %d\n", played);
        System.out.printf("\tTotal gueses = %d\n", guessed);
        System.out.printf("\tguesses/game = %.1f\n", (double) guessed / played);
        System.out.printf("\tbest game    = %d\n", best_guess);
    }

    // Logic control and word prompt for play again
    public static boolean playAgain() {
        char input = prompt("Do you want to play again?").toLowerCase().charAt(0);
        return input == 'y';
    }
}

/*
    Output:

        This program allows you to play a guessing game.
        I will think of a number between 1 and
        100 and you will allow you to guess until
        you get it. For each guess, I will tell you
        wheter the right answer is higher or lower
        than you guess.


        I'm thinking of a number between 1 and 100
        Your guess? 50
        It's lower.
        Your guess? 25
        It's lower.
        Your guess? 12
        It's higher.
        Your guess? 18
        It's higher.
        Your guess? 21
        It's higher.
        Your guess? 23
        It's higher.
        Your guess? 24
        You got it right in 7 guesses
        Do you want to play again? y

        I'm thinking of a number between 1 and 100
        Your guess? 50
        It's higher.
        Your guess? 75
        It's lower.
        Your guess? 62
        It's higher.
        Your guess? 68
        It's lower.
        Your guess? 65
        You got it right in 5 guesses
        Do you want to play again? y

        I'm thinking of a number between 1 and 100
        Your guess? 50
        It's higher.
        Your guess? 75
        It's higher.
        Your guess? 87
        It's higher.
        Your guess? 93
        It's higher.
        Your guess? 96
        You got it right in 5 guesses
        Do you want to play again? y

        I'm thinking of a number between 1 and 100
        Your guess? 50
        It's lower.
        Your guess? 25
        It's higher.
        Your guess? 37
        It's lower.
        Your guess? 31
        It's higher.
        Your guess? 34
        It's higher.
        Your guess? 35
        It's higher.
        Your guess? 36
        You got it right in 7 guesses
        Do you want to play again? n

        Overall results:
            Total games  = 4
            Total gueses = 24
            guesses/game = 6.0
            best game    = 5
 */