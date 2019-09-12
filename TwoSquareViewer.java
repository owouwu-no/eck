import javax.swing.*;

public class TwoSquareViewer extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(700, 700);
        frame.setTitle("Two Squares");

        TwoSquareComponent component = new TwoSquareComponent();
        frame.add(component);



        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
