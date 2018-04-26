import java.util.Scanner;

public class CandyMachine {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        intro();
        double money = setMoney(console);
        listStocks();
        double price = askProduct(console);
        returnChange(money, price);
    }

    public static void intro() {
        System.out.println("Welcome to Shoreline's Computer Candy Mahine!\n(All candy provided is virtual.)\n");
    }

    public static double setMoney(Scanner concole) {
        System.out.print("How much monehy do ya got? > ");
        double money = concole.nextDouble();
        System.out.println("$" + money + ", that's all?\n");

        return money;
    }

    public static void listStocks() {
        System.out.println("Well, lemme tell ya what we got here.\n" +
                "A $0.65 Twix\n" +
                "B $0.50 Chips\n" +
                "C $0.75 Nutter Butter\n" +
                "D $0.65 Peanut Butter Cup\n" +
                "E $0.55 Juicy Fruit Gum\n");
    }

    public static double askProduct(Scanner console) {
        double price;
        do {
            System.out.print("So, What'll ya have? > ");
            String input = console.next();
            if (input.equalsIgnoreCase("a") || input.equalsIgnoreCase("d")) {
                price = 0.65;
            } else if (input.equalsIgnoreCase("b")) {
                price = 0.5;
            } else if (input.equalsIgnoreCase("c")) {
                price = 0.65;
            } else if (input.equalsIgnoreCase("e")) {
                price = 0.55;
            } else {
                price = -1;
            }
        } while (price < 0);
        System.out.println();

        return price;
    }

    public static void returnChange(double money, double price) {
        double change = money - price;
        if (change > 0) {
            System.out.println("Thanks for purchasing candy through us.\n" +
                    "Please take your candy and you $" + change + " change!");
        } else {
            System.out.println("You're broke. Take your $" + money + " and go elsewhere.");
        }
    }
}
