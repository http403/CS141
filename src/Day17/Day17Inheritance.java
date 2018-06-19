package Day17;

import java.util.*;

public class Day17Inheritance {

    public static void main(String[] args) {
        //testEmployee();
        //testBoss();
        simulation();
    }

    public static void testEmployee() {
        Employee em = new Employee();
        System.out.println("Default Employee = \n" + em);
        printInfo(em);

        Employee ricco = new Employee("Ricco");
        System.out.println("Employee ricco = \n" + ricco);
        printInfo(ricco);
    }

    private static void printInfo(Employee person) {
        System.out.println("ID: " + person.getId());
        System.out.println("Name: " + person.getName());
        person.showHours();
        person.showSalary();
        person.showVacation();
        person.applyForVacation();
        System.out.println();
    }

    public static void testBoss() {
        Boss b = new Boss();
        printInfo(b);

        Employee e = new Employee();
        printInfo(e);
        b.promote(e);
        printInfo(e);
    }

    public static void simulation() {
        Boss crystal = new Boss("Crystal");
        Employee[] staff = new Employee[3];

        for (int i = 0; i < staff.length; i++) {
            staff[i] = new Employee();
        }

        System.out.println(Arrays.toString(staff));

        Random rand = new Random();
        int luckyDuck = rand.nextInt(staff.length);
        crystal.promote(staff[luckyDuck]);

//        System.out.println(Arrays.toString(staff));
        for(Employee e : staff) {
            printInfo(e);
        }
    }
}