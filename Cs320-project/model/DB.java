
import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
	
	// JDBC driver name and database URL
	   static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost:3306/estatedb";

	   //  Database credentials
	   static final String USER = "elif";
	   static final String PASS = "ozu1997";
	   
	   
	public static Connection getConnection(){
		Connection con=null;
		try{
			Class.forName(JDBC_DRIVER);
			con=DriverManager.getConnection(DB_URL, USER, PASS);
		}catch(Exception e){System.out.println(e);}
		return con;
	}
}
