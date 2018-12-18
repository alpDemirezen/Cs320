import java.util.ArrayList;

public class Main {
    public static void main(String args[]){
        ArrayList<House> houses = new ArrayList<>();
        House ege = new Apartment("kiralık", 10, 30, "cekmekoy");

        houses.add(ege);
        for(int i = 0; i< houses.size();i++) {
            System.out.println(houses.get(i).saleType + " " + houses.get(i).price + " "+ houses.get(i).area + " "+ houses.get(i).location + " " );
        }




    }
}
