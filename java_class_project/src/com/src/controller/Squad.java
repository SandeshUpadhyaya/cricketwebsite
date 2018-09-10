package com.src.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.src.Model.SquadModel;
import com.src.Services.DbInterface;
import com.src.Services.RegistrationFactory;

@WebServlet("/Squad")
public class Squad extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Squad() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ttname=request.getParameter("ttname");
		String pname=request.getParameter("pname");
		String specialization=request.getParameter("specialization");
		int page=Integer.parseInt(request.getParameter("page"));
		SquadModel sm=new SquadModel();
		sm.setPage(page);
		sm.setPname(pname);
		sm.setSpecialization(specialization);
		sm.setTtname(ttname);
		try
		{
			DbInterface d = RegistrationFactory.getInstance();
			d.SquadDb(sm);
			request.setAttribute("success", "Successfully Updated");
			request.getRequestDispatcher("squad.jsp").forward(request, response);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			request.setAttribute("fail", " Player Name Already taken");
			request.getRequestDispatcher("squad.jsp").forward(request, response);
		}
	}

}
