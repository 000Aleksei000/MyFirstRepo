package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LookAndFeel {
    public static void main(String[] args) {
        /*UIManager.LookAndFeelInfo [] lookAndFeelInfos = UIManager.getInstalledLookAndFeels();
        for(UIManager.LookAndFeelInfo lookAndFeelInfo : lookAndFeelInfos){
            System.out.println(lookAndFeelInfo.getName());
            System.out.println(lookAndFeelInfo.getClassName());
            System.out.println();
        }*/
        JFrame jFrame = getFrame();
        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);
        JButton jButton1 = new JButton("Metal");
        JButton jButton2 = new JButton("Nimbus");
        JButton jButton3 = new JButton("Motif");
        JButton jButton4 = new JButton("Windows");

        jPanel.add(jButton1);
        jPanel.add(jButton2);
        jPanel.add(jButton3);
        jPanel.add(jButton4);

        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
                    SwingUtilities.updateComponentTreeUI(jFrame);
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException classNotFoundException) {
                    classNotFoundException.printStackTrace();
                }
            }
        });
        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
                    SwingUtilities.updateComponentTreeUI(jFrame);
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException classNotFoundException) {
                    classNotFoundException.printStackTrace();
                }
            }
        });
        jButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
                    SwingUtilities.updateComponentTreeUI(jFrame);
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException classNotFoundException) {
                    classNotFoundException.printStackTrace();
                }
            }
        });
        jButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                    SwingUtilities.updateComponentTreeUI(jFrame);
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException classNotFoundException) {
                    classNotFoundException.printStackTrace();
                }
            }
        });
    }

    static JFrame getFrame(){
        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width / 2 - 400, dimension.height / 2 - 250, 800, 500);
        return jFrame;
    }
}
