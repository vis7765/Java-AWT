import java.awt.*;

public class FrameTextField {
    public static void main(String[] args) {
        Frame frame = new Frame();

        frame.setSize(300,300);
        frame.setBackground(Color.pink);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());
        TextField t1 = new TextField("Hello buddy");
        TextField t2 = new TextField("Hello buddy");
        TextField t3 = new TextField("Hello buddy");
        TextField t4 = new TextField("Hello buddy");
        TextField t5 = new TextField("Hello buddy");
        frame.add(t1);
        frame.add(t2);
        frame.add(t3);
        frame.add(t4);
        frame.add(t5);
    }
}
