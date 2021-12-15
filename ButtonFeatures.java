import java.awt.*;

public class ButtonFeatures extends Frame {
    Button b1,b2;
    ButtonFeatures(){
        setSize(600,200);
        setVisible(true);
        setBackground(Color.pink);
        setLayout(new FlowLayout());
        b1 = new Button();
        b2 = new Button();
        b1.setLabel("Login");
        b2.setLabel("Signup");
        b1.setPreferredSize(new Dimension(100,60));   // for button size
        b2.setPreferredSize(new Dimension(120,80));
        b1.setBackground(Color.YELLOW);
        b2.setBackground(Color.YELLOW);
        b1.setForeground(Color.RED);        // set color of the text
        b2.setForeground(Color.RED);
        b1.setEnabled(false);    // use for disable any button means button does not perform any tasks or events
        add(b1);
        add(b2);
        String g1 = b1.getLabel();
        System.out.println(g1);
    }
    public static void main(String[] args) {
        ButtonFeatures buttonFeatures = new ButtonFeatures();
    }
}
