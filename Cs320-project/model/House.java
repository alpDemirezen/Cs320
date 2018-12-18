public abstract class House implements System {
    public int id, price, area;
    public String location, saleType;

    public abstract void search(String location,int area,int price,String SaleType);

    public abstract void add();

    public abstract void sell();

}
