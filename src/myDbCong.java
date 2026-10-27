package ipl_project;

import java.sql.Connection;
import java.sql.DriverManager;

public class myDbCong {

	public static Connection getMySQLDbConnection() {
		

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/ipl_1340";
			String username = "root";
			String pass = "root";
			Connection con = DriverManager.getConnection(url, username, pass);
			return con;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
