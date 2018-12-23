public class Test {
    public static void main(String args[]){
    	    	
    	int i = 0;
    	
    	i=RealEstate.save("For Sale", 350000, 180, "Kartal", "Apartment");
    	
    	if ( i!= 0)
    		System.out.println("successfully added");	
    	
    	i=RealEstate.save("For Sale", 410000, 240, "Kartal", "Apartment");
    	if ( i!= 0)
    		System.out.println("successfully added");	
    	
    	i=RealEstate.delete(6);
    	if ( i!= 0)
    		System.out.println("successfully deleted");	

    	
    	RealEstate.search("For Rent");
	

    }
}
