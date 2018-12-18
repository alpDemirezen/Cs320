public class Villa extends House {

    private int numFloors;

    public Villa(String saleType, int price, int area, String location) {
        super.saleType = saleType;
        super.price = price;
        super.area = area;
        super.location = location;
    }

    public void add(String saleType,int price,int area,String location) {
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

    public void sell(int id) {
        this.id = id;
    }

    public void setNumFloors(int numFloors) {
        this.numFloors = numFloors;
    }

}
