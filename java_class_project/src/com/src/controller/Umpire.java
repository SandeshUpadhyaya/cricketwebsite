package com.src.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.src.Model.UmpireModel;
import com.src.Services.DbInterface;
import com.src.Services.RegistrationFactory;

@WebServlet("/Umpire")
public class Umpire extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Umpire() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname=request.getParameter("uname");
		int rating=Integer.parseInt(request.getParameter("rating"));
		int uage=Integer.parseInt(request.getParameter("uage"));
		UmpireModel um=new UmpireModel();
		um.setRating(rating);
		um.setUage(uage);
		um.setUname(uname);
		try
		{
			DbInterface d = RegistrationFactory.getInstance();
			d.UmpireDb(um);
			request.setAttribute("success", "Successfully Updated");
			request.getRequestDispatcher("umpire.jsp").forward(request, response);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			request.setAttribute("fail", " Umpire name already taken");
			request.getRequestDispatcher("umpire.jsp").forward(request, response);
		}
	}

}
