package com.controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.StudentDao;

@WebServlet("/EditStudentServlet")
public class EditStudentServlet extends HttpServlet{
	
		@Override
		protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
			int studentId  = Integer.parseInt(req.getParameter("studentId"));
			StudentDao stdDao = new StudentDao();
			ResultSet rs = stdDao.getStudentById(studentId);
			req.setAttribute("rs", rs);
			RequestDispatcher rd = req.getRequestDispatcher("EditStudent.jsp");
			rd.forward(req, res);
		}
		
}
