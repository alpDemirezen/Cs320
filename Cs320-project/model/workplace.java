public class workplace implements Sistem{



    private int id;
    private String saleType;
    private int price;
    private int area;
    private String location;


    public workplace(String saleType, int price, int area, String location) {
        this.saleType = saleType;
        this.price = price;
        this.area = area;
        this.location = location;
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


    @Override
    public void search(String saleType, int price, int area, String location) {

    }

    @Override
    public void add(String saleType, int price, int area, String location) {

    }

    @Override
    public void sell(int id) {

    }


    public void printworkplace(){
        System.out.println("Sale Type Of The workplace: " + this.saleType + "\n" + "Price Of The workplace: " + this.price +
                "\n" + "Area Of The workplace: " + this.area + "\n" + "Location Of The workplace " + this.location + "\n");
    }


}

