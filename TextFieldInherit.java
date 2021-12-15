import java.awt.*;

public class TextFieldInherit {
    public static void main(String[] args) {
        MyFrame a = new MyFrame();

    }
    public static class  MyFrame extends Frame{
        private TextField t1 = new TextField("hello Buddy");
        private TextField t2 = new TextField("Hello Buddy");
        private TextField t3 = new TextField("Hello Buddy");
        MyFrame(){
            this.setSize(300,400);
            setBackground(Color.pink);
            setVisible(true);
            setLayout(new FlowLayout(FlowLayout.LEFT,100,40));
            add(t1);
            add(t2);
            add(t3);

        }
    }
}
