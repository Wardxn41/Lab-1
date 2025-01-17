public class Denomination {
    String name;
    double amount;
    String form;
    String img;

    // Constructor to initialize the denomination
    public Denomination(String name, double amount, String form, String img) {
        this.name = name;
        this.amount = amount;
        this.form = form;
        this.img = img;
    }

    // Getters for the properties
    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }

    public String getForm() {
        return form;
    }

    public String getImg() {
        return img;
    }
}
