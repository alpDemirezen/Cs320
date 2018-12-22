import java.util.ArrayList;

public class Main {
    public static void main(String args[]){

        ArrayList<House> houses = new ArrayList<>();
        ArrayList<workplace> workplaces = new ArrayList<>();
        ArrayList<Land> lands = new ArrayList<>();

        Apartment ege = new Apartment("For Sale", 600000, 180, "Cekmekoy", "Apartment");

        Villa dede = new Villa("For Sale", 600000, 180, "Cekmekoy", "Villa");

        workplace alp = new workplace("For Rent", 600000, 180, "Cekmekoy", "Workplace");

        Land ahmet= new Land("For Sale", 500000,1000000,"tasdelen", "Land");

        houses.add(ege);
        houses.add(dede);

        workplaces.add(alp);

        lands.add(ahmet);

        ege.setId(20);
        dede.setId(30);
        alp.setId(40);
        ahmet.setId(50);

        System.out.println("Id Of The ege Apartment: " + ege.getId());

        houses.get(0).printHouse();

        System.out.println("Id Of The dede villa: " + dede.getId());

        houses.get(1).printHouse();

        System.out.println("Id Of The alp workplace : " + alp.getId());

        workplaces.get(0).printworkplace();

        System.out.println("Id Of The ahmet land : " + ahmet.getId());

        lands.get(0).printLand();





    }
}
