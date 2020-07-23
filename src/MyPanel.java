import java.awt.*;
import javax.swing.*;
public class MyPanel extends JPanel  {

    public void paintComponent (Graphics g){
        super.paintComponent(g);

        g.drawArc(10,10 ,100 ,100 ,45  , 90);

    }



}
