import java.awt.*;

public class GridLayoutFeature extends Frame {
    GridLayoutFeature(){
        setSize(200,500);
        setVisible(true);
        setBackground(Color.pink);
        setLocation(100,100);
        setLayout(new GridLayout(3,2,10,10));

        // we can pass 4 or 2 parameter in grid layout
        // in 4 parameter, last two are horizontal and vertical gap between two buttons

        add(new Button("1"));
        add(new Button("2"));
        add(new Button("3"));
        add(new Button("4"));
        add(new Button("5"));
        add(new Button("6"));
    }
    public static void main(String[] args) {
        GridLayoutFeature gridLayoutFeature = new GridLayoutFeature();
    }
}
