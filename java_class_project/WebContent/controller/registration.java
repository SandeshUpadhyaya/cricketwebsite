package com.src.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.src.Model.RegisterModel;
import com.src.Model.RegistrationFactory;

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
		String password=request.getParameter("passw");
		String age=request.getParameter("age");
		String address=request.getParameter("address");
		
		RegisterModel rm=new RegisterModel();
		rm.setName(name);
		rm.setPassword(password);
		rm.setAge(Integer.parseInt(age));
		rm.setAddress(address);
		
		try {
			int result= RegistrationFactory.getInstance().RegisterUser(rm);
			if(result>0){
				request.setAttribute("register", rm);
				request.getRequestDispatcher("Success.jsp").forward(request, response);
			}
			else{
				System.out.println("Database is not connected");
			}
			}
			catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
