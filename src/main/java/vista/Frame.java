package vista;

import controlador.accionesBtn;
import controlador.accionesCboxAlgoritmos;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame {
    public static Panel pnl_memoria;
    public static JPanel pnl_opciones;
    accionesCboxAlgoritmos acAl;
    accionesBtn acbtn;
    JComboBox algoritmos;
    JButton start;
    String[] algos = {"Elegir...","Primer Ajuste","Mejor Ajuste","Peor Ajuste"};
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
        
        
        frame.setVisible(true);
    }
    public void initComps(){
        pnl_opciones = new JPanel();
        pnl_opciones.setPreferredSize(new Dimension(250,750));
        pnl_opciones.setBackground(Color.red);
        
        acAl = new accionesCboxAlgoritmos(pnl_memoria);
        acbtn = new accionesBtn(frame,pnl_memoria,null);
        
        algoritmos = new JComboBox(algos);
        algoritmos.setSelectedIndex(0);
        algoritmos.setEditable(false);
        algoritmos.addActionListener(acAl);
        
        start = new JButton("Iniciar");
        start.addActionListener(acbtn);
        
        pnl_opciones.add(algoritmos);
        pnl_opciones.add(start);
        
        frame.add(pnl_opciones, BorderLayout.WEST);
    }
}
