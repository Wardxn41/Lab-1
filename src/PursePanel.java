import javax.swing.*;
import java.awt.*;
public class PursePanel extends JPanel {
    private Purse purse;

    public PursePanel() {
        purse = new Purse(new Denomination[] {
                new Denomination("Fifty-Dollar Note", 50.0, "bill", "images/fifty.jpg"),
                new Denomination("Twenty-Dollar Note", 20.0, "bill", "images/twenty.jpg"),
                new Denomination("Ten-Dollar Note", 10.0, "bill", "images/ten.jpg"),
                new Denomination("Five-Dollar Note", 5.0, "bill", "images/five.jpg"),
                new Denomination("One-Dollar Note", 1.0, "bill", "images/one.jpg"),
                new Denomination("Quarter", 0.25, "coin", "images/quarter.jpg"),
                new Denomination("Dime", 0.10, "coin", "images/dime.jpg"),
                new Denomination("Nickel", 0.05, "coin", "images/nickel.jpeg"),
                new Denomination("Penny", 0.01, "coin", "images/penny.jpg")
        });
    }

    public void setPurse(Purse purse) {
        this.purse = purse;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(Color.LIGHT_GRAY);
        // Get the denominations and counts from the purse
        Denomination[] denominations = purse.getDenominations();
        int[] counts = purse.getCounts();

        // If the purse is empty, display a message
        boolean isEmpty = true;
        for (int count : counts) {
            if (count > 0) {
                isEmpty = false;
                break;
            }
        }

        if (isEmpty) {
            g.drawString("Empty Purse", 10, 20);
            return;
        }

        // Display each denomination's image
        int x = 10;
        int y = 20;

        for (int i = 0; i < denominations.length; i++) {
            if (counts[i] > 0) {
                // Display the count of the denomination (if it's greater than 0)
                g.drawString(counts[i] + " x ", x, y);
                y += 20;

                // Draw the image of the denomination
                Image img = denominations[i].getImage();
                g.drawImage(img, x + 50, y - 20, 250, 70, this);  // Adjust size and position as needed

                y += 60;  // Move down for the next denomination (adjust spacing as needed)
            }
        }
    }
}
