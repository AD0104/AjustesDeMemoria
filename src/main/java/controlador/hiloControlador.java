package controlador;

import java.util.ArrayList;
import modelo.creadorProcesos;
import modelo.lista;
import modelo.proceso;
import vista.Panel;

public class hiloControlador extends Thread{
    ArrayList<proceso> listaProcesosNuevos;
    ArrayList<proceso> listaProcesosAsignados;
    ArrayList<proceso> listaProcesosSinCabida;
    creadorProcesos cp;
    lista l;
    Panel pnl;
    //Coordenadas donde deben mostrarse los procesos nuevos
    final int x=250,y=300;
    public hiloControlador(lista l, Panel pnl){
        listaProcesosNuevos = new ArrayList<proceso>();
        listaProcesosAsignados = new ArrayList<proceso>();
        listaProcesosSinCabida = new ArrayList<proceso>();
        cp = new creadorProcesos();
        this.pnl = pnl;
        this.l = l;
    }
    public void run(){
        Thread ct = Thread.currentThread();
        while(this == ct){
            proceso nuevo = cp.crearProceso();
//            new dibujarProcesoNuevo().dibujar(pnl.getGraphics(), x, y);
            listaProcesosNuevos.add(nuevo);
            if(l.primerAjuste(nuevo)){
                listaProcesosAsignados.add(nuevo);
                listaProcesosNuevos.remove(nuevo);
            }else{
                listaProcesosSinCabida.add(nuevo);
                listaProcesosNuevos.remove(nuevo);
            }
            try{
                sleep(25);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
