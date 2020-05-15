import java.util.ArrayList;
import java.util.Random;

public class MemoryManager {
    PhysicalMemory PhysicalMemory;
    ArrayList<VirtualMemory> virtual_memories=new ArrayList<VirtualMemory>();
    ArrayList<PHList> phLists=new ArrayList<PHList>();
    Random random=new Random();


    public MemoryManager(PhysicalMemory PhysicalMemory)
    {
        this.PhysicalMemory = PhysicalMemory;
        PHList temp= PhysicalMemory.getFreePage();
        while(temp!=null)
        {
            virtual_memories.add(new VirtualMemory(temp));
            temp.setFree(false);
            temp= PhysicalMemory.getFreePage();
        }
    }

    public void work() {
        int runtime=0;
        while (runtime==3000)
        {
            for (PHList phList : phLists) {
                phList.setFree(random.nextBoolean());
            }
            for (VirtualMemory virtual_memory : virtual_memories) {
                if (virtual_memory.getInwork()) {
                    virtual_memory.setInwork(false);
                } else {
                    outLoad(virtual_memory);
                }
            }
            runtime++;
        }
    }
    private void outLoad(VirtualMemory virtual_memory)
    {
        phLists.add(virtual_memory.getPhList());
        virtual_memory.getPhList().setFree(true);
        virtual_memories.remove(virtual_memory);
    }
}
