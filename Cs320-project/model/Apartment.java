public class Apartment extends House {

    public Apartment(String saleType, int price, int area, String location) {
        super.saleType = saleType;
        super.price = price;
        super.area = area;
        super.location = location;
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

    public String getSaleType(){
        this.saleType = saleType;

        return saleType;
    }

    public int getPrice(){
        this.price = price;

        return price;
    }

    public int getArea(){
        this.area = area;

        return area;
    }

    public String getLocation(){
        this.location = location;

        return location;
    }

}
