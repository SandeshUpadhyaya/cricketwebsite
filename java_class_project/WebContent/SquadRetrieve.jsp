<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.*" %>

<h2 align="center">SQUAD DATABASE </h2>
<table align="center" cellpadding="5" cellspacing="5" border="1" >
<tr>

</tr>
<tr bgcolor="#03A9F4" >
<td><b>Team Name</b></td>
<td><b>Player Name</b></td>
<td><b>Specialization</b></td>
<td><b>Age</b></td>
</tr>

<%       
 Connection con=null;
ResultSet resultSet=null;
Statement statement=null;
	 try {
		Class.forName("org.h2.Driver");
		con=DriverManager.getConnection("jdbc:h2:~/test","sa", "");
		statement=con.createStatement();
		 resultSet=statement.executeQuery("select * from squad");
		 while(resultSet.next()){	
%>
<tr>

<td><%=resultSet.getInt("ttname") %></td>
<td><%=resultSet.getString("pname") %></td>
<td><%=resultSet.getInt("specialization") %></td>
<td><%=resultSet.getString("page") %></td>


</tr>
<% 
}

} catch (Exception e) {
e.printStackTrace();
}
%>
</table>
