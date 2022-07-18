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
	public void deleteStudent(int studentId)
	{
		try(Connection con = DBConnection.openConnection();
				PreparedStatement pstmt = con.prepareStatement("delete from student where studentId  = ?");
			)
		{
			pstmt.setInt(1, studentId);
			pstmt.executeUpdate();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public ResultSet getStudentById(int studentId)
	{
		try {
			Connection con = DBConnection.openConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from student where studentId = ?");
			pstmt.setInt(1, studentId);
			ResultSet rs = pstmt.executeQuery();
			return rs;
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
	public void updateStudent(String firstName,String email,String password,int studentId)
	{
		try(Connection con = DBConnection.openConnection();
				PreparedStatement pstmt = con.prepareStatement("update student set firstName=?,email= ? ,password = ? where studentId = ?");
			)
		{
			pstmt.setString(1, firstName);
			pstmt.setString(2,email);
			pstmt.setString(3,password);
			pstmt.setInt(4, studentId);
			 int i = pstmt.executeUpdate();
			if(i == 1)
			{
				System.out.println("Update successfull");
			}else
			{
				System.out.println("Updation failed");
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
