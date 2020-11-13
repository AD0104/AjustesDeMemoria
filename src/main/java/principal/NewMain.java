package principal;

import modelo.creadorProcesos;
import modelo.lista;
import modelo.proceso;

public class NewMain {
    public static void main(String[] args) {
        lista l = new lista();
        creadorProcesos cp = new creadorProcesos();
        l.insertarParticion(50);
        l.insertarParticion(150);
        l.insertarParticion(350);
        l.insertarParticion(450);
        l.insertarParticion(250);
        l.insertarParticion(1500);
        l.insertarParticion(300);
//        l.insertarParticion(500);
        l.imprimirLista();
        
        System.out.println("");
        
        proceso pc = cp.crearProceso();
        System.out.println(pc.getMemorySize());
        if(l.peorAjuste(pc))
            System.out.println("correcto");
        else
            System.out.println("incorrecto");
        l.imprimirProcesos();
        
//        if(l.primerAjuste(pc))
//        if(l.mejorAjuste(pc))
        pc = cp.crearProceso();
        System.out.println(pc.getMemorySize());
        if(l.peorAjuste(pc))
            System.out.println("Correcto");
        else
            System.out.println("incorrecto");
        System.out.println("");
//        l.imprimirLista();
        l.imprimirProcesos();
       
        pc = cp.crearProceso();
        System.out.println(pc.getMemorySize());
//        if(l.primerAjuste(pc))
//        if(l.mejorAjuste(pc))
        if(l.peorAjuste(pc))
            System.out.println("Correcto");
        else
            System.out.println("incorrecto");
        System.out.println("");
//        l.imprimirLista();
        l.imprimirProcesos();

        pc = cp.crearProceso();
        System.out.println(pc.getMemorySize());
//        if(l.primerAjuste(pc))
//        if(l.mejorAjuste(pc))
        if(l.peorAjuste(pc))
            System.out.println("Correcto");
        else
            System.out.println("incorrecto");
        System.out.println("");
//        l.imprimirLista();
        l.imprimirProcesos();
        
        pc = cp.crearProceso();
        System.out.println(pc.getMemorySize());
//        if(l.primerAjuste(pc))
//        if(l.mejorAjuste(pc))
        if(l.peorAjuste(pc))
            System.out.println("Correcto");
        else
            System.out.println("incorrecto");
        System.out.println("");
//        l.imprimirLista();
        l.imprimirProcesos();    
    }    
}
