// Hartman Tam
// CS 141
// HW Core Topics: static methods, println
//
// This program will print the lyrics of "Today is Monday"

public class HW02 {
    public static void main(String[] args) {
        monday();
        tuesday();
        wednesday();
        thursday();
        friday();
        saturday();
        sunday();
        endSentance();
    }

    public static void mondayFood() {
        System.out.println("Monday, String Beans");
        endSentance();
    }

    public static void monday() {
        System.out.println("Today is Monday, Today is Monday,");
        mondayFood();
    }

    public static void tuesdayFood() {
        System.out.println("Tuesday, Spaghetti");
        mondayFood();
    }

    public static void tuesday() {
        System.out.println("Today is Tuesday, Today is Tuesday,");
        tuesdayFood();
    }

    public static void wednesdayFood() {
        System.out.println("Wednesday, Zoooop");
        tuesdayFood();
    }

    public static void wednesday() {
        System.out.println("Today is Wednesday, Today is Wednesday,");
        wednesdayFood();
    }

    public static void thursdayFood() {
        System.out.println("Thursday, Roast Beef");
        wednesdayFood();
    }

    public static void thursday() {
        System.out.println("Today is Thursday, Today is Thursday,");
        thursdayFood();
    }

    public static void fridayFood() {
        System.out.println("Friday, Fresh Fish");
        thursdayFood();
    }

    public static void friday() {
        System.out.println("Today is Friday, Today is Friday,");
        fridayFood();
    }

    public static void saturdayFood() {
        System.out.println("Saturday, Chicken");
        fridayFood();
    }

    public static void saturday() {
        System.out.println("Today is Saturday, Today is Saturday,");
        saturdayFood();
    }

    public static void sundayFood() {
        System.out.println("Sunday, Ice Cream");
        saturdayFood();
    }

    public static void sunday() {
        System.out.println("Today is Sunday, Today is Sunday,");
        sundayFood();
    }

    public static void endSentance() {
        System.out.println("All you hungry children, come and eat it up!\n");
    }
}
