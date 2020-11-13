package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame {
    public static Panel pnl_memoria;
    JPanel pnl_opciones;
    public static JFrame frame;
    public Frame(){
        frame = new JFrame("Proyecto de memoria");
        frame.setSize(1000,750);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        
        pnl_memoria = new Panel((JPanel) frame.getContentPane());
        frame.add(pnl_memoria, BorderLayout.CENTER);
        
        initComps();
        
        System.out.println("Pnl graphics: "+pnl_memoria.getGraphics());
        
        frame.setVisible(true);
    }
    public void initComps(){
        pnl_opciones = new JPanel();
        pnl_opciones.setPreferredSize(new Dimension(250,750));
        pnl_opciones.setBackground(Color.red);
        
        
        frame.add(pnl_opciones, BorderLayout.WEST);
    }
}
