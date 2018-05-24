public class PhraseGuess {

    // main loop to initialize the game
    public static void main(String[] args) {
        try {
            do {
                play();
            } while (keepPlay());
        } catch (java.io.FileNotFoundException e) {
            System.err.printf("FileNotFoundException: %s", e.getMessage());
            e.printStackTrace(System.err);
        }
    }

    // simple prompt if keep playing
    public static boolean keepPlay() {
        return false;
    }

    // wrapper for main logic components
    public static void play() throws java.io.FileNotFoundException {

    }


}
