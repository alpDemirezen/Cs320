public class Test {
	
	
    public static void main(String args[]){


    	//DatabaseManager dbman = new DatabaseManager();

    	//insert elements (estates.json tablosunda okuduklarını insert eder
    	//dbman.parseDataFrom("estates.json");

   	
    	int i = 0;
//    	i=RealEstate.save("for sale", 350000, 180, "Kartal", "Apartment");
    	
    	
    	//delete

			//i=RealEstate.delete(6);

		RealEstate.search("For Sale", "Apartment");
    	if ( i!= 0)
    		System.out.println("successfully deleted");	
    	
/*    	i=RealEstate.update(7, "rental", 120);
    	if ( i!= 0)
    		System.out.println("successfully updated");	   	
<<<<<<< HEAD
 */
    }
}
