import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class DiaryAnalysis {
    public static void main(String[] args) {
        try {
            // Set path to input and output
            File input = new File("data/diary.txt");
            File output = new File("data/diary_summary.txt");

            // Initialize counter
            int counter = 0;

            // Ensure that there is a file ready to write
            output.createNewFile();

            // Parse set Scanner object for input and output
            Scanner inStream = new Scanner(input);
            PrintStream outStream = new PrintStream(output);

            String preMonth = "Jan";
            System.out.println(preMonth);

            while (inStream.hasNextLine()) {
                // Get one line from Scanner
                String line = inStream.nextLine();

                // Parse line into 3 parts
                String month = line.substring(0, 3);
                String day = line.substring(3,5);
                String diary = line.substring(5);

                // Print month if changed
                if (!month.equals(preMonth)) {
                    System.out.println(month);
                    preMonth = month;
                }

                // Print day
                System.out.print("\t - " + day);

                // compute score
                int score = lineRate(diary);

                // print summary
                if (score > 0) {
                    System.out.println(" :)");
                } else if (score < 0) {
                    System.out.println(" :(");
                } else {
                    System.out.println(" :|");
                }
            }

            System.out.println(counter + " total days analyzed");


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
        word = word.toLowerCase();
        if (word.contains("good") || word.contains("great") || word.contains("yay")) {
            return 1;
        } else if (word.contains("terrible") || word.contains("horrible") || word.contains("awful")) {
            return -1;
        }
        return 0;
    }
}
