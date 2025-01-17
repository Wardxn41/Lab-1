public class Register {
    private Denomination[] denominations;

    //Constructor to initialize the register
    public Register(Denomination[] denominations) {
        this.denominations = denominations;
    }

    //Method ot create a purse with correct denominations
    public Purse makeChange(double amount) {
        Purse purse = new Purse(denominations);

        for (int i = 0; i < denominations.length; i++) {
            int count = (int) (amount / denominations[i].getAmount());
            if (count > 0) {
                // add money to the purse
                purse.add(denominations[i], count);
                // reduce the amount
                amount -= count * denominations[i].getAmount();
            }
        }
        return purse;
    }

    //simple test
    public static void main(String[] args) {
        Denomination[] denominations = {
                new Denomination("Fifty Dollar Note", 50.00, "bill", "fifty.png"),
                new Denomination("Twenty Dollar Note", 20.00, "bill", "twenty.png"),
                new Denomination("Ten Dollar Note", 10.00, "bill", "ten.png"),
                new Denomination("Five Dollar Note", 5.00, "bill", "five.png"),
                new Denomination("One Dollar Note", 1.00, "bill", "one.png"),
                new Denomination("Quarter", 0.25, "coin", "quarter.png"),
                new Denomination("Dime", 0.10, "coin", "dime.png"),
                new Denomination("Nickel", 0.05, "coin", "nickel.png"),
                new Denomination("Penny", 0.01, "coin", "penny.png")
        };
        Register register = new Register(denominations);
        Purse purse = register.makeChange(43.14);
        purse.printContents();
        if (purse.getValue() == 43.14) {
            System.out.println("Success!");
        } else {
            System.out.println("Fail!");
        }
    }
}
