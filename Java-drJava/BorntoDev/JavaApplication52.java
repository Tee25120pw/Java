/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//package javaapplication52;

import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author DSF Inc - Admin
 */
public class JavaApplication52 extends JFrame {

    JavaApplication52() {
        setLayout(null);

    
        JTextField t = new  JTextField();
        t.setBounds(0,0,300,20);
        add(t);
    
        t.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                boolean isOn = Toolkit.getDefaultToolkit().getLockingKeyState(KeyEvent.VK_CAPS_LOCK);

                if (isOn == true) {
                    System.err.println("ON");
                } else {
                    System.err.println("OFF");
                }
            }
        });

        setSize(300, 400);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JavaApplication52 fr = new JavaApplication52();
    }
}