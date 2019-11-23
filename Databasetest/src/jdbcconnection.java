import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcconnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String host="localhost";
		String port="3306";
		Connection con=DriverManager.getConnection("jdbc:mysql://" + host+ ":" + port + "/qatest", "root", "Audvik@05");
        Statement s= con.createStatement();
	    ResultSet rs=s.executeQuery("Select * from Employee where id=\"1\"");
	    while(rs.next())
	    {
	    
	   System.out.println( rs.getString("name"));
	    rs.getInt("age");
	    rs.getString("location");
	}
	}

}
