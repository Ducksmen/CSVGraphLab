public class InfantData
{
    private String race;
    private double imr;
    private double nmr;
    private double pnmr;
    private int id;
    private int nid;
    private int pnid;
    private int livebirths;
    private int year;
    public InfantData(String a,double b,double c, double d, int e, int f,int g, int h, int i)
    {
        race =a;
        imr =b;
        nmr =c;
        pnmr =d;
        id =e;
        nid =f;
        pnid =g;
        livebirths=h;
        year =i;
    }

    public String getRace()
    {
        return race;
    }

    public void setRace(String race)
    {
        this.race = race;
    }

    public double getImr()
    {
        return imr;
    }

    public void setImr(double imr)
    {
        this.imr = imr;
    }

    public double getNmr()
    {
        return nmr;
    }

    public void setNmr(double nmr)
    {
        this.nmr = nmr;
    }

    public double getPnmr()
    {
        return pnmr;
    }

    public void setPnmr(double pnmr)
    {
        this.pnmr = pnmr;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public int getNid()
    {
        return nid;
    }

    public void set(int nid)
    {
        this.nid = nid;
    }

    public int getPnid()
    {
        return pnid;
    }

    public void setPnid(int pnid)
    {
        this.pnid = pnid;
    }

    public int getLivebirths()
    {
        return livebirths;
    }

    public void setLivebirths(int livebirths)
    {
        this.livebirths = livebirths;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public String toString()
    {
        return  year + ", race =" + race + ", imr=" + imr + ", nmr=" + nmr + ", pnmr=" + pnmr + ", id=" + id + ", nid=" + nid + ", pnid=" + pnid + ", livebirths=" + livebirths;
    }
}
