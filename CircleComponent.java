import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class CircleComponent extends JComponent {

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        Ellipse2D.Double circle = new Ellipse2D.Double( 40, 40, 40, 40 );
        g2.draw(circle);
    }
}
