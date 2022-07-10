package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.StudentDao;

@WebServlet("/DeleteStudentServlet")
public class DeleteStudentServlet extends HttpServlet{

		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		@Override
		protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
				int studentId  = Integer.parseInt(req.getParameter("studentId"));
				StudentDao stdDao = new StudentDao();
				
				stdDao.deleteStudent(studentId);
				RequestDispatcher rd= req.getRequestDispatcher("ListStudentServlet");
				rd.forward(req, res);
		}
		
}
