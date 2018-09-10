package com.src.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.src.Model.SecurityModel;
import com.src.Services.DbInterface;
import com.src.Services.RegistrationFactory;

@WebServlet("/Security")
public class Security extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Security() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String scclass=request.getParameter("scclass");
		String tttype=request.getParameter("tttype");
		int sccount=Integer.parseInt(request.getParameter("sccount"));
		int mmmno=Integer.parseInt(request.getParameter("mmmno"));
		SecurityModel sm=new SecurityModel();
		sm.setMmmno(mmmno);
		sm.setScclass(scclass);
		sm.setSccount(sccount);
		sm.setTttype(tttype);
		try
		{
			DbInterface d = RegistrationFactory.getInstance();
			d.SecurityDb(sm);
			request.setAttribute("success", "Successfully Updated");
			request.getRequestDispatcher("security.jsp").forward(request, response);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			request.setAttribute("fail", " Security Class Already taken");
			request.getRequestDispatcher("security.jsp").forward(request, response);
		}

	}

}
