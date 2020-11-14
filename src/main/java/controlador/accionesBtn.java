package controlador;

import static controlador.accionesCboxAlgoritmos.algoritmo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
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
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.println("Nuevo algoritmo: "+algoritmo);
        System.out.println("Procesos en lista: ");
        l.imprimirProcesos();
        System.out.println("");
        if(algoritmo == null){
            JOptionPane.showMessageDialog(frame, "No hay ajuste seleccionado");
        }else if(algoritmo.equals("Primer Ajuste")){
            if(hpra == null){
                l.limpiarProcesos();
                hpra = new hiloPrimerAjuste(l, pnl, lSize);
                hpra.start();
            }
        }else if(algoritmo.equals("Mejor Ajuste")){
            if(hma == null){
                l.limpiarProcesos();
                hma = new hiloMejorAjuste(l, pnl, lSize);
                hma.start();
            }
        }else if(algoritmo.equals("Peor Ajuste")){
            if(hpa == null){
                l.limpiarProcesos();
                hpa = new hiloPeorAjuste(l, pnl, lSize);
                hpa.start();
            }
        }
    }
    public void reloadFrame(){
        SwingUtilities.updateComponentTreeUI(frame);
    }
    public void reloadPnl(){
        SwingUtilities.updateComponentTreeUI(pnl);
    }
}
