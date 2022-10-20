package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SessionLoginServlet")
public class SessionLoginServlet extends HttpServlet{
		
		@Override
		protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
			String email = req.getParameter("email");
			
			HttpSession session = req.getSession();
			session.setAttribute("email", email);
			session.setAttribute("cart", new ArrayList<Integer>());
			
			RequestDispatcher rd = req.getRequestDispatcher("SessionHome.jsp");
			rd.forward(req, res);
			
		}
}
