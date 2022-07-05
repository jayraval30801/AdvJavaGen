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

import com.dao.StudentDao;


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
				StudentDao stdDao  = new StudentDao();
				int i = stdDao.insertStudent(firstName, email, password);
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
