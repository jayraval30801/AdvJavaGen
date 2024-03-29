package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SessionLogoutServlet")
public class SessionLogoutServlet extends HttpServlet{

		@Override
		protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
			
			//session destroy
			HttpSession session = req.getSession();
			session.invalidate();//server => session => destroy
			res.sendRedirect("SessionLogin.jsp");
		}
}
