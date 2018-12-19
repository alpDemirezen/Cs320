import java.util.ArrayList;

public class Main {
    public static void main(String args[]){

        ArrayList<House> houses = new ArrayList<>();

        // House ege = new Apartment demek yerine Apartment ege = new Apartment diye tanımlamak lazım ki
        // House classının icinde olmayan Villa ve Apartmenta ozel methodları kullanabilelim... (egowic)
        Apartment ege = new Apartment("For Sale", 600000, 180, "Cekmekoy");

        houses.add(ege);

        // Örnek id ataması (id unique olarak tanımlayacagı icin set methodu ileride kullanmak ve silme islemi icin gerekli olabilir (egowic)
        ege.setId(20);

        houses.get(0).printHouse();

    }
}
