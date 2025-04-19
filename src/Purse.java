public class Purse {
    private Denomination[] denominations;
    private int[] counts;
    //Constructor
    public Purse(Denomination[] denominations) {
        this.denominations = denominations;
        this.counts = new int[denominations.length];
    }
    //Add certain number of a denomination to the purse
    public void add(Denomination denomination,int num) {
        for (int i = 0; i < denominations.length; i++) {
            if (denominations[i].getAmount() == denomination.getAmount()){
                counts[i] += num;
                return;
            }
        }
    }
    public double remove(Denomination denomination, int num) {
        for (int i = 0; i < denominations.length; i++) {
            if (denominations[i].getAmount() == denomination.getAmount()) {
                if (counts[i] >= num) {
                    counts[i] -= num;
                    return denominations[i].getAmount() * num;
                }
            }
        }
    return 0;
    }
    public double getValue() {
        double total = 0;
        for (int i = 0; i < denominations.length; i++) {
            total += counts[i] * denominations[i].getAmount();
        }
        return total;
    }
    public void printContents() {
        for (int i = 0; i < denominations.length; i++) {
            if (counts[i] > 0) {
                System.out.println(counts[i] + " " + denominations[i].getName());
            }
        }
    }
    public Denomination[] getDenominations() {
        return denominations;
    }
    public int[] getCounts() {
        return counts;
    }
}
//
