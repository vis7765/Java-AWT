import java.awt.Frame;
public class FrameDemo {
    public static void main(String[] args) {
        Frame frame = new Frame();
        System.out.println("1");
        frame.setVisible(true);
        frame.setSize(100,200);
        System.out.println(frame);
        System.out.println("2");
    }
}
