package com.src.Services;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.src.Model.RegisterModel;
import com.src.Model.ScheduleModel;
import com.src.Model.SecurityModel;
import com.src.Model.SquadModel;
import com.src.Model.TeamModel;
import com.src.Model.TicketModel;
import com.src.Model.UmpireModel;
public class DbImpl implements DbInterface {
	static Connection con=null;
	static{
		 try {
			Class.forName("org.h2.Driver");
			con=DriverManager.getConnection("jdbc:h2:~/test","sa", "");
			
		 } catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}	
	}
	public int RegisterUser(RegisterModel rm) throws SQLException, ClassNotFoundException {
		  PreparedStatement prepareStatement = con.prepareStatement("insert into registration values(?,?,?)");
			prepareStatement.setString(1, rm.getName());
			prepareStatement.setString(2, rm.getPassword());
			prepareStatement.setInt(3, rm.getAge());
		    return prepareStatement.executeUpdate();	
	}

	

	public int TeamDb(TeamModel tm) throws SQLException, ClassNotFoundException {
		PreparedStatement prepareStatement = con.prepareStatement("insert into team values(?,?,?,?)");
		prepareStatement.setString(1, tm.getTname());
		prepareStatement.setInt(2, tm.getRanking());
		prepareStatement.setString(3,tm.getSname());
		prepareStatement.setString(4, tm.getCoach());
	    return prepareStatement.executeUpdate();
	}

	public int UmpireDb(UmpireModel um) throws SQLException, ClassNotFoundException {
		PreparedStatement prepareStatement=con.prepareStatement("insert into umpire values(?,?,?)");
		prepareStatement.setString(1, um.getUname());
		prepareStatement.setInt(2, um.getRating());
		prepareStatement.setInt(3, um.getUage());
		return prepareStatement.executeUpdate();
	}

	public int SquadDb(SquadModel sm) throws SQLException, ClassNotFoundException {
		PreparedStatement prepareStatement=con.prepareStatement("insert into squad values(?,?,?,?)");
		prepareStatement.setString(1, sm.getTtname());
		prepareStatement.setString(2, sm.getPname());
		prepareStatement.setString(3, sm.getSpecialization());
		prepareStatement.setInt(4, sm.getPage());
		return prepareStatement.executeUpdate();
	}

	public int TicketDb(TicketModel tm) throws SQLException, ClassNotFoundException {
		PreparedStatement preparedStatement=con.prepareStatement("insert into ticket values(?,?,?,?,?)");
		preparedStatement.setString(1, tm.getTtype());
		preparedStatement.setInt(2, tm.getMmno());
		preparedStatement.setInt(3, tm.getTsold());
		preparedStatement.setInt(4, tm.getTrem());
		preparedStatement.setInt(5, tm.getPrice());
		return preparedStatement.executeUpdate();
		
	}

	public int SecurityDb(SecurityModel sm) throws SQLException, ClassNotFoundException {
		PreparedStatement preparedStatement=con.prepareStatement("insert into security values(?,?,?,?)");
		preparedStatement.setString(1, sm.getScclass());
		preparedStatement.setString(2, sm.getTttype());
		preparedStatement.setInt(3, sm.getMmmno());
		preparedStatement.setInt(4, sm.getSccount());
		return preparedStatement.executeUpdate();
	}

	public int ScheduleDb(ScheduleModel sm) throws SQLException, ClassNotFoundException {
		PreparedStatement preparedStatement=con.prepareStatement("insert into schedule values(?,?,?,?,?)");
		preparedStatement.setString(1, sm.getT1());
		preparedStatement.setString(2, sm.getT2());
		preparedStatement.setString(3, sm.getUuname());
		preparedStatement.setString(4, sm.getDate());
		preparedStatement.setString(5, sm.getStadium());
		return preparedStatement.executeUpdate();
	}

	
}
	

