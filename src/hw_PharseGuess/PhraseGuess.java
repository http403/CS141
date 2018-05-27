package hw_PharseGuess;

// Hartman Tam
// CS 141
// HW Core Topics: Array, file input, strings
//
// This program will let user play a Hangman mini game.

import java.io.File;
import java.util.Random;
import java.util.Scanner;

class PhraseGuess {
    private static final int maxTrials = 5;

    // initialize the game
    public static void main(String[] args) {
        try {
            File puzzleFile = new File("data/hangman.txt");
            String[] puzzles = loadPuzzle(puzzleFile);
            playGame(selectPuzzle(puzzles));
        } catch (java.io.FileNotFoundException e) {
            System.err.println("FileNotFountException: " + e.getMessage());
            e.printStackTrace(System.err);
        }
    }

    // logic wrapper for hangman game
    private static void playGame(char[] phrase) {
        boolean[] checkBoard = new boolean[phrase.length];
        int trials = maxTrials;
        for (int i = 0; i < checkBoard.length; i++) { // Fill all non upper-lower-alphabet field as true
            int ord = (int) phrase[i];
            if (ord < 65 || (ord > 90 && ord < 97) || ord > 122) {
                checkBoard[i] = true;
            }
        }

        System.out.println("Let's play a game of word guess.");
        System.out.printf("You can guess wrong up to %d times.\n", maxTrials);
        System.out.println();
        do {
            if(trials <= 0) {  // Terminate if all trial used
                break;
            }
            printPhrase(phrase, checkBoard);
            trials = checkGuess(phrase, checkBoard, trials);
        } while (!isGameSolved(checkBoard));

        if (trials > 0) {
            System.out.println("You solved the puzzle! Good job!");
        } else {
            System.out.println("You have reached the max guesses.");
            System.out.println(new String(phrase));
        }
    }

    // file loader
    private static String[] loadPuzzle(File puzzleFile) throws java.io.FileNotFoundException {
        Scanner inStream = new Scanner(puzzleFile);
        int pharseCount = 0;
        if (inStream.hasNextInt()) {
            pharseCount = inStream.nextInt();
        } else {
            System.err.println("Malformed Puzzle file. Quiting...");
            System.exit(1);
        }
        inStream.nextLine(); // Skip one line, unknown bug
        String[] puzzles = new String[pharseCount];
        for (int i = 0; i < pharseCount; i++) {
            puzzles[i] = inStream.nextLine();
        }
        inStream.close();
        return puzzles;
    }

    // simple helper function to select a random puzzle in char array form
    private static char[] selectPuzzle(String[] puzzles) {
        return puzzles[new Random().nextInt(puzzles.length - 1)].toCharArray();
    }

    // simple helper to check is all element in array are true
    private static boolean isGameSolved(boolean[] checkBoard) {
        for (boolean bool : checkBoard) if (!bool) return false;
        return true;
    }

    // ask, check, and print guess result
    private static int checkGuess(char[] phrase, boolean[] checkBoard, int trials) {
        Scanner console = new Scanner(System.in);
        System.out.print("Guess a letter > ");
        String guess = console.next();
        int hit = 0;
        for (int i = 0; i < phrase.length; i++) {
            if (Character.toLowerCase(phrase[i]) == guess.toLowerCase().charAt(0)) {
                checkBoard[i] = true;
                hit++;
            }
        }
        if (hit > 0) {
            System.out.printf("%s was found in the puzzle %d times.", guess.charAt(0), hit);
            System.out.println("\n");
            return trials;
        } else {
            System.out.printf("%s was not in the puzzle. \n", guess.charAt(0));
            System.out.printf("You have %d more incorrect tries.", trials - 1);
            System.out.println("\n");
            return trials - 1;
        }
    }

    // print current state of the game
    private static void printPhrase(char[] pharse, boolean[] checkBoard) {
        int length = Math.min(pharse.length, checkBoard.length);
        for (int i = 0; i < length; i++) {
            int ord = (int) pharse[i];
            if ((ord > 64 && ord < 91) || (ord > 96 && ord < 123)) { // Do not display upper-lower-alphabet
                if (checkBoard[i]) {
                    System.out.print(pharse[i]);
                } else {
                    System.out.print("_");
                }
            } else {
                System.out.print(pharse[i]);
            }
            System.out.print(" ");
        }
        System.out.println();
    }
}

/*
Output:

    Let's play a game of word guess.
    You can guess wrong up to 5 times.

    _ _ _ _ ,   _ _ _ _   _ _   _ _
    Guess a letter > x
    x was not in the puzzle.
    You have 4 more incorrect tries.

    _ _ _ _ ,   _ _ _ _   _ _   _ _
    Guess a letter > x
    x was not in the puzzle.
    You have 3 more incorrect tries.

    _ _ _ _ ,   _ _ _ _   _ _   _ _
    Guess a letter > x
    x was not in the puzzle.
    You have 2 more incorrect tries.

    _ _ _ _ ,   _ _ _ _   _ _   _ _
    Guess a letter > x
    x was not in the puzzle.
    You have 1 more incorrect tries.

    _ _ _ _ ,   _ _ _ _   _ _   _ _
    Guess a letter > x
    x was not in the puzzle.
    You have 0 more incorrect tries.

    You have reached the max guesses.
    Love, love me do

    ~~~

    Let's play a game of word guess.
    You can guess wrong up to 5 times.

    _ _ _ _ ,   _ _ _ _   _ _   _ _
    Guess a letter > W
    W was not in the puzzle.
    You have 4 more incorrect tries.

    _ _ _ _ ,   _ _ _ _   _ _   _ _
    Guess a letter > L
    L was found in the puzzle 2 times.

    L _ _ _ ,   l _ _ _   _ _   _ _
    Guess a letter > o
    o was found in the puzzle 3 times.

    L o _ _ ,   l o _ _   _ _   _ o
    Guess a letter > v
    v was found in the puzzle 2 times.

    L o v _ ,   l o v _   _ _   _ o
    Guess a letter > e
    e was found in the puzzle 3 times.

    L o v e ,   l o v e   _ e   _ o
    Guess a letter > m
    m was found in the puzzle 1 times.

    L o v e ,   l o v e   m e   _ o
    Guess a letter > d
    d was found in the puzzle 1 times.

    You solved the puzzle! Good job!
 */