public abstract class House implements Sistem {
    public int id, price, area;
    public String location, saleType, realEstateType;

    public abstract void search(String saleType, int price, int area, String location, String realEstateType);
    public abstract void add(String saleType, int price, int area, String location, String realEstateType);
    public abstract void sell(int id);
    public abstract void printHouse();
}
