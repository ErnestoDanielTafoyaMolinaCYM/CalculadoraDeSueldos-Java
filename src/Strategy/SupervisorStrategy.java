package Strategy;

public class SupervisorStrategy implements Strategy{
    private final double salary;
    private final double bonus = 0.11;

    public SupervisorStrategy(double salary) {
        this.salary = salary;
    }
    
    @Override
    public double calculateSalary() {
        System.out.println("Salario de supervisor");
        double finalSalary = this.salary - (this.salary * this.bonus) ;
        return finalSalary;
    }
    
}
