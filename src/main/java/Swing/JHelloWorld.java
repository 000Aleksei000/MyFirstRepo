package Swing;

import javax.swing.*;
import java.awt.*;

public class JHelloWorld {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame(){};
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //jFrame.setSize(500, 300);
        //jFrame.setLocation(400, 200);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();

        jFrame.setBounds(dimension.width/2 - 150, dimension.height/2 - 150, 500, 300);


        jFrame.setTitle("this is my app");
        //jFrame.setIconImage();
        }
    }
