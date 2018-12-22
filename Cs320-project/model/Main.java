import java.util.ArrayList;

public class Main {
    public static void main(String args[]){

        ArrayList<Object> realEstateList = new ArrayList<Object>();

        Apartment ege = new Apartment("For Sale", 600000, 180, "Cekmekoy", "Apartment");

        Villa dede = new Villa("For Sale", 600000, 180, "Cekmekoy", "Villa");

        workplace alp = new workplace("For Rent", 600000, 180, "Cekmekoy", "Workplace");

        Land ahmet= new Land("For Sale", 500000,1000000,"tasdelen", "Land");

        realEstateList.add(ege);
        realEstateList.add(dede);

        realEstateList.add(alp);

        realEstateList.add(ahmet);

        ege.setId(20);
        dede.setId(30);
        alp.setId(40);
        ahmet.setId(50);

        System.out.println("Id Of The ege Apartment: " + ege.getId());

        System.out.println(realEstateList.get(0).toString());

        System.out.println("Id Of The dede villa: " + dede.getId());

        System.out.println(realEstateList.get(1).toString());

        System.out.println("Id Of The alp workplace : " + alp.getId());

        System.out.println(realEstateList.get(0).toString());

        System.out.println("Id Of The ahmet land : " + ahmet.getId());

        System.out.println(realEstateList.get(0).toString());


    }
}
