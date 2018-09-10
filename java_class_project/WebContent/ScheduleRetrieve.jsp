<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.*" %>

<h2 align="center">SCHEDULE DATABASE </h2>
<table align="center" cellpadding="5" cellspacing="5" border="1" >
<tr>

</tr>
<tr bgcolor="#03A9F4" >
<td><b>Team 1</b></td>
<td><b>Team 2</b></td>
<td><b>Umpire Name </b></td>
<td><b>Date</b></td>
<td><b>Stadium</b></td>
</tr>

<%       
 Connection con=null;
ResultSet resultSet=null;
Statement statement=null;
	 try {
		Class.forName("org.h2.Driver");
		con=DriverManager.getConnection("jdbc:h2:~/test","sa", "");
		statement=con.createStatement();
		 resultSet=statement.executeQuery("select * from schedule");
		 while(resultSet.next()){	
%>
<tr>

<td><%=resultSet.getString("t1") %></td>
<td><%=resultSet.getString("t2") %></td>
<td><%=resultSet.getString("uname") %></td>
<td><%=resultSet.getString("date") %></td>
<td><%=resultSet.getString("stadium") %></td>

</tr>
<% 
}

} catch (Exception e) {
e.printStackTrace();
}
%>
</table>
