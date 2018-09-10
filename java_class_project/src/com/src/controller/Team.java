package com.src.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.src.Model.TeamModel;
import com.src.Services.DbInterface;
import com.src.Services.RegistrationFactory;


@WebServlet("/Team")
public class Team extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Team() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tname=request.getParameter("tname");
		int ranking=Integer.parseInt(request.getParameter("ranking"));
		String sname=request.getParameter("sname");
		String coach=request.getParameter("coach");
		TeamModel tm=new TeamModel();

			tm.setCoach(coach);
			tm.setRanking(ranking);
			tm.setSname(sname);
			tm.setTname(tname);
			try
			{
				DbInterface d = RegistrationFactory.getInstance();
				d.TeamDb(tm);
				request.setAttribute("success", "Successfully Updated");
				request.getRequestDispatcher("team.jsp").forward(request, response);
			}
			catch(Exception e)
			{
				e.printStackTrace();
				request.setAttribute("fail", " Team name already taken");
				request.getRequestDispatcher("team.jsp").forward(request, response);
			}
			
	}

}
