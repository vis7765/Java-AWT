import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwapAssignment extends Frame implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        String s1  =t1.getText();
        String s2 = t2.getText();
        String temp = s1;
        s1 =s2;
        s2 =temp;
        t1.setText(s1);
        t2.setText(s2);

    }
    Button b1;
    TextField t1,t2;
    SwapAssignment(){
        setTitle("Swapping");
        setVisible(true);
        setBackground(Color.pink);
        setLayout(new FlowLayout());
        setSize(350,200);
        setLocation(100,100);
        b1 = new Button();
        t1 = new TextField(10);
        t1.setBackground(Color.ORANGE);
        t2 = new TextField(10);
        t2.setBackground(Color.ORANGE);
        b1.setLabel("Swap");
        b1.addActionListener(this);
        b1.setBackground(Color.YELLOW);
        b1.setForeground(Color.RED);   // set color of the text
        add(t1);
        add(t2);
        add(b1);

    }

    public static void main(String[] args) {
        SwapAssignment swapAssignment  = new SwapAssignment();
    }
}
