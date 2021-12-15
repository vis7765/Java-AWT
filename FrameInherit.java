import java.awt.*;

public class FrameInherit extends Frame {
    public static void main(String[] args) {
        FrameInherit a = new FrameInherit();
        System.out.println("A");
        a.setTitle("Hello Darling");
        a.setSize(300,100);
        a.setVisible(true);
        System.out.println(a);
        System.out.println("B");

    }
}
