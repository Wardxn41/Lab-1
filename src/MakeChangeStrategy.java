public class MakeChangeStrategy implements ChangeStrategy {
    @Override
    public Purse makeChange(double amount, Denomination[] denominations) {
        Purse purse = new Purse(denominations);

        for (int i = 0; i < denominations.length; i++) {
            int count = (int) (amount / denominations[i].getAmount());  // Calculate how many of this denomination
            if (count > 0) {
                // Add to purse
                purse.add(denominations[i], count);
                // Reduce the amount
                amount -= count * denominations[i].getAmount();  // Subtract the amount of the denomination
            }
        }
        System.out.println("Change Breakdown:");
        purse.printContents();  // Print the contents of the purse
        return purse;
    }
}
