package com.src.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.src.Services.Validate;

@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public login() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("uname");
		String psw=request.getParameter("psw");
		if(Validate.checkUser(name, psw))
		{
			request.getRequestDispatcher("Success.jsp").forward(request, response);
			HttpSession session=request.getSession();  
		}
		else
		{
			request.setAttribute("fail", "Username and passwords do not match");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

}
