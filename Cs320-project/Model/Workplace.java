public class Workplace implements Sistem{

    public int id, price, area;
    public String saleType, realEstateType, location;


    public Workplace(String saleType, int price, int area, String location, String realEstateType) {
        this.saleType = saleType;
        this.price = price;
        this.area = area;
        this.location = location;
        this.realEstateType = realEstateType;
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
    public void search(String saleType, int price, int area, String location, String realEstateType) {

    }

    @Override
    public void add(String saleType, int price, int area, String location, String realEstateType) {

    }

    @Override
    public void sell(int id) {

    }

    public String toString() {
        return ("Sale Type Of The Workplace: " + this.saleType + "\n" + "Price Of The Workplace: " + this.price +
                "\n" + "Area Of The Workplace: " + this.area + "\n" + "Location Of The Workplace " + this.location + "\n");
    }

}

