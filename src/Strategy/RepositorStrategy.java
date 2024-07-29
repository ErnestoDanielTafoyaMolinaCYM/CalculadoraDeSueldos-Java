package Strategy;

public class RepositorStrategy implements Strategy {

    private final double salary;
    private final double bonus = 0.10;

    public RepositorStrategy(double salary) {
        this.salary = salary;
    }
    

    @Override
    public double calculateSalary() {
        System.out.println("Salario de Repositor");
        double finalSalary = this.salary + (this.salary * this.bonus);
        return finalSalary;
    }

}
