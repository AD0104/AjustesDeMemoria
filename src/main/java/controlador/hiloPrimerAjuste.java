package controlador;

import java.util.ArrayList;
import modelo.creadorProcesos;
import modelo.lista;
import modelo.proceso;
import vista.Panel;

public class hiloPrimerAjuste extends Thread{
    ArrayList<proceso> listaProcesosNuevos;
    ArrayList<proceso> listaProcesosAsignados;
    ArrayList<proceso> listaProcesosSinCabida;
    creadorProcesos cp;
    lista l;
    Panel pnl;
    //Coordenadas donde deben mostrarse los procesos nuevos
    final int x=250,y=300;
    int lSize;
    public hiloPrimerAjuste(lista l, Panel pnl, int lSize){
        listaProcesosNuevos = new ArrayList<proceso>();
        listaProcesosAsignados = new ArrayList<proceso>();
        listaProcesosSinCabida = new ArrayList<proceso>();
        cp = new creadorProcesos();
        this.pnl = pnl;
        this.l = l;
        this.lSize = lSize;
    }
    public void run(){
        for(int i=0; i<lSize; i++){
            proceso nuevo = cp.crearProceso();
//            new dibujarProcesoNuevo().dibujar(pnl.getGraphics(), x, y);
            listaProcesosNuevos.add(nuevo);
            if(l.primerAjuste(nuevo)){
                listaProcesosAsignados.add(nuevo);
                listaProcesosNuevos.remove(nuevo);
                l.imprimirProcesos();
            }else{
                listaProcesosSinCabida.add(nuevo);
                listaProcesosNuevos.remove(nuevo);
                l.imprimirProcesos();
            }
            mostrarAsignados();
            mostrarSinCabida();
            try{
                sleep(25);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
    public void mostrarAsignados(){
        System.out.println("\n<<Asignados>>");
        for (int i = 0; i < listaProcesosAsignados.size(); i++) {
            System.out.println("Proceso: "+listaProcesosAsignados.get(i).getProcessName()+" Memoria: "+listaProcesosAsignados.get(i).getMemorySize());
        }
        System.out.println("<<-->>\n");
    }
    public void mostrarSinCabida(){
        System.out.println("\n<<Sin cabida>>");
        for(int i=0; i<listaProcesosSinCabida.size(); i++){
            System.out.println("Proceso: "+listaProcesosSinCabida.get(i).getProcessName()+" Memoria: "+listaProcesosSinCabida.get(i).getMemorySize());
        }
        System.out.println("<<-->>\n");
    }
}
