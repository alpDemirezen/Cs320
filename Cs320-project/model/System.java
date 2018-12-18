import java.util.ArrayList;

public interface System {
    public ArrayList<House> houses = new ArrayList<House>();
    public void search(String saleType,int price,int area,String location);
    public void add(String saleType,int price,int area,String location);
    public void sell(int id);
}
