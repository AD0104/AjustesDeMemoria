package vista;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import javax.swing.border.Border;

public class imagenFondo implements Border{
    protected BufferedImage myImage = null;
    
    public imagenFondo(BufferedImage image){
        this.myImage = image;
    }
    
    @Override
    public void paintBorder(Component cmpnt, Graphics g, int x, int y, int width, int height) {
        if(myImage != null){
            g.drawImage(myImage, 0, 0, width,height,null);
        }
    }

    @Override
    public Insets getBorderInsets(Component cmpnt) {
        return new Insets(0, 0, 0, 0);
    }

    @Override
    public boolean isBorderOpaque() {
        return true;
    }
    
}
