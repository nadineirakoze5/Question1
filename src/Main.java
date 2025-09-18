import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public class Main {
    public static void main(String[] args) {
     try {
         Scanner scanner = new Scanner(System.in);

         System.out.print("Enter Manager Name: ");
         String name = scanner.nextLine();

         System.out.print("Enter Manager  hour: ");
         double hour = scanner.nextDouble();

         System.out.print("Enter Manager  amountPerHour: ");
         double amountPerHour = scanner.nextDouble();

         System.out.print("Enter Manager bonus: ");
         double bonus = scanner.nextDouble();

         Employee myEmployee = new Manager(hour, amountPerHour, name);
         myEmployee.display();
         myEmployee.calculateSalary();

         scanner.nextLine();

         System.out.print("\nEnter Programmer name: ");
         String pName = scanner.nextLine();

         System.out.print("Enter Programmer working hours: ");
         double workingHour = scanner.nextDouble();

         System.out.print("Enter Programmer hourly rate: ");
         double hourlyRate = scanner.nextDouble();

         Employee myEmployee1 = new Programmer(workingHour, hourlyRate, name);
         myEmployee1.display();
         myEmployee1.calculateSalary();
     }
     catch(Exception e){
         System.out.println("Invalid input! Please try again.");
     }
    }
}