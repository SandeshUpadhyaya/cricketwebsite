<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.*" %>

<h2 align="center">UMPIRE DATABASE </h2>
<table align="center" cellpadding="5" cellspacing="5" border="1" >
<tr>

</tr>
<tr bgcolor="#03A9F4" >
<td><b>Umpire Name</b></td>
<td><b>Rating</b></td>
<td><b>Umpire Age </b></td>
</tr>

<%       
 Connection con=null;
ResultSet resultSet=null;
Statement statement=null;
	 try {
		Class.forName("org.h2.Driver");
		con=DriverManager.getConnection("jdbc:h2:~/test","sa", "");
		statement=con.createStatement();
		 resultSet=statement.executeQuery("select * from umpire");
		 while(resultSet.next()){	
%>
<tr>

<td><%=resultSet.getString("uname") %></td>
<td><%=resultSet.getInt("rating") %></td>
<td><%=resultSet.getInt("uage") %></td>
</tr>
<% 
}

} catch (Exception e) {
e.printStackTrace();
}
%>
</table>
