import java.util.Scanner;

public class CandyMachine {
    private static double moneyLeft;
    private static double productPrice;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        intro();
        askMoney(console);
        listStocks();
        askProduct(console);
        returnChange();
    }

    public static void intro() {
        System.out.println("Welcome to Shoreline's Computer Candy Mahine!\n(All candy provided is virtual.)\n");
    }

    public static void askMoney(Scanner concole) {
        System.out.print("How much monehy do ya got? > ");
        setMoney(concole.nextDouble());
        System.out.println("$" + moneyLeft + ", that's all?\n");
    }

    public static void listStocks() {
        System.out.println("Well, lemme tell ya what we got here.\n" +
                "A $0.65 Twix\n" +
                "B $0.50 Chips\n" +
                "C $0.75 Nutter Butter\n" +
                "D $0.65 Peanut Butter Cup\n" +
                "E $0.55 Juicy Fruit Gum\n");
    }

    public static void askProduct(Scanner console) {
        System.out.print("So, What'll ya have? > ");
        String input = console.next();
        if (input.equalsIgnoreCase("a") || input.equalsIgnoreCase("d")) {
            setPrice(0.65);
        } else if (input.equalsIgnoreCase("b")) {
            setPrice(0.5);
        } else if (input.equalsIgnoreCase("c")) {
            setPrice(0.65);
        } else if (input.equalsIgnoreCase("e")) {
            setPrice(0.55);
        } else {
            setPrice(0);
        }
        System.out.println();
    }

    public static void returnChange() {
        double change = getChange();
        if (change > 0) {
            System.out.println("Thanks for purchasing candy through us.\n" +
                    "Please take your candy and you $" + change + " change!");
        } else {
            System.out.println("You're broke. Take your $" + moneyLeft + " and go elsewhere.");
        }
    }

    private static int setMoney(double dollar) {
        moneyLeft = dollar;
        return 0;
    }

    private static int setPrice(double price) {
        productPrice = price;
        return 0;
    }

    private static double getChange() {
        return moneyLeft - productPrice;
    }

}
