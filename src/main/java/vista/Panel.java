package vista;

import java.awt.Color;
import java.awt.Graphics;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

public class Panel extends javax.swing.JPanel{
    public Panel(JPanel frame){
        try{
            this.setSize(frame.getWidth(), frame.getHeight());
            this.setBorder(new imagenFondo(ImageIO.read(new File("img/memorias_ordenadas.png"))));
        }catch(IOException ioe){
            JOptionPane.showMessageDialog(this, ioe.getMessage());
        }
    }
//    @Override
    public void paintComponent(Graphics g, Color color, int x,int y){
        super.paintComponent(g);
        g.setColor(color);
        g.fillOval(x, y, 45,45);
        this.repaint();
    }
}
