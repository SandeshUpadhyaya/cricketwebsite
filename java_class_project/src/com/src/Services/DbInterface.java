package com.src.Services;


import java.sql.SQLException;

import com.src.Model.RegisterModel;
import com.src.Model.ScheduleModel;
import com.src.Model.SecurityModel;
import com.src.Model.SquadModel;
import com.src.Model.TeamModel;
import com.src.Model.TicketModel;
import com.src.Model.UmpireModel;

import java.util.*;
public interface DbInterface {
	 public int RegisterUser(RegisterModel rm) throws SQLException, ClassNotFoundException;
	 public int TeamDb(TeamModel tm) throws SQLException,ClassNotFoundException;
	public int UmpireDb(UmpireModel um) throws SQLException,ClassNotFoundException;
	public int SquadDb(SquadModel sm) throws SQLException,ClassNotFoundException;
	public int TicketDb(TicketModel tm) throws SQLException,ClassNotFoundException;
	public int SecurityDb(SecurityModel sm) throws SQLException,ClassNotFoundException;
	public int ScheduleDb(ScheduleModel sm) throws SQLException,ClassNotFoundException; 
}
