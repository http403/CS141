// Hartman Tam
// CS 141
// HW Core Topics: Scanner, File, PrintStream, Exception
//
// This program will read a diary in text format and conclude each day with ":)", ":(", or ":|".

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class DiaryAnalysis {

    // debug switch
    public static final boolean DEBUG = false;

    // Program entry point
    public static void main(String[] args) {
        try {
            // Set path to input and output
            File input = new File("data/diary.txt");
            File output = new File("out/summary.txt");

            // Ensure that there is a file ready to write
            output.createNewFile();

            // call main logic method
            parseAndPrint(input, output);

        } catch (java.io.FileNotFoundException e) {
            System.err.println("File Not Found: " + e.getMessage());
            e.printStackTrace();
        } catch (java.io.IOException e) {
            System.err.println("Can not create new file: " + e.getMessage());
            e.printStackTrace();
        } catch (java.lang.NumberFormatException e) {
            System.err.println("Incorrectly Formatted Date: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // main logic of the program
    public static void parseAndPrint(File in, File out) throws java.io.FileNotFoundException {
        // set Scanner object for input and output
        Scanner inStream = new Scanner(in);
        PrintStream outStream = new PrintStream(out);

        // Initialize counter
        int counter = 0;

        // set first month for comparison
        String preMonth = "Jan";
        outStream.println(preMonth);

        while (inStream.hasNextLine()) {
            // Get one line from Scanner
            String line = inStream.nextLine();

            // Parse line into 3 parts
            String month = line.substring(0, 3);
            String day = line.substring(3, 5);
            String diary = line.substring(5);

            // Print month if changed
            if (!month.equals(preMonth)) {
                outStream.println(month);
                preMonth = month;
            }

            // Print day
            outStream.print("\t - " + day);

            // compute score
            int score = lineRate(diary);
            if (DEBUG) {
                System.out.printf("%s%s: %d\n", month, day, score);
            }

            // increase counter by one
            counter++;

            // print summary
            if (score > 0) {
                outStream.println(" :)");
            } else if (score < 0) {
                outStream.println(" :(");
            } else {
                outStream.println(" :|");
            }
        }

        outStream.println("\n" + counter + " total days analyzed");
    }

    // A reader for calling wordRate(), return line score
    public static int lineRate(String str) {
        Scanner inStream = new Scanner(str);

        int rating = 0;
        while (inStream.hasNext()) {
            rating += wordRate(inStream.next());
        }
        return rating;
    }

    // A internal function for lineRate(), providing better functionality segmentation.
    // Return score for each word
    public static int wordRate(String word) {
        Scanner p_word = new Scanner("good great yay");
        Scanner n_word = new Scanner("terrible horrible awful");

        word = word.toLowerCase();
        int score = 0;

        // Check for positive keywords
        while (p_word.hasNext()) {
            if (word.contains(p_word.next())) {
                score++;
            }
        }

        // Check for negative keywords
        while (n_word.hasNext()) {
            if (word.contains(n_word.next())) {
                score--;
            }
        }

        return score;
    }
}

/*
    Output:
        diary.txt:
            Jan01 New year: Everything is great!
            Jan14 Today I got free ice cream. SO GOOD! #bestdayever
            Feb10 Meh. I'm fine.
            Feb21 I'm having a terrible horrible no good day.
            Feb23 Yesterday was horrible, but today is great! Yay!
            May02 Sad Panda. #terribleday
            May15 Hello World, today is fabulous! #yay
            Jun01 Great! Yay! Good! Yay! Happy. Happy. #goodgreatyay
            Jun11 Yay, yay, yay! I'm having an awfuly great day.

        summary.txt:
            Jan
                 - 01 :)
                 - 14 :)
            Feb
                 - 10 :|
                 - 21 :(
                 - 23 :)
            May
                 - 02 :(
                 - 15 :)
            Jun
                 - 01 :)
                 - 11 :)

            9 total days analyzed

 */
