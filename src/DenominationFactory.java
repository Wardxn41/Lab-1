public class DenominationFactory {
    public static Denomination[] getDefaultDenominations() {
        return new Denomination[] {
                new Denomination("Fifty-Dollar Note", 50.0, "bill", "images/fifty.jpg"),
                new Denomination("Twenty-Dollar Note", 20.0, "bill", "images/twenty.jpg"),
                new Denomination("Ten-Dollar Note", 10.0, "bill", "images/ten.jpg"),
                new Denomination("Five-Dollar Note", 5.0, "bill", "images/five.jpg"),
                new Denomination("One-Dollar Note", 1.0, "bill", "images/one.jpg"),
                new Denomination("Quarter", 0.25, "coin", "images/quarter.jpg"),
                new Denomination("Dime", 0.10, "coin", "images/dime.jpg"),
                new Denomination("Nickel", 0.05, "coin", "images/nickel.jpeg"),
                new Denomination("Penny", 0.01, "coin", "images/penny.jpg")
        };
    }
}
