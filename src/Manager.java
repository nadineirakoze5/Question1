public class Manager extends Employee {

    double hour;
    double amountPerHour;
    String name;
    public Manager(double hour, double amountPerHour, String name){
        this.hour = hour;
        this.amountPerHour = amountPerHour;
        this.name = name;
    }
    @Override
    String display(){
        System.out.println("The Manager Name is " + name);
        return name;
    }

    @Override
    double calculateSalary(){
      salary = hour * amountPerHour;
      bonus = salary * 0.1;
      System.out.println(" And The Salary she get monthly is " + salary);
      System.out.println(" And The Bonus she get is " + bonus);
      System.out.println("\n");
      return salary;

    }

}
