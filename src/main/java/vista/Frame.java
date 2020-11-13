package vista;

import javax.swing.JFrame;

public class Frame {
    JFrame frame;
    public Frame(){
        frame = new JFrame("Proyecto de memoria");
        frame.setSize(500,750);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
