

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

    // Set Id method added (egowic)
    public void setId(int Id) {
        this.id = Id;
    }

    // printHouse Method added (egowic)
    public void printHouse(){
        System.out.println("Sale Type Of The Villa: " + this.saleType + "\n" + "Price Of The Villa: " + this.price +
                "\n" + "Area Of The Villa: " + this.area + "\n" + "Location Of The Villa " + this.location +
                "\n" + "Number Of Floors Of The Villa " + numFloors + "\n");
    }
}
