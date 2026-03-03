import java.awt.*;
import javax.swing.*;

class Clock extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
       
        
        // Draw the clock face (circle)
        g.drawOval(50, 50, 100, 100);
        
        // Draw the clock hands
        // Minute/Hour hand (horizontal)
        g.drawLine(100, 100, 140, 100); 
        
        // Hour/Minute hand (vertical)
        g.drawLine(100, 100, 100, 60);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame(" ");
        
        f.add(new Clock());
        f.setSize(300, 300);

        f.setVisible(true);
    }
}
