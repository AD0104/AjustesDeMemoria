package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import vista.Panel;

public class accionesCboxAlgoritmos implements ActionListener{
    Panel pnl;
    JComboBox cBoxAlgos;
    public accionesCboxAlgoritmos(Panel pnl){
        this.pnl = pnl;
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        cBoxAlgos = (JComboBox) ae.getSource();
        String algoritmo = cBoxAlgos.getSelectedItem().toString();
        if(algoritmo.equals("Primer Ajuste")){
            System.out.println("Seleccionado: "+algoritmo);
        }else if(algoritmo.equals("Mejor Ajuste")){
            System.out.println("Seleccionado: "+algoritmo);
        }else if(algoritmo.equals("Peor Ajuste")){
            System.out.println("Seleccionado: "+algoritmo);
        }
    }
    
    
}
