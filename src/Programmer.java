public class Programmer extends Employee {

    double workingHour;
    double amountPerHour;
    String name;
    public Programmer(double workingHour, double amountPerHour, String name){
        this.workingHour = workingHour;
        this.amountPerHour = amountPerHour;
        this.name = name;
    }
    @Override
    String display(){
        System.out.println("The Programmer Name is " + name);
        return name;
    }

    @Override
    double calculateSalary(){
        salary = workingHour * amountPerHour;
        System.out.println(" And The Salary she get monthly is " + salary);
        return salary;

    }

}
