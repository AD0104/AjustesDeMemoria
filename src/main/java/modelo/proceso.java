package modelo;
public class proceso{
        String processName;
        int memorySize;
        public proceso(String name, int partitionSize){
            this.processName = name;
            this.memorySize = partitionSize;
        }
        public void setProcessName(String name){this.processName = name;}
        public String getProcessName(){return this.processName;}
        public void setMemorySize(int memorySize){this.memorySize = memorySize;}
        public int getMemorySize(){return this.memorySize;}
}
