package controlador;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.SwingUtilities;
import vista.Panel;

public class dibujarProcesoNuevo {
    Panel pnl;
    public dibujarProcesoNuevo(Panel pnl){
        this.pnl = pnl;
    }
    public void dibujar(Graphics g, int x, int y){
        g.setColor(Color.RED);
        g.fillOval(x, y, 30, 30);
    }
    public void moverPart1(Graphics g, int x1, int y1, int x2, int y2){
        do{
            //x1=250->x2=62
            //y1=300->y2=50
            g.setColor(Color.GREEN);
            g.fillOval(x1, y1, 45, 45);
            SwingUtilities.updateComponentTreeUI(pnl);
            x1-=5;
            y1-=5;
            try{
                Thread.sleep(50);
            }catch(Exception e){System.out.println(e.getMessage());}
            
        }while(x1 > x2 && y1 > y2);
        
    }
}
