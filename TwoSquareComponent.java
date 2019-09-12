import javax.swing.*;
import java.awt.*;

public class TwoSquareComponent extends JComponent {

        public void paintComponent (Graphics g) {
            Graphics2D sq= (Graphics2D)g;
            Rectangle square1 = new Rectangle( 60, 60, 30, 30);
            sq.draw(square1);
            Rectangle square2 = new Rectangle(50, 50, 50, 50);
            sq.draw(square2);

        }

    }
