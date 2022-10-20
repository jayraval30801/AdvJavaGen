package com.controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.ProductBean;
import com.dao.ProductDao;

@WebServlet("/ListProductServlet")
public class ListProductServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		ProductDao pDao = new ProductDao();
		ResultSet rs = pDao.getAllProduct();
		req.setAttribute("rs", rs);
		System.out.println("List Product Called");
		RequestDispatcher rd = req.getRequestDispatcher("ListProduct.jsp");
		rd.forward(req, res);
	}
	
}
