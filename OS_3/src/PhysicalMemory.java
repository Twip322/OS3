import java.util.ArrayList;

public class PhysicalMemory {

    private ArrayList<PHList> arrayList=new ArrayList<PHList>();

    /**
     * PhysicalMemory создаёт объект физической памяти.
     * @param RAM Объём памяти
     * @param pageSIZE размер страниц.
     */
    public PhysicalMemory(Integer RAM, Integer pageSIZE) {
        for(Integer i=0;i<RAM/pageSIZE;i++)
        {
            arrayList.add(new PHList(pageSIZE));
        }
    }

    public PHList getPHPage(Integer pageNum) {
        return arrayList.get(pageNum);
    }

    public ArrayList<PHList> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<PHList> arrayList) {
        this.arrayList=arrayList;
    }

    public  PHList getFreePage() {
        for(PHList phlist:arrayList)
        {
            if(phlist.getFree())
            {
                return phlist;
            }
        }
        return null;
    }


}
