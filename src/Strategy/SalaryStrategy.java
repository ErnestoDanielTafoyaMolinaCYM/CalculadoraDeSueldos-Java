package Strategy;

public class SalaryStrategy implements Strategy {
    private double salary;
    private double bonus;

    public SalaryStrategy() {
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    public SalaryStrategy(double salary, double bonus) {
        this.salary = salary;
        this.bonus = bonus;
    }
    
    @Override
    public double calculateSalary() {
        return this.salary + (this.salary * this.bonus);
    }
    
}
