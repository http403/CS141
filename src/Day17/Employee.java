/* 
   Implement (define) a class for an Employee at a LawFirm.
   
   Every employee's state should include:
      - an ID number (default 0)
      - a name (default "Employee 0")
      - a number of hours they work a week (default 40)
      - a base salary (default $40,000.00)
      - a number of vacation days (default 10)
      - a color of the form they need to complete to take vacay (default yellow)
      
   You should be able to create an Employee with all deafult values OR with specific value
   passed to the constructor for name only.
   
   You should be able to access all fields, but only change hours worked, salary, and vacation days.
   
   You should be able to print an Employee object using System.out.println.
   e.g. System.out.println(new Employee()); should print an Employee in a logical way.
*/

package Day17;

public class Employee {

    // class variable, share across instances
    private static int nextId = 0;

    // instance variable
    private int id, hours, vacationDays;
    private double salary;
    private String name, vacationForm;

    // Constructor
    public Employee() {
        this.id = Employee.nextId++;
        this.name = "Employee " + this.id;
        this.hours = 40;
        this.salary = 40000.00;
        this.vacationDays = 10;
        this.vacationForm = "yellow";
    }

    public Employee(String name) {
        this();
        this.name = name;
    }

    // Getter
    public double getSalary() {
        return this.salary;
    }

    public int getId() {
        return this.id;
    }

    public int getHours() {
        return this.hours;
    }

    public String getName() {
        return this.name;
    }

    public int getVacationDays() {
        return this.vacationDays;
    }

    public String getVacationForm() {
        return this.vacationForm;
    }

    // Setter
    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setVacationDays(int vacationDays) {
        this.vacationDays = vacationDays;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // toString
    public String toString() {
        return String.format("<Employee id=%d name=%s>", this.id, this.name);
    }

    //other behavior
    public void showHours() {
        System.out.println("I work " + getHours() + " hours per week.");
    }

    public void showSalary() {
        System.out.println("My salary is $" + getSalary() + ".");
    }

    public void showVacation() {
        System.out.println("I receive " + (getVacationDays() / 5) + " weeks vacation.");
    }

    public void applyForVacation() {
        System.out.println("Use the " + getVacationForm() + " vacation form.");
    }
}