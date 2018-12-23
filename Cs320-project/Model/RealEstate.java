import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class RealEstate {
    public static ArrayList<Apartment> arrApart = new ArrayList<>();
	public static ArrayList<Villa> arrVilla = new ArrayList<>();
	public static ArrayList<Land> arrLand = new ArrayList<>();
	public static ArrayList<Workplace> arrWorkplace = new ArrayList<>();

    public static int save(String saleType, long price, long area, String location, String realEstateType){
		int status=0;
		try{
			Connection con=DB.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into estateTbl(saleType,price,area,location,realEstateType) values(?,?,?,?,?)");
			ps.setString(1,saleType);
			ps.setLong(2,price);		//int long yapıldı
			ps.setLong(3,area);
			ps.setString(4,location);
			ps.setString(5,realEstateType);
			status=ps.executeUpdate();
			con.close();
		}
		catch(Exception e){System.out.println(e);
		}
		return status;
	}


/*	
	public static int update(int id, String saleType, int price){
		int status=0;
		try{
			Connection con=DB.getConnection();
			PreparedStatement ps=con.prepareStatement("update estateTbl set saleType = ?, price = ? where id = ?");
			ps.setLong(3,id);			//int long yapıldı
			ps.setString(1,saleType);
			ps.setLong(2,price);
			status=ps.executeUpdate();
			con.close();
		}
		catch(Exception e){System.out.println(e);
		}
		return status;
	}
*/
	public static void search(String sale_type , String realEstateType){
		int status=0;
		try{
			Connection con=DB.getConnection();
			PreparedStatement ps=con.prepareStatement("select id, saleType, price, area, location, realEstateType FROM estateTbl where saleType = ? AND realEstateType =?");
			ps.setString(1,sale_type);
			ResultSet rs = ps.executeQuery();
			
		      while(rs.next()){
		    	  
		          //Retrieve by column name
		          int id  = rs.getInt("id");
		          long price = rs.getInt("price");			//int long yapıldı
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

    public static Apartment[] ApartmentSearch(String sale_type , String realEstateType){
        int status=0;
        try{
            Connection con=DB.getConnection();
            PreparedStatement ps=con.prepareStatement("select id, saleType, price, area, location, realEstateType FROM estateTbl where saleType = ? AND realEstateType =?");
            ps.setString(1,sale_type);
            ps.setString(2, realEstateType);
            ResultSet rs = ps.executeQuery();

            while(rs.next()){

                //Retrieve by column name
                int id  = rs.getInt("id");
                long price = rs.getInt("price");			//int long yapıldı
                String saleType = rs.getString("saleType");
                String area = rs.getString("area");
                String location = rs.getString("location");
                Apartment ap = new Apartment(saleType,(int) price, Integer.parseInt(area), location, realEstateType);
                arrApart.add(ap);
            }


            con.close();
        }
        catch(Exception e){System.out.println(e);
        }
        Apartment[] apArr = new Apartment[arrApart.size()];
        for (int i = 0; i<apArr.length; ++i){
           apArr[i]  =  arrApart.get(i);
        }
        return apArr;
        //return status;
    }

	public static Villa[] VillaSearch(String sale_type , String realEstateType){
		int status=0;
		try{
			Connection con=DB.getConnection();
			PreparedStatement ps=con.prepareStatement("select id, saleType, price, area, location, realEstateType FROM estateTbl where saleType = ? AND realEstateType =?");
			ps.setString(1,sale_type);
			ps.setString(2, realEstateType);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){

				//Retrieve by column name
				int id  = rs.getInt("id");
				long price = rs.getInt("price");			//int long yapıldı
				String saleType = rs.getString("saleType");
				String area = rs.getString("area");
				String location = rs.getString("location");
				Villa villa = new Villa(saleType,(int) price, Integer.parseInt(area), location, realEstateType);
				arrVilla.add(villa);
			}


			con.close();
		}
		catch(Exception e){System.out.println(e);
		}
		Villa[] vilArr = new Villa[arrVilla.size()];
		for (int i = 0; i<vilArr.length; ++i){
			vilArr[i]  =  arrVilla.get(i);
		}
		return vilArr;
		//return status;
	}

	public static Workplace[] WorkPlaceSearch(String sale_type, String realEstateType){
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
				long price = rs.getInt("price");			//int long yapıldı
				String saleType = rs.getString("saleType");
				String area = rs.getString("area");
				String location = rs.getString("location");
				Workplace workplace = new Workplace(saleType,(int) price, Integer.parseInt(area), location, realEstateType);
				arrWorkplace.add(workplace);
			}


			con.close();
		}
		catch(Exception e){System.out.println(e);
		}
		Workplace[] WorkplaceArr = new Workplace[arrWorkplace.size()];
		for (int i = 0; i<WorkplaceArr.length; ++i){
			WorkplaceArr[i]  =  arrWorkplace.get(i);
		}
		return WorkplaceArr;
		//return status;
	}

	public static Land[] LandSearch(String sale_type, String realEstateType){
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
				long price = rs.getInt("price");			//int long yapıldı
				String saleType = rs.getString("saleType");
				String area = rs.getString("area");
				String location = rs.getString("location");
				Land land = new Land(saleType,(int) price, Integer.parseInt(area), location, realEstateType);
				arrLand.add(land);
			}


			con.close();
		}
		catch(Exception e){System.out.println(e);
		}
		Land[] landArr = new Land[arrLand.size()];
		for (int i = 0; i<landArr.length; ++i){
			landArr[i]  =  arrLand.get(i);
		}
		return landArr;
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


