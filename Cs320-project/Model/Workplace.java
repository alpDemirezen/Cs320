public class workplace implements Sistem {

    public int id, price, area;
    public String saleType, realEstateType, location;


    public workplace(String saleType, int price, int area, String location, String realEstateType) {
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

    public String getSaleType() {
        return saleType;
    }

    public void setSaleType(String saleType) {
        this.saleType = saleType;
    }


    public void setId(int Id) {
        this.id = Id;
    }


    public int getId() {
        this.id = id;
        return id;
    }

    public String getType() {
        return realEstateType;
    }


    @Override
    public void search(String saleType, String realEstateType) {
        RealEstate.search(saleType, realEstateType);
    }

    @Override
    public void add(String saleType, int price, int area, String location, String realEstateType) {
        RealEstate.save(saleType, price, area, location, realEstateType);
    }

    @Override
    public void sell(int id) {
        RealEstate.delete(id);
    }

    public String toString() {
        return ("Sale Type Of The workplace: " + this.saleType + "\n" + "Price Of The workplace: " + this.price +
                "\n" + "Area Of The workplace: " + this.area + "\n" + "Location Of The workplace " + this.location + "\n");
    }

}

