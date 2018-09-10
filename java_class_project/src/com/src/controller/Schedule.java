package com.src.controller;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.src.Model.ScheduleModel;
import com.src.Services.DbInterface;
import com.src.Services.RegistrationFactory;
@WebServlet("/Schedule")
public class Schedule extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Schedule() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String t1=request.getParameter("t1");
		String t2=request.getParameter("t2");
		String uuname=request.getParameter("uuname");
		String stadium=request.getParameter("stadium");
		String date=request.getParameter("sdate");
		ScheduleModel sm=new ScheduleModel();
		sm.setDate(date);
		sm.setStadium(stadium);
		sm.setT1(t1);
		sm.setT2(t2);
		sm.setUuname(uuname);
		try
		{
			DbInterface di = RegistrationFactory.getInstance();
			di.ScheduleDb(sm);
			request.setAttribute("success", "Successfully Updated");
			request.getRequestDispatcher("schedule.jsp").forward(request, response);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			request.setAttribute("fail", " Security Class Already taken");
			request.getRequestDispatcher("schedule.jsp").forward(request, response);
		}
		
	}
}
