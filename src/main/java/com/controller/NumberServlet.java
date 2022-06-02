package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/NumberServlet")
public class NumberServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
		@Override
		protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
		{
			String x = req.getParameter("number1");
			String y = req.getParameter("number2");
			
			int number1= Integer.parseInt(x);
			//int number2=Integer.parseInt(y);
			req.setAttribute("ans" , number1*number1*number1);
			//int ans = number1 + number2;
			//System.out.println(ans);

			RequestDispatcher rd = req.getRequestDispatcher("Cube.jsp");
			rd.forward(req, resp);
		}
}
