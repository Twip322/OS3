public class VirtualMemory {
    PHList phList;
    Boolean inwork=true;

    public VirtualMemory(PHList phList)
    {
        this.phList=phList;
    }

    public PHList getPhList()
    {
        return phList;
    }

    public void setPhList(PHList phList) {
        this.phList = phList;
    }

    public Boolean getInwork()
    {
        return inwork;
    }

    public void setInwork(Boolean inwork)
    {
        this.inwork=inwork;
    }
}
