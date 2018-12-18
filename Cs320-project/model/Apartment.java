public class Apartment extends House {

    public Apartment() {

    }

    public void add(String saleType, int price, int area, String location) {
        super.saleType = saleType;
        super.price = price;
        super.area=area;
        super.location = location;

    }

    public void search(String saleType,int price,int area,String location) {
        super.saleType = saleType;
        super.price = price;
        super.area=area;
        super.location = location;
    }

    public  void sell(int id) {
        super.id = id;
    }
}
