package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.StudentDao;

@WebServlet("/UpdateStudentServlet")
public class UpdateStudentServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String firstName = req.getParameter("firstName");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		int studentId  =Integer.parseInt(req.getParameter("studentId"));
		StudentDao stdDao = new StudentDao();
		stdDao.updateStudent(firstName,email,password,studentId);
		res.sendRedirect("ListStudentServlet");
		
	}
	
}
