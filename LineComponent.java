import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;

public class LineComponent extends JComponent {
    public void paintComponent (Graphics g) {
        Graphics2D g2 = (Graphics2D)g;

        Line2D.Double line = new Line2D.Double(0, 0, 300,300);
        g2.draw(line);
    }

}
