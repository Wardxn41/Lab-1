import javax.swing.*;
import java.awt.*;
public class PursePanel extends JPanel {
    private Purse purse;

    public PursePanel() {
        Denomination[] denominations = DenominationFactory.getDefaultDenominations();
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
                g.drawImage(img, x + 50, y - 20, 250, 70, this);

                y += 60;  // Move down for the next denomination
            }
        }
    }
}
