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
			String hobby[] = req.getParameterValues("hobby");
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
			}	else if(p.matcher(email).matches() == false)
			{
				isError = true;
				req.setAttribute("emailError", "Please Enter valid email");
				req.setAttribute("emailValue", email);
			}
			else
			{
				
				req.setAttribute("emailValue",email);
			}
			if(city == null || city.equals("-1"))
			{
				isError = true;
				req.setAttribute("cityError", "Please Select the city");
			}
			else
			{
				req.setAttribute("cityValue", city);
			}
			if(hobby == null || hobby.length <= 1)
			{
				isError = true;
				req.setAttribute("hobbyError", "Please select atleast two hobbies");
			}else
			{
				String hb = "";
				for(int i =0;i<hobby.length;i++)
				{
					hb = hb+hobby[i];
				}
				req.setAttribute("hobbyValue",hb);
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
					req.setAttribute("city", city);
					req.setAttribute("hobby", hobby[0]);
				}
				rd.forward(req, res);
		}
}
