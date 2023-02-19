package FoodBooking;
// Imports
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import java.awt.Container;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

public class Window extends JFrame{

    // Requuired elements
    protected Container container;
    protected JPanel jpanel1, jpanel2, jpanel3, jpanel4, jpanel5, jpanel6, jpanel7, jpanel8, jpanel9;
    protected Font font1, font2;
    protected JLabel heading,title1, title2, jpanel2_food1,jpanel2_food2, jpanel2_food3, jpanel2_food4, jpanel2_food5, jpanel3_food1, jpanel3_food2, jpanel3_food3, jpanel3_food4, jpanel3_food5, cost_of_meal, cost_of_drink, total_cost_of_made, tax, sub_total, total, picture_position1, picture_position2;
    protected JButton btn_total, btn_receipt, btn_reset, btn_exit;
    protected static JTextField jp2_food1_Field,jp2_food2_Field,jp2_food3_Field,jp2_food4_Field,jp2_food5_Field, jp3_food1_Field, jp3_food2_Field, jp3_food3_Field, jp3_food4_Field,jp3_food5_Field,cost_of_meal_Field,cost_of_drink_Field,total_cost_of_made_Field,tax_Field,sub_total_Field,total_Field;
    protected JTextArea display_area;
    protected LineBorder border_type0, border_type1, border_type2;

    public Window() {
        // Setting up JFrame
        super.setSize(1050,450);
        super.setLocation(300,200);
        super.setAlwaysOnTop(false);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // // To remove default minimize, maximize and close
        super.setUndecorated(true); 
        this.createGUI();
        // adding Background image
        
        super.add(BackGround.setBG());
        super.setVisible(true);
         
    }

    public void createGUI() {
        // Font Styles
        font1 = new Font("", Font.BOLD, 15);
        font2 = new Font("", Font.BOLD, 20);

        // Border Styles
        border_type0 = new LineBorder(Color.BLACK,1,true);
        border_type1 = new LineBorder(Color.GREEN, 4, true);
        border_type2 = new LineBorder(Color.YELLOW, 4, true);
        
        container = new Container();
        container = super.getContentPane();
        container.setLayout(null);
        // container.setBackground(Color.LIGHT_GRAY);
        

        // JPanels
        jpanel1 = new JPanel(null);
        jpanel1.setLocation(320,10);
        jpanel1.setSize(535,50);
        jpanel1.setBackground(Color.BLACK);
        jpanel1.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        jpanel2 = new JPanel(null);
        jpanel2.setLocation(30,80);
        jpanel2.setSize(300,160);
        jpanel2.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        jpanel3 = new JPanel(null);
        jpanel3.setLocation(350,80);
        jpanel3.setSize(300,160);
        jpanel3.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        jpanel4 = new JPanel(null);
        jpanel4.setLocation(30,250);
        jpanel4.setSize(300,90);
        jpanel4.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        jpanel5 = new JPanel(null);
        jpanel5.setLocation(350,250);
        jpanel5.setSize(300,90);
        jpanel5.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        jpanel6 = new JPanel(null);
        jpanel6.setLocation(30,350);
        jpanel6.setSize(620,50);
        jpanel6.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        jpanel7 = new JPanel(null);
        jpanel7.setLocation(700,80);
        jpanel7.setSize(300,320);
        jpanel7.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        jpanel8 = new JPanel(null);
        jpanel8.setLocation(250,10);
        jpanel8.setSize(50,50);
        
        jpanel9 = new JPanel(null);
        jpanel9.setLocation(870,10);
        jpanel9.setSize(50,50);
        
        // JLabels and JTextFields
        heading = new JLabel("Hell's Kitchen");
        heading.setFont(new Font("", Font.BOLD, 35));
        heading.setLocation(0,0);
        heading.setHorizontalAlignment(JLabel.CENTER);
        heading.setSize(540,50);
        heading.setForeground(Color.WHITE);
        jpanel1.add(heading);


        // Resizing and Inserting picture using ImageIcon and Image
        picture_position1 = new JLabel();
        picture_position1.setSize(50,50);
        picture_position1.setLocation(0,0);
        ImageIcon icon1 = new ImageIcon("C:/Users/ANURAAGA/ANURAAGA-PERSONAL/Programming/assets/R.png");
        Image img1 = icon1.getImage();
        Image imgScale1 = img1.getScaledInstance(picture_position1.getWidth(), picture_position1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon1 = new ImageIcon(imgScale1);
        picture_position1.setIcon(scaledIcon1);
        jpanel8.add(picture_position1);

        picture_position2 = new JLabel();
        picture_position2.setSize(50,50);
        picture_position2.setLocation(0,0);
        ImageIcon icon2 = new ImageIcon("C:/Users/ANURAAGA/ANURAAGA-PERSONAL/Programming/assets/R.png");
        Image img2 = icon2.getImage();
        Image imgScale2 = img2.getScaledInstance(picture_position2.getWidth(), picture_position2.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon2 = new ImageIcon(imgScale2);
        picture_position2.setIcon(scaledIcon2);
        jpanel9.add(picture_position2);

        title1 = new JLabel("Meals");
        title1.setFont(font2);
        title1.setLocation(120,0);
        title1.setSize(100,30);
        jpanel2.add(title1);

        jpanel2_food1 = new JLabel("Filet-O-Fish");
        jpanel2_food1.setFont(font1);
        jpanel2_food1.setLocation(10,30);
        jpanel2_food1.setSize(150,20);
        jpanel2.add(jpanel2_food1);

        jp2_food1_Field = new JTextField("0",15);
        jp2_food1_Field.setLocation(240,30);
        jp2_food1_Field.setHorizontalAlignment(JTextField.CENTER);
        jp2_food1_Field.setSize(50,20);
        jp2_food1_Field.setFont(font1);
        jp2_food1_Field.addKeyListener(KeyWork.setKeyWork());
        jpanel2.add(jp2_food1_Field);

        jpanel2_food2 = new JLabel("Chicken Burger");
        jpanel2_food2.setFont(font1);
        jpanel2_food2.setLocation(10,55);
        jpanel2_food2.setSize(150,20);
        jpanel2.add(jpanel2_food2);

        jp2_food2_Field = new JTextField("0",15);
        jp2_food2_Field.setLocation(240,55);
        jp2_food2_Field.setHorizontalAlignment(JTextField.CENTER);
        jp2_food2_Field.setSize(50,20);
        jp2_food2_Field.setFont(font1);
        jp2_food2_Field.addKeyListener(KeyWork.setKeyWork());
        jpanel2.add(jp2_food2_Field);

        jpanel2_food3 = new JLabel("Chicken Legend");
        jpanel2_food3.setFont(font1);
        jpanel2_food3.setLocation(10,80);
        jpanel2_food3.setSize(150,20);
        jpanel2.add(jpanel2_food3);

        jp2_food3_Field = new JTextField("0",15);
        jp2_food3_Field.setLocation(240,80);
        jp2_food3_Field.setHorizontalAlignment(JTextField.CENTER);
        jp2_food3_Field.setSize(50,20);
        jp2_food3_Field.setFont(font1);
        jp2_food3_Field.addKeyListener(KeyWork.setKeyWork());
        jpanel2.add(jp2_food3_Field);

        jpanel2_food4 = new JLabel("Chicken Burger Meal");
        jpanel2_food4.setFont(font1);
        jpanel2_food4.setLocation(10,105);
        jpanel2_food4.setSize(150,20);
        jpanel2.add(jpanel2_food4);

        jp2_food4_Field = new JTextField("0",15);
        jp2_food4_Field.setLocation(240,105);
        jp2_food4_Field.setHorizontalAlignment(JTextField.CENTER);
        jp2_food4_Field.setSize(50,20);
        jp2_food4_Field.setFont(font1);
        jp2_food4_Field.addKeyListener(KeyWork.setKeyWork());
        jpanel2.add(jp2_food4_Field);

        jpanel2_food5 = new JLabel("Bacon and Cheese Burger");
        jpanel2_food5.setFont(font1);
        jpanel2_food5.setLocation(10,130);
        jpanel2_food5.setSize(190,20);
        jpanel2.add(jpanel2_food5);

        jp2_food5_Field = new JTextField("0",15);
        jp2_food5_Field.setLocation(240,130);
        jp2_food5_Field.setHorizontalAlignment(JTextField.CENTER);
        jp2_food5_Field.setSize(50,20);
        jp2_food5_Field.setFont(font1);
        jp2_food5_Field.addKeyListener(KeyWork.setKeyWork());
        jpanel2.add(jp2_food5_Field);
        
        title2 = new JLabel("Drinks");
        title2.setFont(font2);
        title2.setLocation(120,0);
        title2.setSize(100,30);
        jpanel3.add(title2);

        jpanel3_food1 = new JLabel("Milk Shake");
        jpanel3_food1.setFont(font1);
        jpanel3_food1.setLocation(10,30);
        jpanel3_food1.setSize(150,20);
        jpanel3.add(jpanel3_food1);

        jp3_food1_Field = new JTextField("0",15);
        jp3_food1_Field.setLocation(240,30);
        jp3_food1_Field.setHorizontalAlignment(JTextField.CENTER);
        jp3_food1_Field.setSize(50,20);
        jp3_food1_Field.setFont(font1);
        jp3_food1_Field.addKeyListener(KeyWork.setKeyWork());
        jpanel3.add(jp3_food1_Field);

        jpanel3_food2 = new JLabel("Vanilla Cone");
        jpanel3_food2.setFont(font1);
        jpanel3_food2.setLocation(10,55);
        jpanel3_food2.setSize(150,20);
        jpanel3.add(jpanel3_food2);

        jp3_food2_Field = new JTextField("0",15);
        jp3_food2_Field.setLocation(240,55);
        jp3_food2_Field.setHorizontalAlignment(JTextField.CENTER);
        jp3_food2_Field.setSize(50,20);
        jp3_food2_Field.setFont(font1);
        jp3_food2_Field.addKeyListener(KeyWork.setKeyWork());
        jpanel3.add(jp3_food2_Field);

        jpanel3_food3 = new JLabel("Classic Vanilla");
        jpanel3_food3.setFont(font1);
        jpanel3_food3.setLocation(10,80);
        jpanel3_food3.setSize(150,20);
        jpanel3.add(jpanel3_food3);

        jp3_food3_Field = new JTextField("0",15);
        jp3_food3_Field.setLocation(240,80);
        jp3_food3_Field.setHorizontalAlignment(JTextField.CENTER);
        jp3_food3_Field.setSize(50,20);
        jp3_food3_Field.setFont(font1);
        jp3_food3_Field.addKeyListener(KeyWork.setKeyWork());
        jpanel3.add(jp3_food3_Field);

        jpanel3_food4 = new JLabel("Vanilla Milk Shake");
        jpanel3_food4.setFont(font1);
        jpanel3_food4.setLocation(10,105);
        jpanel3_food4.setSize(150,20);
        jpanel3.add(jpanel3_food4);

        jp3_food4_Field = new JTextField("0",15);
        jp3_food4_Field.setLocation(240,105);
        jp3_food4_Field.setHorizontalAlignment(JTextField.CENTER);
        jp3_food4_Field.setSize(50,20);
        jp3_food4_Field.setFont(font1);
        jp3_food4_Field.addKeyListener(KeyWork.setKeyWork());
        jpanel3.add(jp3_food4_Field);

        jpanel3_food5 = new JLabel("Chocolate Milk Shake");
        jpanel3_food5.setFont(font1);
        jpanel3_food5.setLocation(10,130);
        jpanel3_food5.setSize(190,20);
        jpanel3.add(jpanel3_food5);

        jp3_food5_Field = new JTextField("0",15);
        jp3_food5_Field.setLocation(240,130);
        jp3_food5_Field.setHorizontalAlignment(JTextField.CENTER);
        jp3_food5_Field.setSize(50,20);
        jp3_food5_Field.setFont(font1);
        jp3_food5_Field.addKeyListener(KeyWork.setKeyWork());
        jpanel3.add(jp3_food5_Field);

        cost_of_meal = new JLabel("Cost of Meal");
        cost_of_meal.setFont(font1);
        cost_of_meal.setLocation(10,10);
        cost_of_meal.setSize(150,20);
        jpanel4.add(cost_of_meal);

        cost_of_meal_Field = new JTextField();
        cost_of_meal_Field.setLocation(240,10);
        cost_of_meal_Field.setSize(50,20);
        cost_of_meal_Field.setFont(font1);
        cost_of_meal_Field.setEditable(false);
        jpanel4.add(cost_of_meal_Field);

        cost_of_drink = new JLabel("Cost of Drinks");
        cost_of_drink.setFont(font1);
        cost_of_drink.setLocation(10,35);
        cost_of_drink.setSize(150,20);
        jpanel4.add(cost_of_drink);

        cost_of_drink_Field = new JTextField();
        cost_of_drink_Field.setLocation(240,35);
        cost_of_drink_Field.setSize(50,20);
        cost_of_drink_Field.setFont(font1);
        cost_of_drink_Field.setEditable(false);
        jpanel4.add(cost_of_drink_Field);

        total_cost_of_made = new JLabel("Total Cost of Made");
        total_cost_of_made.setFont(font1);
        total_cost_of_made.setLocation(10,60);
        total_cost_of_made.setSize(150,20);
        jpanel4.add(total_cost_of_made);

        total_cost_of_made_Field = new JTextField();
        total_cost_of_made_Field.setLocation(240,60);
        total_cost_of_made_Field.setSize(50,20);
        total_cost_of_made_Field.setFont(font1);
        total_cost_of_made_Field.setEditable(false);
        jpanel4.add(total_cost_of_made_Field);

        tax = new JLabel("%GST");
        tax.setFont(font1);
        tax.setLocation(10,10);
        tax.setSize(150,20);
        jpanel5.add(tax);

        tax_Field = new JTextField();
        tax_Field.setLocation(240,10);
        tax_Field.setSize(50,20);
        tax_Field.setFont(font1);
        tax_Field.setEditable(false);
        jpanel5.add(tax_Field);

        sub_total = new JLabel("Sub Total");
        sub_total.setFont(font1);
        sub_total.setLocation(10,35);
        sub_total.setSize(150,20);
        jpanel5.add(sub_total);

        sub_total_Field = new JTextField();
        sub_total_Field.setLocation(240,35);
        sub_total_Field.setSize(50,20);
        sub_total_Field.setFont(font1);
        sub_total_Field.setEditable(false);
        jpanel5.add(sub_total_Field);

        total = new JLabel("Total");
        total.setFont(font1);
        total.setLocation(10,60);
        total.setSize(150,20);
        jpanel5.add(total);

        total_Field = new JTextField();
        total_Field.setLocation(240,60);
        total_Field.setSize(50,20);
        total_Field.setFont(font1);
        total_Field.setEditable(false);
        jpanel5.add(total_Field);

        // JTextArea
        display_area = new JTextArea();
        display_area.setLocation(1,1);
        display_area.setSize(298,318);
        display_area.setFont(font1);
        display_area.setEditable(false);
        display_area.setLineWrap(true);
        jpanel7.add(display_area);

        // Total Button
        btn_total = new JButton("Total");
        btn_total.setLocation(25,15);
        btn_total.setSize(90,20);
        btn_total.setFont(font1);
        btn_total.addActionListener((e) -> {
            jpanel2.setBorder(border_type1);
            jpanel3.setBorder(border_type1);
            jpanel4.setBorder(border_type2);
            jpanel5.setBorder(border_type2);
            cost_of_meal_Field.setText("₹"+Sums.mealtotal());
            cost_of_drink_Field.setText("₹" + Sums.drinkstotal());
            total_cost_of_made_Field.setText("₹" + Sums.totalmade() );
            display_area.setText("Meals Booked: " + Sums.mealreceipt() + "\nDrinks Booked: " + Sums.drinkreceipt());
            tax_Field.setText("2.5");
            sub_total_Field.setText("₹"+Sums.subtotal());
            total_Field.setText("₹"+Sums.total());
            
        });
        jpanel6.add(btn_total);

        // Receipt Button
        btn_receipt = new JButton("Receipt");
        btn_receipt.setLocation(175,15);
        btn_receipt.setSize(90,20);
        btn_receipt.setFont(font1);
        btn_receipt.addActionListener((e)-> {
            
            int receipt = JOptionPane.showConfirmDialog(rootPane, "Do you want to continue for payment?", "Payment GateWay", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if(receipt == JOptionPane.YES_OPTION) {
                        display_area.setText("\nMeals Booked: " + Sums.mealreceipt() + "\nDrinks Booked: " + Sums.drinkreceipt() + "\nGST: " + sub_total_Field.getText() + "\nTotal Price:" + total_Field.getText()+"\nThanks for booking!");
            jpanel4.setBorder(border_type1);
            jpanel5.setBorder(border_type1);                   
            display_area.setForeground(Color.GREEN);
            display_area.setBorder(border_type1);
            btn_total.setEnabled(false);
                } else if(receipt == JOptionPane.NO_OPTION) {
                    setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                }
        });
    
        jpanel6.add(btn_receipt);

        // Reset Button
        btn_reset = new JButton("Reset");
        btn_reset.setLocation(325,15);
        btn_reset.setSize(90,20);
        btn_reset.setFont(font1);
        btn_reset.addActionListener((e)-> {
            int reset = JOptionPane.showConfirmDialog(rootPane, "Do you want to reset all the actions?", "Reset Prompt", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if(reset == JOptionPane.YES_OPTION) {
                cost_of_meal_Field.setText(null);
                cost_of_drink_Field.setText(null);
                total_cost_of_made_Field.setText(null);
                tax_Field.setText(null);
                sub_total_Field.setText(null);
                total_Field.setText(null);
                jp2_food1_Field.setText("0");
                jp2_food2_Field.setText("0");
                jp2_food3_Field.setText("0");
                jp2_food4_Field.setText("0");
                jp2_food5_Field.setText("0");
                jp3_food1_Field.setText("0");
                jp3_food2_Field.setText("0");
                jp3_food3_Field.setText("0");
                jp3_food4_Field.setText("0");
                jp3_food5_Field.setText("0");
                display_area.setText(null);
                display_area.setBackground(Color.WHITE);
                display_area.setForeground(Color.BLACK);
                jpanel2.setBorder(border_type0);
                jpanel3.setBorder(border_type0);
                jpanel4.setBorder(border_type0);
                jpanel5.setBorder(border_type0);
                btn_total.setEnabled(true);
            }
            else {
                setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            }
        });
        jpanel6.add(btn_reset);

        // Exit button
        btn_exit = new JButton("Exit");
        btn_exit.setLocation(475,15);
        btn_exit.setSize(90,20);
        btn_exit.addActionListener((e)-> {
            int exit = JOptionPane.showConfirmDialog(rootPane, "Do you want to exit?", "Exit", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(exit == JOptionPane.YES_OPTION) {
                System.exit(0);
            } else {
                setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            }
        });
        btn_exit.setFont(font1);
        jpanel6.add(btn_exit);

       

        container.add(jpanel1);
        container.add(jpanel2);
        container.add(jpanel3);
        container.add(jpanel4);
        container.add(jpanel5);
        container.add(jpanel6);
        container.add(jpanel7);
        container.add(jpanel8);
        container.add(jpanel9);
    }
    
    

}
