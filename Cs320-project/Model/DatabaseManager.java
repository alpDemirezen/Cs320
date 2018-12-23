import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.Reader;


public class DatabaseManager {
	
/*	public static void createDatabase(){
		try{
			Connection con=DB.getConnection();
			
			Statement stmt = con.createStatement();
			
			String sql ="DROP SCHEMA IF EXISTS estatedb";;
			stmt.executeUpdate(sql);
			
			sql ="CREATE DATABASE estatedb";
			stmt.executeUpdate(sql);
			

			con.close();
		}
		catch(Exception e){System.out.println(e);
		}
	}
	

	public static void createTable(){
		try{
			Connection con=DB.getConnection();
			
			 String myTableName = "CREATE TABLE estatetbl (" 
			            + "id INT(6) NOT NULL AUTO_INCREMENT,"  
			            + "saleType VARCHAR(16) NOT NULL," 
			            + "price int(7) NOT NULL,"
			            + "area int(5) NOT NULL,"
			            + "lacation VARCHAR(64) NOT NULL,"
			            + "realEstateType VARCHAR(16)),"
			            + "PRIMARY KEY (id)"; 
			 
				Statement stmt = con.createStatement();

				stmt.executeUpdate(myTableName);
			con.close();
		}
		catch(Exception e){System.out.println(e);
		}
	}
	
	*/
    public static void parseDataFrom(String fileName) {
        try {
        	
        	System.out.println ( fileName);
    		JSONParser parser = new JSONParser();
    		Reader reader = new FileReader(fileName);

    		Object jsonObj = parser.parse(reader);
    		JSONObject jsonObject = (JSONObject) jsonObj;
    		

    		String sale, location;
    		long area, price;
    		JSONObject jsonobject1;
    		
    		//---------APARTMENT---------------
    		
    		JSONArray arr = (JSONArray) jsonObject.get("apartment");
 //   		System.out.println("apartment = " +  arr.get(0) );
 //   		System.out.println("apartment = " +  arr.get(1) );
    		
    		for (int i = 0; i < arr.size(); i++) {
    			jsonobject1 = (JSONObject) arr.get(i);
    			
    			sale = (String)jsonobject1.get("saleType");
    			price = (long)jsonobject1.get("price");
    			area = (long)jsonobject1.get("area");	
    			location = (String)jsonobject1.get("location");
    			
    	    	RealEstate.save(sale, price, area, location, "Apartment");
    		}
    		
    		//---------VILLA---------------
    		arr = (JSONArray) jsonObject.get("villa"); 		   		  		
    		for (int i = 0; i < arr.size(); i++) {
    			jsonobject1 = (JSONObject) arr.get(i);	
    			
    			sale = (String)jsonobject1.get("saleType");
    			price = (long)jsonobject1.get("price");
    			area = (long)jsonobject1.get("area");			
    			location = (String)jsonobject1.get("location");
    			
    	    	RealEstate.save(sale, price, area, location, "villa");
    		}
    		
    		//---------LAND---------------    		
       		arr = (JSONArray) jsonObject.get("land");
    		
    		for (int i = 0; i < arr.size(); i++) {
    			jsonobject1 = (JSONObject) arr.get(i);	
    			
    			sale = (String)jsonobject1.get("saleType");
    			price = (long)jsonobject1.get("price");
    			area = (long)jsonobject1.get("area");			
    			location = (String)jsonobject1.get("location");
    			
    	    	RealEstate.save(sale, price, area, location, "land");
    		}
    		
    		//---------LAND---------------    		
       		arr = (JSONArray) jsonObject.get("workplace");
   		
    		for (int i = 0; i < arr.size(); i++) {
    			jsonobject1 = (JSONObject) arr.get(i);	
    			
    			sale = (String)jsonobject1.get("saleType");
    			price = (long)jsonobject1.get("price");
    			area = (long)jsonobject1.get("area");			
    			location = (String)jsonobject1.get("location");
    			
    	    	RealEstate.save(sale, price, area, location, "workplace");
    		}
    		
     		reader.close();
    		

        } catch (Exception e) {
            System.err.println("Problem occurred while parsing " + fileName + ":");
            System.err.println(e.getMessage());
            e.printStackTrace();
            //return null;
        }
    }

}
