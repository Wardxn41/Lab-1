public interface ChangeStrategy {
    Purse makeChange(double amount, Denomination[] denominations);
}
