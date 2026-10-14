package com.jdbccon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DatabaseCreateJDBC {
	public static void main(String[] args) {
		Connection conn = null; 
		
		try {
			String url = "jdbc:mysql://localhost:3306";
			String username = "root";
			String password = "Vedant 16";
			
			conn = DriverManager.getConnection(url, username, password);
			
			System.out.println(conn);
			
			String query = "create database IF NOT EXISTS JDBC01";
			
			Statement st = conn.createStatement();
			st.execute(query);
			
			System.out.println("Database created: JDBC01");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
