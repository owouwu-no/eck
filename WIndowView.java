import javax.swing.*;

public class WindowViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(  400, 400);
        frame.setTitle("My first Gui");

        RectangleComponent component = new RectangleComponent();
        frame.add(component);

        CircleComponent circle =new CircleComponent();
        frame.add(circle);

        LineComponent line =new LineComponent();
        frame.add(line);

        MessageComponent message = new MessageComponent();
        frame.add(message);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
