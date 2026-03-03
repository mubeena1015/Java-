import javax.swing.*;
import java.awt.*;

public class SimpleApplet {

    public static void main(String args[]) {

        JFrame frame = new JFrame("Simple Message");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create panel and override paintComponent
        JPanel panel = new JPanel() {

            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                // First Message
                g.setColor(Color.BLUE);
                g.setFont(new Font("SansSerif", Font.ITALIC, 25));
                g.drawString("Welcome to Applet!", 50, 100);

                // Second Message
                g.setColor(Color.GREEN);
                g.setFont(new Font("Monospaced", Font.PLAIN, 30));
                g.drawString("Enjoy Coding!", 50, 150);
            }
        };

        frame.add(panel);
        frame.setVisible(true);
    }
}
