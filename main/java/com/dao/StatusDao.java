package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.util.DBConnection;

public class StatusDao {

	public int insertStatus(String statusName) {
		int i = -1;
		try {
			Connection con = DBConnection.openConnection();
			PreparedStatement pstmt = con.prepareStatement("insert into status (statusName) values (?)");
			pstmt.setString(1, statusName);
			i = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return i;
	}
}
