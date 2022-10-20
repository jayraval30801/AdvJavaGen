package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.ProductDao;

@WebServlet("/AddProductServlet")
public class AddProductServlet  extends HttpServlet{

		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		@Override
		protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
		{
			String productName = req.getParameter("productName");
			int price  = Integer.parseInt(req.getParameter("price"));
			int qty = Integer.parseInt(req.getParameter("qty"));
			System.out.println("ProductServlet Called");
			ProductDao pDao  = new ProductDao();
			int i = pDao.insertProduct(productName,price,qty);
			RequestDispatcher rd = null;
			
			if(i == 1)
			{
				rd  = req.getRequestDispatcher("Success1.jsp");
			}else
			{
				rd  = req.getRequestDispatcher("Fail.jsp");
				
			}
			rd.forward(req,res);
				
		}
}
