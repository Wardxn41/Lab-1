import javax.swing.*;
public class GUIMakingChange {
    public static void main(String[] args) {
        // Create the JFrame
        JFrame frame = new JFrame("Making Change");
        // Close program on exit button
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Set the frame size
        frame.setSize(800, 800);

        // Create RegisterPanel and add it to the frame
        RegisterPanel registerPanel = new RegisterPanel();
        frame.add(registerPanel);

        // Show the frame
        frame.setVisible(true);

    }
}
