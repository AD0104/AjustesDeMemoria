package modelo;
public class nodo{
    int partitionSize;
    nodo sig;
    proceso proceso;
    public nodo(int partitionSize, proceso proceso, int x, int y){
        this.partitionSize = partitionSize;
        this.proceso = proceso;
    }
    public void setSig(nodo sig){this.sig = sig;}
    public nodo getSig(){return this.sig;}

    public int getPartition(){return this.partitionSize;}
    public void setProcess(proceso process){this.proceso = process;}
    public proceso getProcess(){return this.proceso;}
}
