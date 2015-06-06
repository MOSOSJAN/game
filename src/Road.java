import javax.swing.*;
import java.awt.*;

/**
 * Created by Comp on 18.05.2015.
 */
public class Road extends JPanel {
    Image img = new  ImageIcon("res/road.png").getImage();

    public void paint(Graphics g){
        g = (Graphics2D) g;
        g.drawImage(img,0,0,null);
    }
}
