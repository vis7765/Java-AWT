import java.awt.*;

public class FramFeatures {
    public static void main(String[] args) {
        Frame f = new Frame();

        //f.setSize(600,300);
        f.setBounds(100,150,700,500);
        f.setVisible(true);
        f.setBackground(Color.pink);
        boolean  b = f.isVisible();
        System.out.println(b);
    }
}
