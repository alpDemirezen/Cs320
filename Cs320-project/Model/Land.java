public class Land implements Sistem {

    public int price, area, id;
    public String location, realEstateType, saleType;


    public Land(String saleType, int price, int area, String location, String realEstateType) {
        this.saleType = saleType;
        this.price = price;
        this.area = area;
        this.location = location;
        this.realEstateType = realEstateType;
        add(saleType,price,area,location,realEstateType);
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public int getId() {
        return id;
    }

    public void setId(int Id) {
        this.id = Id;
    }


    @Override
    public void search(String saleType, String realEstateType) {
        RealEstate.search(saleType, realEstateType);
    }

    @Override
    public void add(String saleType, int price, int area, String location, String realEstateType) {
        RealEstate.save(saleType,price,area,location,realEstateType);
    }

    @Override
    public void sell(int id) {
        RealEstate.delete(id);
    }

    public String getType() {
        return realEstateType;
    }

    public String toString() {
        return ("Price Of The Land: " + this.price +
                "\n" + "Area Of The Land: " + this.area + "\n" + "Location Of The Land " + this.location + "\n");
    }
}
