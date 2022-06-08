package com.controller;

import java.io.IOException;
import java.util.regex.Pattern;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistrationServlet extends HttpServlet{

		@Override
		protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
		{
			System.out.println("Registration servlet called");
			String firstName  = req.getParameter("firstName");
			String email = req.getParameter("email");
			String password = req.getParameter("password");
			String gender = req.getParameter("gender");
			String city = req.getParameter("city");
			
			boolean isError = false;
			String firstNamePattern  = "^[a-zA-Z]+$";
					Pattern pFn = Pattern.compile(firstNamePattern);
			if(firstName == null || firstName.trim().length() == 0)	
			{
					isError = true;
				req.setAttribute("firstNameError ", "Please enter firstname");
			}	else if(pFn.matcher(firstName).matches() == false)
			{
				isError = true;
				req.setAttribute("firstNameError", "Please Enter only alphabets in firstName");
				req.setAttribute("firstNameValue", firstName);
			}
			else
			{
				req.setAttribute("firstNameValue", firstName);
			}
			String emailPattern  = "^[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,3}$";
			Pattern p = Pattern.compile(emailPattern);
			if(email == null || email.trim().length() == 0)	
			{
					isError = true;
				req.setAttribute("emailError ", "Please enter Email");
			}	else if(pFn.matcher(email).matches() == false)
			{
				isError = true;
				req.setAttribute("emailError", "Please Enter valid email");
				req.setAttribute("emailValue", email);
			}
			else
			{
				req.setAttribute("emailValue",email);
			}
			
				RequestDispatcher rd = null;
				if(isError == true)
				{
					rd = req.getRequestDispatcher("NewUser.jsp");
				}else
				{
					rd = req.getRequestDispatcher("PrintInfo.jsp");
					req.setAttribute("firstName", firstName);
					req.setAttribute("email", email);
					req.setAttribute("password", password);
					
				}
				rd.forward(req, res);
		}
}
