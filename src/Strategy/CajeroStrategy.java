package Strategy;

public class CajeroStrategy implements Strategy {
    private double salary;

    public CajeroStrategy(double salary) {
        this.salary = salary;
    }
    
    @Override
    public double calculateSalary() {
        System.out.println("Salario de cajero");
        return this.salary;
    }
    
}
