package vista;

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
}
