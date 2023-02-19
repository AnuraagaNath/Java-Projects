package FoodBooking;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyWork extends Window{
    public static KeyListener setKeyWork() {
        return new KeyListener() {

            @Override
        public void keyTyped(KeyEvent e) {
            // TODO Auto-generated method stub
            
        }
    
        @Override
        public void keyPressed(KeyEvent e) {
            // TODO Auto-generated method stub
            char el = e.getKeyChar();
            if(Character.isLetter(el)|| Character.isWhitespace(el)) {
                jp2_food1_Field.setEditable(false);
                jp2_food2_Field.setEditable(false);
                jp2_food3_Field.setEditable(false);
                jp2_food4_Field.setEditable(false);
                jp2_food5_Field.setEditable(false);
                jp3_food1_Field.setEditable(false);
                jp3_food2_Field.setEditable(false);
                jp3_food3_Field.setEditable(false);
                jp3_food4_Field.setEditable(false);
                jp3_food5_Field.setEditable(false);            
            } 
            
            if(Character.isDigit(el) || e.getKeyCode() == KeyEvent.VK_BACK_SPACE || e.getKeyCode() == KeyEvent.VK_DELETE){
                jp2_food1_Field.setEditable(true);
                jp2_food2_Field.setEditable(true);
                jp2_food3_Field.setEditable(true);
                jp2_food4_Field.setEditable(true);
                jp2_food5_Field.setEditable(true);
                jp3_food1_Field.setEditable(true);
                jp3_food2_Field.setEditable(true);
                jp3_food3_Field.setEditable(true);
                jp3_food4_Field.setEditable(true);
                jp3_food5_Field.setEditable(true); 
            }
            
            
        }
    
        @Override
        public void keyReleased(KeyEvent e) {
            // TODO Auto-generated method stub
            
        }
    
        };
    }
}
