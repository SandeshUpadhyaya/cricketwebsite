<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.*" %>

<h2 align="center">TICKET DATABASE </h2>
<table align="center" cellpadding="5" cellspacing="5" border="1" >
<tr>

</tr>
<tr bgcolor="#03A9F4" >
<td><b>Ticket Type</b></td>
<td><b>Match Number</b></td>
<td><b>Ticket Remaining </b></td>
<td><b>Tickets Sold</b></td>
<td><b>Price</b></td>
</tr>

<%       
 Connection con=null;
ResultSet resultSet=null;
Statement statement=null;
	 try {
		Class.forName("org.h2.Driver");
		con=DriverManager.getConnection("jdbc:h2:~/test","sa", "");
		statement=con.createStatement();
		 resultSet=statement.executeQuery("select * from ticket");
		 while(resultSet.next()){	
%>
<tr>

<td><%=resultSet.getString("ttype") %></td>
<td><%=resultSet.getInt("mmno") %></td>
<td><%=resultSet.getInt("trem") %></td>
<td><%=resultSet.getInt("tsold") %></td>
<td><%=resultSet.getInt("price") %></td>

</tr>
<% 
}

} catch (Exception e) {
e.printStackTrace();
}
%>
</table>
