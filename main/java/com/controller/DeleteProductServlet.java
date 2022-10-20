package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.ProductDao;

@WebServlet("/DeleteProductServlet")
public class DeleteProductServlet extends HttpServlet {
	
	
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		@Override
		protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
		{
			int productId  = Integer.parseInt(req.getParameter("productId"));
			ProductDao pDao = new ProductDao();
			
			pDao.deleteProduct(productId);
			RequestDispatcher rd= req.getRequestDispatcher("ListProductServlet");
			rd.forward(req, res);
	
		}
}
