//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
   Employee myEmployee = new Manager(20.0, 20000.0, "Vanessa");
   myEmployee.display();
   myEmployee.calculateSalary();

   Employee myEmployee1 = new Programmer(15.0, 15000.0, "Keza");
        myEmployee1.display();
        myEmployee1.calculateSalary();
    }
}