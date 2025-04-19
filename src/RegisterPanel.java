import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegisterPanel extends JPanel {
    private Register register;
    private JTextField input;
    private PursePanel changePanel;

    public RegisterPanel() {
        // Initialize the denominations array
        Denomination[] denominations = new Denomination[]{
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
        // Initialize Register with the denominations array
        register = new Register(denominations);
        // Create and set layout
        setLayout(new BorderLayout());
        // Create input panel for entering amount
        JPanel inputPanel = new JPanel();
        input = new JTextField(10);
        JButton enterButton = new JButton("Enter");
        inputPanel.add(new JLabel("Enter Amount:"));
        inputPanel.add(input);
        inputPanel.add(enterButton);
        // Add input panel to the top of the main panel
        add(inputPanel, BorderLayout.NORTH);
        // Create change panel to display the purse
        changePanel = new PursePanel();
        add(changePanel, BorderLayout.CENTER);
        // Add ActionListener to the button to process the input
        enterButton.addActionListener(new InputListener());
    }

    // ActionListener for handling user input
    private class InputListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                // Get the input amount from the text field and convert it to a double
                double amount = Double.parseDouble(input.getText());
                // Call makeChange method from Register to get the corresponding purse
                Purse purse = register.makeChange(amount);
                // Update the purse panel with the generated purse
                changePanel.setPurse(purse);
                changePanel.repaint();  // Repaint the purse panel to show the new contents

            } catch (NumberFormatException ex) {
                // Handle invalid input (e.g., non-numeric)
                JOptionPane.showMessageDialog(RegisterPanel.this, "Invalid input! Please enter a valid number.");
            }
        }
    }
}
//