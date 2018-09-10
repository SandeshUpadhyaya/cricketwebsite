package com.src.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.src.Model.TicketModel;
import com.src.Services.DbInterface;
import com.src.Services.RegistrationFactory;

@WebServlet("/Tickets")
public class Tickets extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Tickets() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ttype=request.getParameter("ttype");
		int mmno=Integer.parseInt(request.getParameter("mmno"));
		int tsold=Integer.parseInt(request.getParameter("tsold"));
		int trem=Integer.parseInt(request.getParameter("trem"));
		int price=Integer.parseInt(request.getParameter("price"));
		TicketModel tm=new TicketModel();
		tm.setMmno(mmno);
		tm.setPrice(price);
		tm.setTrem(trem);
		tm.setTsold(tsold);
		tm.setTtype(ttype);
		try
		{
			DbInterface d = RegistrationFactory.getInstance();
			d.TicketDb(tm);
			request.setAttribute("success", "Successfully Updated");
			request.getRequestDispatcher("tickets.jsp").forward(request, response);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			request.setAttribute("fail", " Database failed");
			request.getRequestDispatcher("tickets.jsp").forward(request, response);
		}
	}

}
