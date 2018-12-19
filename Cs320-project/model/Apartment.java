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

    // Set Id method added (egowic)
    public void setId(int Id) {
        this.id = Id;
    }

    // printHouse Method added (egowic)
    public void printHouse(){
        System.out.println("Sale Type Of The Apartment: " + this.saleType + "\n" + "Price Of The Apartment: " + this.price +
                "\n" + "Area Of The Apartment: " + this.area + "\n" + "Location Of The Apartment " + this.location + "\n");
    }

}
