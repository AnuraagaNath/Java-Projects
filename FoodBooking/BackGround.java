package FoodBooking;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class BackGround extends Window{
    protected static JLabel bgimg;
    public static JLabel setBG() {
        ImageIcon img = new ImageIcon("C:/Users/ANURAAGA/ANURAAGA-PERSONAL/Programming/assets/background.jpg");
        bgimg = new JLabel("", img, JLabel.CENTER);
        bgimg.setBounds(0,0,1050,450);
        return bgimg;
    }
}
