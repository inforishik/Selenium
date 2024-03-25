import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc {

	public static void main(String[] args) throws SQLException 
	{
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeeportal", "root", "root");
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery("select * from credentials where scenario ='zerobalancecard");
		
		
		
		System.out.println(rs.getString("username"));
		System.out.println(rs.getString("password"));
		

	}

}
