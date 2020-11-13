package modelo;

public class creadorProcesos extends Thread{
    public proceso crearProceso(){
        String[] names = {"System","cmd.exe","svchost.exe","mysqld.exe","postgres.exe","steam.exe"};
        int randomIdx = (int)(Math.random()*names.length);
        String processName=names[randomIdx]; 
        int memorySize=(int)(Math.random()*1800);

        proceso pc = new proceso(processName,memorySize);

        return pc;
    }
}
