package jdbcapp1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetAllEmployees {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String driver, url, user, password;
		driver = "com.mysql.cj.jdbc.Driver";
		url="jdbc:mysql://localhost:3306/edb12980";
		user="root";
		password="swathi";
		
		String sql="select * from employee";
		
		//1.Loading driver
		Class.forName(driver);
		
		//2.Establish Connection
		Connection con = DriverManager.getConnection(url,user,password);
		
		//3.Create Statement object.
		Statement st = con.createStatement();
		
		//4.Excute select sql query
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next()) {
			System.out.println("Id:"+rs.getInt("id"));
			System.out.println("Name:"+rs.getString("name"));
			System.out.println("Email:"+rs.getString("email"));
			System.out.println("Mobile:"+rs.getLong("mobile"));
			System.out.println("Gender:"+rs.getString("gender"));
			System.out.println("---------------------------------");
		}
	//Closing all resource
	rs.close();
	st.close();
	con.close();
	}

}
