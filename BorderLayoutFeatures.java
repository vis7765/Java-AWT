import java.awt.*;

public class BorderLayoutFeatures extends Frame {

    Panel east,west,north,south,centre;
    BorderLayoutFeatures(){
        setSize(500,600);
        setVisible(true);
        setLayout(new BorderLayout(20,10));
        east =new Panel();
        west = new Panel();
        north = new Panel();
        south = new Panel();
        centre = new Panel();

        east.setBackground(Color.ORANGE);
        west.setBackground(Color.GREEN);
        north.setBackground(Color.RED);
        south.setBackground(Color.YELLOW);
        centre.setBackground(Color.BLUE);

        east.setPreferredSize(new Dimension(150,500));
        west.setPreferredSize(new Dimension(100,500));
        north.setPreferredSize(new Dimension(200,120));
        south.setPreferredSize(new Dimension(200,100));


        add(east,BorderLayout.EAST);
        add(west,BorderLayout.WEST);
        add(north,BorderLayout.NORTH);
        add(south,BorderLayout.SOUTH);
        add(centre,BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        BorderLayoutFeatures borderLayoutFeatures = new BorderLayoutFeatures();
    }
}
