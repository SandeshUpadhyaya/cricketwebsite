package com.src.controller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.src.Model.RegisterModel;
import com.src.Services.*;

@WebServlet("/registration")
public class registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public registration() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String passw=request.getParameter("passw");
		String cpassw=request.getParameter("cpassw");
		String age=request.getParameter("age");
		HashMap<String, String> error=new HashMap<>();
		

		
		if(name==null|name.length()==0)
		{
			error.put("name", " Name must not be null");
		}	
		else
		{
			request.setAttribute("name", name);
		}
		if(age==null|age.length()==0)
		{
			error.put("age", " Age field must be specified");
		}
		else
		{
			try
			{
				int age1=Integer.parseInt(age);
				if(age1>10 && age1<100)
				{
					request.setAttribute("age", age);
				}
				else
				{
					error.put("age", " Enter age between 10 and 100 only");
				}
			}
			catch(Exception e)
			{
				error.put("age", "Enter a valid integer age");
			}
		}
		if(passw==null|passw.length()==0)
		{
			error.put("passw", "Enter a valid password");
		}
		
		if(!cpassw.equals(passw))
		{
			error.put("cpassw", "Password and Confirm password should be same");
		}
		else
		{
			request.setAttribute("cpassw", cpassw);
		}
		RegisterModel rm=new RegisterModel();
		if(error.isEmpty())
		{
			rm.setName(name);
			rm.setPassword(passw);
			rm.setCpassword(cpassw);
			rm.setAge(Integer.parseInt(age));
			try
			{
				DbInterface d = RegistrationFactory.getInstance();
				d.RegisterUser(rm);
				request.getRequestDispatcher("login.jsp").forward(request, response);
			} 
			catch (Exception e)
			{
				e.printStackTrace();
				request.setAttribute("fail", " Username already taken");
				request.getRequestDispatcher("register.jsp").forward(request, response);
			}
			
		}
		else
		{
			request.setAttribute("error", error);
			request.getRequestDispatcher("register.jsp").forward(request, response);
		}
		
		
			
			
	}	
	}


