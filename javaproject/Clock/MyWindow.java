package javaproject.Clock;

import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.InterruptedIOException;
import java.text.SimpleDateFormat;

public class MyWindow extends JFrame {
    private JLabel heading;
    private JLabel clockLabel;
    private Font font = new Font("", Font.BOLD, 35);
    

    MyWindow() {
        super.setTitle("Raaga Clock");
        super.setSize(300, 300);
        super.setLocation(400, 100);
        this.setGUI();
        this.startClock();
        
        // set the JFrame visible at last
        super.setVisible(true);
    }
     
    public void setGUI() {
        heading = new JLabel("My clock");
        clockLabel = new JLabel("clock");

        heading.setFont(font);
        clockLabel.setFont(font);

        this.setLayout(new GridLayout(2,1));
        this.add(heading);
        this.add(clockLabel);

    }

    public void startClock() {
        Thread thread = new Thread() {
            public void run() {
                try{
                    while(true) {
                        Date date = new Date();
                        SimpleDateFormat sfd = new SimpleDateFormat("hh : mm : ss a");
                        String dateTime = sfd.format(date);
                        clockLabel.setText(dateTime);
                        Thread.sleep(1000);
    
                    }
                } catch(InterruptedException e) {
                    e.printStackTrace();
                }
                
            }
        };
        thread.start();
    }

}
