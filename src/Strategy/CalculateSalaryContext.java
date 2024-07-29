package Strategy;

public class CalculateSalaryContext implements Strategy{
    Strategy strategy;

    public CalculateSalaryContext(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    
    @Override
    public double calculateSalary() {
        return this.strategy.calculateSalary();
    }
    
}
