package com.company.GUI;
import java.awt.*;
import javax.swing.*;

public class Labels {
    public static void main(String []args) {
        
        ImageIcon image = new ImageIcon("/home/vasu/Downloads/—Pngtree—watercolor flowers shading_1778654.png");

        // JLabel = a gui display area for a string of text, image or both.
        JLabel label = new JLabel(); //create label
        label.setIcon(image); // set image icon
        label.setText("Bro, Do you even code ?"); //set text of label
        label.setHorizontalTextPosition(JLabel.CENTER); //set tet left,centre,right of image icon
        label.setVerticalTextPosition(JLabel.CENTER); // set vertically
        label.setForeground(new Color(124,56,88));
        label.setFont(new Font("Mv Boli", Font.BOLD,20));//set font of text
        label.setIconTextGap(-25);//set gap of text to image
        label.setBackground(Color.gray);//set bg color
        label.setOpaque(true);//to display bg color



        JFrame frame = new JFrame();
        frame.setTitle("Virus :):(:");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setSize(420, 420);
        frame.setVisible(true);

        frame.add(label); //adding label we just created
    }
}
