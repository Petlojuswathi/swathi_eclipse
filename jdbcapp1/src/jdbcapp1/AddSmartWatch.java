package jdbcapp1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class AddSmartWatch {
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			String driver, url, user, password;
			driver = "com.mysql.cj.jdbc.Driver";
			url="jdbc:mysql://localhost:3306/edb12980";
			user="root";
			password="swathi";
			
			String sql="delete from smartwatch where id=?";
			
			//1.Loading driver
			Class.forName(driver);
			
			//2.Establish Connection
			Connection con = DriverManager.getConnection(url,user,password);
			
			//3.Create Statement object.
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, 105);
			
			//4.Execute Insert sql query
			int status = ps.executeUpdate(); //For DML Operation
			if(status>=1) {
				System.out.println("sucess");
			}else {
				System.out.println("failed");
			}
			//5.Close resources
			ps.close();
			con.close();

	}

}
