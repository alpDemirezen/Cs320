import java.util.ArrayList;

public abstract class House implements System {
    public int id, price, area;
    public String location, saleType;

    public ArrayList<House> houses = new ArrayList<House>();

    public abstract void search(String location,int area,int price,String SaleType);

    public abstract void add(String saleType, int price, int area, String location);

    public abstract void sell(int id);

}
