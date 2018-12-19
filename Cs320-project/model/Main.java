import java.util.ArrayList;

public class Main {
    public static void main(String args[]){

        ArrayList<House> houses = new ArrayList<>();
        ArrayList<workplace> workplaces = new ArrayList<>();
        ArrayList<Land> lands = new ArrayList<>();


        // House ege = new Apartment demek yerine Apartment ege = new Apartment diye tanımlamak lazım ki
        // House classının icinde olmayan Villa ve Apartmenta ozel methodları kullanabilelim... (egowic)
        Apartment ege = new Apartment("For Sale", 600000, 180, "Cekmekoy");
        Villa dede = new Villa("For Sale", 600000, 180, "Cekmekoy");

        workplace alp = new workplace("For Sale", 600000, 180, "Cekmekoy");

        Land ahmet= new Land(500000,1000000,"tasdelen");


        houses.add(ege);
        houses.add(dede);

        workplaces.add(alp);

        lands.add(ahmet);





        // Örnek id ataması (id unique olarak tanımlayacagı icin set methodu ileride kullanmak ve silme islemi icin gerekli olabilir (egowic)
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
