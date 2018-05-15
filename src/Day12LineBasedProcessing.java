import com.sun.istack.internal.NotNull;

import java.io.*;
import java.util.*;

public class Day12LineBasedProcessing {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);

        Scanner file = new Scanner(new File("data/more_numbers.txt"));
//        echoContents(file);
//        echoFile(file);
//        cleanFile(file);
//        createCleanFile(file);
//        countSpaces(file);
//        countTokens(file);
//        mostTokens(file);
        maxTokens(file);
    }

    // Should echo the contents of a file, removing all spacing and new lines
    // pattern: token-based processing: process a file token by token
    public static void echoContents(Scanner in) {
      while(in.hasNextInt()) {
          System.out.println(in.nextInt());
      }
    }

    // Should echo the contents of a file, maintaining all spacing
    // pattern: line-based processing: processes a file line by line
    public static void echoFile(Scanner in) {
        while(in.hasNextLine()) {
            System.out.println(in.nextLine());
        }
    }

    // Should echo the contents of a file to the console
    // preserve line breaks, but removing extra spaces between tokens
    // pattern: processes a file line by line, evaluating each token on a line
    public static void cleanFile(Scanner in) {
        while(in.hasNextLine()) {
            String line = in.nextLine();
            Scanner token = new Scanner(line);
            while (token.hasNextInt()) {
                System.out.print(token.nextInt());
            }
            System.out.println();
        }
    }

    // Should echo the contents of a file to A NEW FILE
    // preserve line breaks, but removing extra spaces between tokens
    public static void createCleanFile(Scanner in) throws java.io.FileNotFoundException {
        PrintStream writer = new PrintStream(new File("data/more_clean_numbers.txt"));
        while (in.hasNextLine()) {
            String line = in.nextLine();
            Scanner token = new Scanner(line);
            while (token.hasNextInt()) {
                writer.print(token.nextInt());
            }
            writer.println();
        }
        writer.close();
    }

    // Should print the number of spaces found on each line of a file
    // pattern: processes a file line by line, processing the line as a whole
    public static void countSpaces(Scanner in) {
        while (in.hasNextLine()) {
            int count = 0;
            String line = in.nextLine();

            for (int i = 0; i < line.length(); i++) {
                if(line.charAt(i) == ' ') {
                    count++;
                }
            }
            System.out.println(line);
            System.out.printf("This line have %d spaces.\n\n", count);
        }

    }

    // Should print the number of tokens found on each line of a file
    // pattern: processes a file line by line, visiting all tokens on one line
    public static void countTokens(Scanner in) {
        while (in.hasNextLine()) {
            int count = 0;
            String line = in.nextLine();

            Scanner lineScan = new Scanner(line);
            while (lineScan.hasNext()) {
                count++;
                lineScan.next();
            }

            System.out.println(line);
            System.out.printf("This line have %d tokens.\n\n", count);
        }
    }

    // Should print the line in the file with the most tokens
    // pattern: processes a file line by line, comparing one line to another
    public static void mostTokens(Scanner in) {
        int maxCount = 0;
        String maxLine = "";
        while (in.hasNextLine()) {
            int count = 0;

            String line = in.nextLine();
            Scanner lineScan = new Scanner (line);
            while (lineScan.hasNext()) {
                count++;
                lineScan.next();
            }

            if (count > maxCount) {
                maxCount = count;
                maxLine = line;
            }
        }
        System.out.println(maxLine);
        System.out.printf("This line have %d tokens.\n\n", maxCount);
    }

    // Should print the largest token found on each line of a file
    // pattern: processes a file line by line, comparing all tokens on one line
    public static void maxTokens(Scanner in) {
        int count = 0;
        while (in.hasNextLine()) {
            int maxToken = Integer.MIN_VALUE;
            String line = in.nextLine();
            count++;
            Scanner lineScan = new Scanner (line);
            while (lineScan.hasNextInt()) {
                maxToken = Math.max(lineScan.nextInt(), maxToken);
            }
            System.out.println(line);
            System.out.printf("%d is the largest token in line %d.\n\n", maxToken, count);
        }
    }
}
