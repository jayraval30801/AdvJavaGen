package com.util;

import java.sql.Connection; 
import java.sql.DriverManager;

public class DBConnection  {
	
		public static void main(String args[])
		{
				DBConnection.openConnection();
			
		}
		public static Connection openConnection() 
		{
			
			String driver = "com.mysql.cj.jdbc.Driver";
	    	String url  ="jdbc:mysql://localhost:3306/genadvjava";
 			String password = "";
			String username = "root";
			Connection con = null;
			try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,username,password);
			}
			catch(Exception e)
			{
				System.out.println("Ex:=>"+e.getMessage());
				
			}
			if(con==null)
			{
				System.out.println("db not connected");
				
			}else
			{
				
				System.out.println("DB connected");
			}
			return con;
		}
}
