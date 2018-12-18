

public abstract class House implements Sistem {
    public int id, price, area;
    public String location, saleType;


    public abstract void search(String location,int area,int price,String SaleType);
    public abstract void add(String saleType, int price, int area, String location);
    public abstract void sell(int id);

}
