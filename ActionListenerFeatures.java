import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListenerFeatures extends Frame implements ActionListener {
    Button b1,b2;
    ActionListenerFeatures(){
        setSize(600,200);
        setVisible(true);
        setBackground(Color.pink);
        setLayout(new FlowLayout());
        b1 = new Button();
        b2 = new Button();
        b1.setLabel("Click me");
        b2.setLabel("Hello Budddy");
        b1.addActionListener(this);
        b1.setPreferredSize(new Dimension(100,60));   // for button size
        b1.setBackground(Color.YELLOW);
        b1.setForeground(Color.RED);        // set color of the text
        add(b1);
        b2.addActionListener(this);
        b2.setPreferredSize(new Dimension(100,60));   // for button size
        b2.setBackground(Color.YELLOW);
        b2.setForeground(Color.RED);        // set color of the text
        add(b2);
    }

    public static void main(String[] args) {

        ActionListenerFeatures actionListenerFeatures = new ActionListenerFeatures();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object sc = e.getSource();

        if(sc == b1){
            System.out.println("You Clicked me ");
        }
        if (sc == b2){
            System.out.println("Hello buddy");
        }
    }
}
