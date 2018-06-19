/*
   Create a Boss Employee who is a specialized version of an
   Employee who:

      - works double the regular Employee
      - makes four times a regular Employee
      - gets 0 vacation
      - vacation form is ""
      - applying for vacation prints "The big boss gets no vacay!"
      
   A boss can also promote an Employee:
      - increasing the Employee's pay by 10%
      - increasing the Employee's vacation days by 2
*/

package Day17;

public class Boss extends Employee {

    public Boss() {
        super("Boss");
    }

    public Boss(String name) {
        super(name);
    }

    public String toString() {
        return String.format("<Boss id=%d name=$s>", this.getId(), this.getName());
    }

    public double getSalary() { return super.getSalary() * 4; }
    public int getHours() { return super.getHours() * 2; }
    public int getVacationDays() { return 0; }
    public String getVacationForm() { return ""; }
    public void applyForVacation() { System.out.println("The big boss get no vacay!"); }

    //add behavior
    public void promote(Employee e) {
        e.setSalary(e.getSalary() * 1.1);
        e.setVacationDays(e.getVacationDays() + 2);
    }
}