package Java.LearningJava.GUI;
import javax.swing.*;
import java.awt.*;

public class Frames {
    public static void main(String []args){
        JFrame frame = new JFrame(); //making JFrame object

        frame.setTitle("Vasu's Dialog Box"); //For title

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit on cutting window

        frame.setResizable(false);  //prevent resize options
        frame.setSize(420, 420); //sets x*y dimension
        frame.setVisible(true); // to show

        ImageIcon image = new ImageIcon(); // create an image icon
        frame.setIconImage(image.getImage()); //changes icon

        //changing bg color
        frame.getContentPane().setBackground(/*creating new color*/ new Color(125,152,250));

    }
}
