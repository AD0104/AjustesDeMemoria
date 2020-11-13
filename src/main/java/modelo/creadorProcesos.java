package modelo;

import java.util.ArrayList;

public class creadorProcesos extends Thread{
    public ArrayList<proceso> listaProcesos;
    public creadorProcesos(){
        listaProcesos = new ArrayList<proceso>();
    }
    public proceso crearProceso(){
        String[] names = {"System","cmd.exe","svchost.exe","mysqld.exe","postgres.exe","steam.exe"};
        
        int randomIdx = (int)(Math.random()*names.length);
        String processName=names[randomIdx]; 
        
        int memorySize=(int)(Math.random()*450);

        proceso pc = new proceso(processName,memorySize);
        pc.setProcessName(processName);
        pc.setMemorySize(memorySize);

        listaProcesos.add(pc);

        return pc;
    }
}
