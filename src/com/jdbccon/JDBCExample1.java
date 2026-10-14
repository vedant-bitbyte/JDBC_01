package com.jdbccon;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCExample1 {
	public static void main(String[] args) {
		
		try {
			//MYSQL DRIVER LOADED AND REGISTERED
			//Class.forName("com.mysql.cj.jdbc.Driver"); // -> Optional after JDBC 4.0+
			
			String url = "jdbc:mysql://localhost:3306";
			String username = "root";
			String password = "Vedant 16";
			
			//FACTORY DESIGN PATTERN
			//Connection is an interface. So from DriverManager class we are calling static getConnection().
			//Factory Pattern: A pattern where another class/method decides which object to create for you, 
			//instead of you creating it directly with new.
			Connection con = DriverManager.getConnection(url, username, password);
			
			System.out.println(con);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
