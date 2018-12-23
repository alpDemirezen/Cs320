public class Apartment extends House {

    public Apartment(String saleType, int price, int area, String location, String realEstateType) {
        super.saleType = saleType;
        super.price = price;
        super.area = area;
        super.location = location;
        super.realEstateType = realEstateType;
        add(saleType,price,area,location,realEstateType);
    }

    public void add(String saleType, int price, int area, String location, String realEstateType) {
        RealEstate.save(saleType, price, area, location, realEstateType);
    }

    public void search(String saleType, String realEstateType) {
        RealEstate.search(saleType, realEstateType);
    }


    public void sell(int id) {
        RealEstate.delete(id);
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

    public String toString() {
        return ("Sale Type Of The Apartment: " + this.saleType + "\n" + "Price Of The Apartment: " + this.price +
                "\n" + "Area Of The Apartment: " + this.area + "\n" + "Location Of The Apartment " + this.location + "\n");
    }

}
