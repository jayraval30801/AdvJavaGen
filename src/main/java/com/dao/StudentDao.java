package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.util.DBConnection;

public class StudentDao {
		
	public int insertStudent(String firstName , String email , String password)
	{
		int i = -1;
		try {
			Connection con = DBConnection.openConnection();
			
			PreparedStatement pstmt = con.prepareStatement("insert into student (firstName,email,password) values (?,?,?)");
			pstmt.setString(1, firstName);
			pstmt.setString(2, email);
			pstmt.setString(3, password);
			//executeQuery => Display 
			i = pstmt.executeUpdate(); //Update => Insert , Delete , Update 
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return i;
	}
}
