package com.pages.base;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class Demo {

	public static void main(String[] args) throws SQLException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		 
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/company","root","");  
		//here sonoo is database name, root is username and password  
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("SELECT * FROM `client` WHERE client_name = 'Times Newspaper'");  
		
		while(rs.next())  {
			System.out.println(rs.getInt(1) +" || "+rs.getString(2)+" || "+rs.getString(3)); 
			
		}
			con.close();  
		
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		System.out.println();
	}

}
