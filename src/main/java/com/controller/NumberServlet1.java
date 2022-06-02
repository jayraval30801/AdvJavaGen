package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class NumberServlet1 extends HttpServlet{
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String number = req.getParameter("number");
		int x = Integer.parseInt(number);
		int z=x*x*x;
		req.setAttribute("ans",z);
		RequestDispatcher rd = req.getRequestDispatcher("Cube1.jsp");
		rd.forward(req, res);
		}
}
