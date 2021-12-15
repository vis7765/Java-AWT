import java.awt.*;

public class TextFieldFeatures extends Frame {
    public static void main(String[] args) {
        new TextFieldFeatures();
    }
    public TextFieldFeatures(){
        setSize(300,300);
        setVisible(true);
        setBackground(Color.pink);
        setLayout(new FlowLayout());
        TextField t1 = new TextField("Hello Buddy");
        add(t1);
        t1.setEditable(false);
        t1.setText("Vishal");
        System.out.println("Text Value is : " + t1.getText());
        System.out.println(t1.isEditable());
    }
}
