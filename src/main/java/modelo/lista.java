package modelo;

public class lista{
    nodo raiz;
    nodo anterior, posterior;
    public lista(){
        raiz = null;
    }
    
    //Asegura que no haya una particion igual en el sistema.
    nodo buscarParticion(int partitionSize) {
        anterior = null;
        posterior = raiz;
        if (posterior == null) {
            return posterior;
        } else {
            while (posterior != null && posterior.getPartition() < partitionSize) {//Recorre la lista
                anterior = posterior;//Cambio de nodo
                posterior = posterior.getSig();//Cambio de nodo
            }
            if (posterior != null) {
                if (posterior.getPartition() != partitionSize) {
                    posterior = null;
                }
            }
        }
        return posterior;
    }
    
    public boolean insertarParticion(int partitionSize, int x, int y) {
        nodo nuevo;
        nodo resp = buscarParticion(partitionSize);
        if (resp != null){//La particion se encuentra registrada.
            return false;
        }else{
            nuevo = new nodo(partitionSize, null,0,0);
            if (anterior == null) {//La particion debe ser la primera.
                nuevo.setSig(raiz);
                raiz = nuevo;
            } else {//El dato no debe ser el primero
                nuevo.setSig(anterior.getSig());
                anterior.setSig(nuevo);
            }
        }
        return true;
    }
    public boolean primerAjuste(proceso pc) {
        nodo aux = raiz;
        do{
            if(aux.getProcess() == null && aux.getPartition() >= pc.getMemorySize()){
                break;
            }
            aux = aux.getSig();
        }while(aux != null);
        if(aux != null){
            aux.setProcess(pc);
            return true;
        }
        return false;
    }

    public boolean mejorAjuste(proceso proceso) {
        nodo aux = raiz;
        do{
            if(proceso.getMemorySize() <= aux.getPartition() && aux.getProcess() == null){
                break;
            }
            aux = aux.getSig();
        }while(aux.getSig() != null);
        if(aux != null){
            if(aux.getProcess() == null){
                aux.setProcess(proceso);
                return true;
            }
        }
        return false;
    }

    public boolean peorAjuste(proceso proceso) {
        nodo aux=raiz,mayor=null;
        int maxPart = -1;
        do{
            if(aux.getProcess() == null && aux.getPartition() >= proceso.getMemorySize()
                    && (maxPart == -1 || aux.getPartition() > maxPart)){
                mayor = aux;
                maxPart = aux.getPartition();
            }
            aux = aux.getSig();
        }while(aux.getSig() != null);
        
        if(aux.getProcess() == null && aux.getPartition() >= proceso.getMemorySize()
                    && (maxPart == -1 || aux.getPartition() > maxPart)){
                mayor = aux;
                maxPart = aux.getPartition();
        }
        if(mayor != null){
            System.out.println("Node: "+mayor+" Partition: "+maxPart);
            mayor.setProcess(proceso);
            return true;
        }
        return false;
    }

    public nodo eliminar(int partitionSize) {
        nodo resp = buscarParticion(partitionSize);
        if (resp == null)//No hay tal particion
        {
            return null;
        } else {
            nodo aux = posterior;
            if (anterior != null) {
                anterior.setSig(posterior.getSig());
                posterior.setSig(null);
            } else {
                anterior = posterior.getSig();
                raiz = anterior;
            }
            return aux;
        }
    }

    public void limpiarProcesos(){
        nodo aux=raiz;
        do{
            aux.setProcess(null);
            aux = aux.getSig();
        }while(aux != null);
    }
    
    public void imprimirLista() {
        nodo aux = raiz;
        do {
            System.out.println("Actual: [" + aux + "] Valor: ["+ aux.getPartition() + "] Siguiente: [" + aux.getSig() + "]");
            aux = aux.getSig();
        } while (aux.getSig() != null);
        System.out.println("Actual: [" + aux + "] Valor: ["+ aux.getPartition() + "] Siguiente: [" + aux.getSig() + "]");
    }
    public void imprimirProcesos(){
        nodo aux = raiz;
        do{
            if(aux.getProcess() != null)
                System.out.println("Memory ["+aux.getPartition()+"] Process ["+aux.getProcess().getProcessName()+"] Memory ["+aux.getProcess().getMemorySize()+"]");
            else
                System.out.println("Memory ["+aux.getPartition()+"] Process ["+null+"] Memory ["+null+"]");
            aux = aux.getSig();
        }while(aux.getSig() != null);
        if(aux.getProcess() != null)
                System.out.println("Memory ["+aux.getPartition()+"] Process ["+aux.getProcess().getProcessName()+"] Memory ["+aux.getProcess().getMemorySize()+"]");
            else
                System.out.println("Memory ["+aux.getPartition()+"] Process ["+null+"] Memory ["+null+"]");
    }
}
