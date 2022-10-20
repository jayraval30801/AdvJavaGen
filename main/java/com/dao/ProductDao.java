package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.bean.ProductBean;
import com.util.DBConnection;

public class ProductDao {
	
	public int insertProduct(String productName , int price, int qty)
	{
		int i = -1;
		try {
			Connection con = DBConnection.openConnection();
			
			PreparedStatement pstmt = con.prepareStatement("insert into product (productName,price,qty) values (?,?,?)");
			pstmt.setString(1, productName);
			pstmt.setInt(2, price);
			pstmt.setInt(3, qty);
			//executeQuery => Display 
			i = pstmt.executeUpdate(); //Update => Insert , Delete , Update 
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return i;
	}

	public ResultSet getAllProduct() {
		// TODO Auto-generated method stub
		ResultSet rs = null;
			try {
				Connection con = DBConnection.openConnection();
				PreparedStatement pstmt = con.prepareStatement("select * from product");
				rs = pstmt.executeQuery();
				
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		return rs;
	}
	public void deleteProduct(int productId)
	{
		try(Connection con = DBConnection.openConnection();
				PreparedStatement pstmt = con.prepareStatement("delete from product where productId  = ?");
			)
		{
			pstmt.setInt(1, productId);
			pstmt.executeUpdate();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
