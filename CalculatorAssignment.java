import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorAssignment extends Frame implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        Object sc = e.getSource();
        if(sc==sum){
            int a = Integer.parseInt(input1.getText());
            int b = Integer.parseInt(input2.getText());
            int c = a+b;
            equal.setText(""+c);
        }
        if(sc==sub){
            int a = Integer.parseInt(input1.getText());
            int b = Integer.parseInt(input2.getText());
            int c = a-b;
            equal.setText(""+c);
        }
        if(sc==div){
            int a = Integer.parseInt(input1.getText());
            int b = Integer.parseInt(input2.getText());
            int c = a/b;
            equal.setText(""+c);
        }
        if(sc==mult){
            int a = Integer.parseInt(input1.getText());
            int b = Integer.parseInt(input2.getText());
            int c = a*b;
            equal.setText(""+c);
        }if(sc==reset){
            input1.setText("");
            input2.setText("");
            equal.setText("");
        }
    }
    Button sum,sub,div,mult,reset;
    TextField input1,input2,equal;
    CalculatorAssignment(){
        setTitle("Swapping");
        setVisible(true);
        setBackground(Color.pink);
        setLayout(new FlowLayout());
        setSize(230,200);
        setLocation(100,100);
        sum = new Button();
        sum.setLabel("Add");
        sum.addActionListener(this);
        sub = new Button();
        sub.setLabel("Sub");
        sub.addActionListener(this);
        div = new Button();
        div.setLabel("Div");
        div.addActionListener(this);
        mult = new Button();
        mult.setLabel("Multi");
        mult.addActionListener(this);
        reset = new Button();
        reset.setLabel("Reset");
        reset.addActionListener(this);
        input1 = new TextField(10);
        input2 = new TextField(10);
        equal = new TextField(10);
        add(input1);
        add(input2);
        add(equal);
        add(sum);
        add(sub);
        add(mult);
        add(div);
        add(reset);

    }
    public static void main(String[] args) {
        CalculatorAssignment calculatorAssignment = new CalculatorAssignment();
    }
}
