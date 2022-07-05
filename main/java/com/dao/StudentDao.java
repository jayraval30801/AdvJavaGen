package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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

	public ResultSet getAllStudent() {
		// TODO Auto-generated method stub
		ResultSet rs = null;
			try {
				Connection con = DBConnection.openConnection();
				PreparedStatement pstmt = con.prepareStatement("select * from student");
				rs = pstmt.executeQuery();
				
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		return rs;
	}
}
