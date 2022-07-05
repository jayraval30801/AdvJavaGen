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
import com.mysql.cj.xdevapi.Result;

@WebServlet("/ListStudentServlet")
public class ListStudentServlet extends HttpServlet{

		@Override
		protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
				
			StudentDao stdao = new StudentDao();
			ResultSet rs = stdao.getAllStudent();
			req.setAttribute("rs", rs);
			RequestDispatcher rd = req.getRequestDispatcher("ListAllStudent.jsp");
			rd.forward(req, res);
			
			
	}
}
