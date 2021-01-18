package com.EP_Practical.Connections;
import java.sql.Connection;
import java.sql.*;
public class DBUtil {
	final static String forNameURL = "driver:com.mysql.jdbc.Driver";
	final static String dbURL = "jdbc:mysql://localhost:3306/Student";
	final static String username = "system";
	final static String password = "123456";
	public static Connection DBConnection() throws SQLException, ClassNotFoundException{
		Class.forName(forNameURL);
		Connection con = DriverManager.getConnection(dbURL,username,password);
		return con;
	}
	

}
