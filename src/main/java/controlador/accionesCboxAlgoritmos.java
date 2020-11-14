package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import vista.Panel;

public class accionesCboxAlgoritmos implements ActionListener{
    Panel pnl;
    JComboBox cBoxAlgos;
    public static String algoritmo;
    public accionesCboxAlgoritmos(Panel pnl){
        this.pnl = pnl;
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        cBoxAlgos = (JComboBox) ae.getSource();
        algoritmo = cBoxAlgos.getSelectedItem().toString();
    }
}
