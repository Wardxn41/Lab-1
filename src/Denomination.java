import javax.swing.ImageIcon;  // Correct import for ImageIcon
import java.awt.Image;

public class Denomination {
    private String name;
    private double amount;
    private String form; // "bill" or "coin"
    private String imageFile;
    private Image image;

    // Constructor
    public Denomination(String name, double amount, String form, String imageFile) {
        this.name = name;
        this.amount = amount;
        this.form = form;
        this.imageFile = imageFile;
    }


    // Getters
    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }

    public String getForm() {
        return form;
    }

    public Image getImage() {
        if (image == null) {
            this.image = new ImageIcon(imageFile).getImage();
        }
        return image;
    }
}
//