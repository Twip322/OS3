public class PHList {
    private String data;
    private Boolean free=true;
    private int size;

    public PHList(Integer pageSIZE)
    {
        data="";
        size=pageSIZE;
    }

    public String getData()
    {
        return data;
    }

    public void setData(String data)
    {
        this.data=data;
    }

    public Boolean getFree() {
        return free;
    }

    public void setFree(Boolean free)
    {
        this.free=free;
    }
}
