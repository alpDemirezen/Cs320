import java.util.ArrayList;

public class Main {
    public static void main(String args[]){

        ArrayList<House> houses = new ArrayList<House>();
        ArrayList<Workplace> workplaces = new ArrayList<Workplace>();
        ArrayList<Land> lands = new ArrayList<Land>();

        Apartment ege = new Apartment("For Sale", 600000, 180, "Cekmekoy", "Apartment");

        Villa dede = new Villa("For Sale", 600000, 180, "Cekmekoy", "Villa");

        Workplace alp = new Workplace("For Rent", 600000, 180, "Cekmekoy", "Workplace");

        Land ahmet= new Land("For Sale", 500000,1000000,"tasdelen", "Land");

        houses.add(ege);
        houses.add(dede);
        workplaces.add(alp);
        lands.add(ahmet);

        ege.setId(20);
        dede.setId(30);
        alp.setId(40);
        ahmet.setId(50);

        // Search for House type, example is to find dede's id...
        String saleType1 = "for sale";
        int price1 = 600000;
        int area1 = 180;
        String location1 = "Cekmekoy";
        String realEstateType1 = "Villa";
        for(int i = 0; i < houses.size(); i++) {
            if(houses.get(i).saleType.equalsIgnoreCase(saleType1) && houses.get(i).price == price1 &&
                    houses.get(i).area == area1 && houses.get(i).location.equalsIgnoreCase(location1) &&
                    houses.get(i).realEstateType.equalsIgnoreCase(realEstateType1)) {
                System.out.println("----------------- " + houses.get(i).id + " ----------------------");
            }
        }

        // Search for Land type, example is to find ahmet's id...
        String saleType2 = "for sale";
        int price2 = 500000;
        int area2 = 1000000;
        String location2 = "tasdelen";
        String realEstateType2 = "Land";
        for(int i = 0; i < lands.size(); i++) {
            if(lands.get(i).saleType.equalsIgnoreCase(saleType2) && lands.get(i).price == price2 &&
                    lands.get(i).area == area2 && lands.get(i).location.equalsIgnoreCase(location2) &&
                    lands.get(i).realEstateType.equalsIgnoreCase(realEstateType2)) {
                System.out.println("----------------- " + lands.get(i).id + " ----------------------");
            }
        }

        // Search for Workplace type, example is to find alp's id...
        String saleType3 = "for rent";
        int price3 = 600000;
        int area3 = 180;
        String location3 = "cekmekoy";
        String realEstateType3 = "Workplace";
        for(int i = 0; i < lands.size(); i++) {
            if(workplaces.get(i).saleType.equalsIgnoreCase(saleType3) && workplaces.get(i).price == price3 &&
                    workplaces.get(i).area == area3 && workplaces.get(i).location.equalsIgnoreCase(location3) &&
                    workplaces.get(i).realEstateType.equalsIgnoreCase(realEstateType3)) {
                System.out.println("----------------- " + workplaces.get(i).id + " ----------------------");
            }
        }

        // Sell Operation, example is to delete Alp...
        int idToSell = 40;
        for(int i = 0; i < workplaces.size(); i++) {
            if(workplaces.get(i).id == idToSell) {
                workplaces.remove(i);
            }
        }


        System.out.println("Id Of The ege Apartment: " + ege.getId());

        System.out.println(houses.get(0).toString());

        System.out.println("Id Of The dede villa: " + dede.getId());

        System.out.println(houses.get(1).toString());

        System.out.println("Id Of The ahmet land : " + ahmet.getId());

        System.out.println(lands.get(0).toString());


    }
}
