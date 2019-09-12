import javax.swing.*;
import java.awt.*;

public class RectangleComponent extends JComponent {

    public void paintComponent (Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        Rectangle rectangle = new Rectangle(5, 10, 20, 30);
        g2.draw(rectangle);
        rectangle.translate(15,25);
        g2.draw(rectangle);

    }
}
