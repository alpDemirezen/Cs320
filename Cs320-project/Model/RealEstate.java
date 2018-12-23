import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RealEstate {
	
	public static int save(String saleType, int price, int area, String location, String realEstateType){
		int status=0;
		try{
			Connection con=DB.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into estateTbl(saleType,price,area,location,realEstateType) values(?,?,?,?,?)");
			ps.setString(1,saleType);
			ps.setLong(2,price);
			ps.setInt(3,area);
			ps.setString(4,location);
			ps.setString(5,realEstateType);
			status=ps.executeUpdate();
			con.close();
		}
		catch(Exception e){System.out.println(e);
		}
		return status;
	}

	public static void search(String sale_type, String realEstateType){
		int status=0;
		try{
			Connection con=DB.getConnection();
			PreparedStatement ps=con.prepareStatement("select id, saleType, price, area, location, realEstateType FROM estateTbl where saleType = ? AND realEstateType = ?");
			ps.setString(1,sale_type);
			ps.setString(2, realEstateType);
			ResultSet rs = ps.executeQuery();
			
		      while(rs.next()){
		    	  
		          //Retrieve by column name
		          int id  = rs.getInt("id");
		          int price = rs.getInt("price");
		          String saleType = rs.getString("saleType");
		          String area = rs.getString("area");
		          String location = rs.getString("location");

		          //Display values
		          System.out.print("id: " + id);
		          System.out.print(", saleType: " + saleType);
		          System.out.print(", price: " + price);
		          System.out.print(", area: " + area);
		          System.out.println(", location: " + location);
		       }

			
			con.close();
		}
		catch(Exception e){System.out.println(e);
		}
		//return status;
	}
	
	public static int delete(int id){
		int status=0;
		try{
			Connection con=DB.getConnection();
			PreparedStatement ps=con.prepareStatement("delete from estateTbl where id=?");
			ps.setInt(1,id);
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
	
}


