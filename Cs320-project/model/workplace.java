public class workplace {

    private int id;
    private int area;
    private String location;
    private int price;
    private String saleType;

    public workplace(int id, int area, String location, int price, String saleType) {
        this.id = id;
        this.area = area;
        this.location = location;
        this.price = price;
        this.saleType = saleType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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


    public void search(int id,String location , int price , int area){

    }
    public void add(int id,String location , int price , int area){

    }
    public void sell(int id,String location , int price , int area){

    }



}

