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
    public void nuevo(Graphics g,Color color, int x, int y){
        pnl.paintComponent(g, color, x, y);
    }
    public void moverPart1(Graphics g, int x1, int y1, int x2, int y2){
        do{
            //x1=250->x2=62
            //y1=300->y2=50
            pnl.paintComponent(g, Color.yellow, x1, y1);
            x1-=2;
            y1-=2;
            try{
                Thread.sleep(50);
            }catch(Exception e){System.out.println(e.getMessage());}
        }while(x1 > x2 && y1 > y2);
//        pnl.repaint();
        pnl.paintComponent(g, Color.yellow, x1, y1);
    }
}
