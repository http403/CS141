import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class PhraseGuess {

    // main loop to initialize the game
    public static void main(String[] args) {
        File puzzleFile = new File("data/hangman.txt");
        do {
            new Hangman(puzzleFile);
        } while (keepPlay());
    }

    // simple prompt if keep playing
    public static boolean keepPlay() {
        return false;
    }
}


