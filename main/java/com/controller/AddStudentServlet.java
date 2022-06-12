package com.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AddStudentServlet extends HttpServlet {
	
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		@Override
		protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
				String firstName = request.getParameter("firstName");
				String email = request.getParameter("email");
				String password = request.getParameter("password");
				System.out.println("Servlet Called......");
				String driver = "com.mysql.cj.jdbc.Driver";
				String url = "jdbc:mysql://localhost:3306/genadvjava";
				String username="root";
				String password1 = "";
				int i = -1;
				try
				{
					Class.forName(driver);
					Connection con = DriverManager.getConnection(url,username,password1);
					//statement , pritable statement,callable statement;
					PreparedStatement pstmt = con.prepareStatement("insert into student (firstname,email,password) values (?,?,?)");
					pstmt.setString(1, firstName);
					pstmt.setString(2, email);
					pstmt.setString(3, password);
					i= pstmt.executeUpdate();
					
					//executeUpdate  =>update,delete,insert
					//executeQuery => show data
 				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				
				RequestDispatcher rd = null;
				
				if(i == 1)
				{
					rd  = request.getRequestDispatcher("Success.jsp");
					
				}else
				{
					rd  = request.getRequestDispatcher("Fail.jsp");
				}
				rd.forward(request,response);
		}
}
