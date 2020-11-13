package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.Panel;

public class accionesBtn implements ActionListener{
    Panel pnl;
    
    public accionesBtn(Panel pnl){
        this.pnl = pnl;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.println("Pnl Graphics: "+pnl.getGraphics());
        System.out.println("Cleaning...");
    }
    
}
