package Form;

import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class MyWindow extends JFrame{
    
    private JLabel heading;
    private JPanel mainPanel;

    private JLabel nameLabel;
    private JTextField nameTextField;

    private JLabel passwordLabel;
    private JPasswordField passwordField;

    private JButton button1;
    private JButton button2;

    private Font font1 = new Font("", Font.BOLD, 25);
    private Font font2 = new Font("", Font.PLAIN, 20);
    MyWindow() {
        super.setTitle("My First Form");
        super.setSize(600,300);
        super.setLocation(300,300);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.createGUI();  
        super.setVisible(true);
        
    }

    public void createGUI() {
        this.setLayout(new BorderLayout());
        heading = new JLabel("My First Form");
        heading.setFont(font1);
        heading.setHorizontalAlignment(JLabel.CENTER);
        this.add(heading, BorderLayout.NORTH);

        mainPanel = new JPanel(new GridLayout());
        mainPanel.setLayout(new GridLayout(3,2));
        

        nameLabel = new JLabel("Enter Name");
        nameLabel.setHorizontalAlignment(JLabel.CENTER);
        mainPanel.add(nameLabel);
        nameTextField = new JTextField();
        mainPanel.add(nameTextField);
        passwordLabel = new JLabel("Enter Password");
        passwordLabel.setHorizontalAlignment(JLabel.CENTER);
        mainPanel.add(passwordLabel);
        passwordField = new JPasswordField();
        mainPanel.add(passwordField);
        button1 = new JButton("Submit");
        mainPanel.add(button1);
        button2 = new JButton("Reset");
        mainPanel.add(button2);


        nameLabel.setFont(font2);
        nameTextField.setFont(font2);
        passwordLabel.setFont(font2);
        passwordField.setFont(font2);
        button1.setFont(font2);
        button2.setFont(font2);

        this.add(mainPanel, BorderLayout.CENTER);


    }
}
