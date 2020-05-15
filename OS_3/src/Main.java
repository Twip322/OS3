import java.lang.management.ManagementFactory;

public class Main {
    public static void main(String[] args)
    {
        Integer RAM=1024;
        Integer pageSIZE=128;
        PhysicalMemory physicalMemory=new PhysicalMemory(RAM,pageSIZE);
        MemoryManager memoryManager=new MemoryManager(physicalMemory);
        memoryManager.work();
    }
}
