package controlador;

//import java.awt.BorderLayout;
//import java.awt.Color;
//import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
//import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import modelo.lista;
import vista.Panel;

public class accionesBtn implements ActionListener{
    Panel pnl;
    JFrame frame;
    hiloPrimerAjuste hpra;
    hiloMejorAjuste hma;
    hiloPeorAjuste hpa;
    lista l;
    int lSize;
    public accionesBtn(JFrame frame,Panel pnl, hiloPrimerAjuste h){
        this.pnl = pnl;
        this.frame = frame;
        this.hpra = h;
        crearMapaMemoria();
    }
    public void crearMapaMemoria(){
        l = new lista();
        l.insertarParticion(400, 62, 50);
        l.insertarParticion(700, 125, 50);
        l.insertarParticion(900, 187, 50);
        l.insertarParticion(1000, 250, 50);
        l.insertarParticion(1200, 300, 50);
        l.insertarParticion(1500, 360, 50);
        l.insertarParticion(1800, 410, 50);
        lSize = 7;
        l.imprimirLista();
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {

/*      
        if(hpa == null){
            hpa = new hiloPeorAjuste(l, pnl, lSize);
            hpa.start();
        }
        if(hma == null){
            hma = new hiloMejorAjuste(l, pnl, lSize);
            hma.start();
        }
        if(hpra == null){
            hpra = new hiloPrimerAjuste(l, pnl, lSize);
            hpra.start();
        }
        frame.remove(pnl);
        pnl = new Panel((JPanel)frame.getContentPane());
        frame.add(pnl,BorderLayout.CENTER);
        
        System.out.println("Reloading...");
        
        reloadFrame();
        
        new dibujarProcesoNuevo().dibujar(pnl.getGraphics(), 0, 0);
        reloadPnl();
*/
    }
    public void reloadFrame(){
        SwingUtilities.updateComponentTreeUI(frame);
    }
    public void reloadPnl(){
        SwingUtilities.updateComponentTreeUI(pnl);
    }
}
