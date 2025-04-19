public class Register {
    private Denomination[] denominations;
    private ChangeStrategy strategy;

    public Register(Denomination[] denominations, ChangeStrategy strategy) {
        this.denominations = denominations;
        this.strategy = strategy;
    }
    public Purse makeChange(double amount) {
        return strategy.makeChange(amount,denominations);
    }
}




