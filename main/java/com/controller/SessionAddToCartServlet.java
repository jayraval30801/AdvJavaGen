package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SessionAddToCartServlet")
public class SessionAddToCartServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int productId   = Integer.parseInt(req.getParameter("productId"));
		HttpSession session = req.getSession();
		session.setAttribute("productId",productId);
		ArrayList<Integer> cart = (ArrayList<Integer>)session.getAttribute("cart");
		cart.add(productId);
		session.setMaxInactiveInterval(60);//second
		session.setAttribute("cart", cart);
		res.sendRedirect("SessionHome.jsp");
	}
}
