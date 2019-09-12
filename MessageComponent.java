import javax.swing.*;
import java.awt.*;

public class MessageComponent extends JComponent {
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Color myColor =new Color( 255, 30, 47);
        g2.setColor(Color.red);
        g2.drawString( "Imma head out", 50 , 100);

    }
}
