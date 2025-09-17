public class Programmer extends Employee {

    double workingHour;
    double hourlyRate;
    String name;
    public Programmer(double workingHour, double hourlyRate, String name){
        this.workingHour = workingHour;
        this.hourlyRate = hourlyRate;
        this.name = name;
    }
    @Override
    String display(){
        System.out.println("The Programmer Name is " + name);
        return name;
    }

    @Override
    double calculateSalary(){
        salary = workingHour * hourlyRate;
        System.out.println(" And The Salary she get monthly is " + salary);
        return salary;

    }

}
