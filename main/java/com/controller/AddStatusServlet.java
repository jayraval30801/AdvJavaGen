package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.StatusBean;
import com.dao.StatusDao;

@WebServlet("/AddStatusServlet")
public class AddStatusServlet  extends HttpServlet{

		@Override
		protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
			String statusName = req.getParameter("statusName");
			
			StatusDao statusDao = new StatusDao();
			int i = statusDao.insertStatus(statusName);
			RequestDispatcher rd = null;
			if(i==1)
			{
				rd = req.getRequestDispatcher("Success.jsp");
			}
			else
			{
				rd = req.getRequestDispatcher("Fail.jsp");
			}
			rd.forward(req, res);
		}
}
