
package sqlcon;

import java.sql.*;


public class SqlConnect {
	public Connection con;

	public SqlConnect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lib", "root", "");
			System.out.println("connection Established");
		} catch (Exception e) {
			System.out.println("Connection Failed due to : " + e);
		}
	}
	
}

/*
	 * public static void main(String args[]) { sqlconnect c=new sqlconnect(); }
	 */
