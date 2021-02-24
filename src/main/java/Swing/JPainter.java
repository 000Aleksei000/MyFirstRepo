package Swing;

import javax.swing.*;
import javax.tools.Tool;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class JPainter {
    public static void main(String[] args) {
        JFrame jFrame = getFrame();

        /*String [] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        for( String s : fonts ){
            System.out.println(s);
        }*/
        jFrame.add(new MyComponent());
    }

    static class MyComponent extends JComponent{
        @Override
        protected void paintComponent(Graphics g) {
            Font font = new Font("Arial", Font.BOLD, 20);
            Graphics2D g2 = (Graphics2D) g;
            g2.setFont(font);
            g2.drawString("hello world!" , 10 , 20);
            //Line2D line2D = new Line2D.Double(70, 70, 190, 190);
            //g2.draw(line2D);
            Point2D p1 = new Point2D.Double(70,70);
            Point2D p2 = new Point2D.Double(170,170);
            Line2D line2D = new Line2D.Double(p1, p2);
            g2.draw(line2D);

            Ellipse2D ellipse2D = new Ellipse2D.Double(25, 25 , 50, 50);
            g2.setColor(Color.blue);
            g2.draw(ellipse2D);
            g2.fill(ellipse2D);
        }
    }

    public static JFrame getFrame(){
       JFrame jFrame =  new JFrame(){};
       jFrame.setVisible(true);
       jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width/2 - 250, dimension.height/2 - 150, 500, 300);
        return jFrame;
    }
}
