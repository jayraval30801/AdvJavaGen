package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class NumberServlet1 extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String number = req.getParameter("number");

		boolean isError = false;	
		if(number == null || number.trim().length() == 0)
		{
			isError  = true;
			req.setAttribute("n1Error", "Please enter no1 ");
		}else{
			try {
				

				int x = Integer.parseInt(number);
				int z=x*x*x;
				req.setAttribute("ans",z);
			}catch(Exception e)
			{
				isError = true;
				req.setAttribute("n1Error", "Please Enter Valid Number");
				
			}
		}
		RequestDispatcher rd = req.getRequestDispatcher("Cube1.jsp");
		rd.forward(req, res);
		}
}
