<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page import="java.io.PrintWriter" %>

<%!int day=3; %>
<%!int fontsize; %>
<% out.print(2*5);%><br><% 
out.print("ur system id address is"+request.getRemoteAddr());
%>
<br>
<%switch(day){
case 0: 
	out.println("Its Sunday");
	break;
case 1: 
	out.println("Its Monday");
	break;
case 2: 
	out.println("Its Tuesday");
	break;
case 3: 
	out.println("Its Wednesday");
	break;
case 4: 
	out.println("Its Thursday");
	break;
case 5: 
	out.println("Its Friday");
	break;
default:
	out.println("Its Saturday");
	break;
	
} %><br> 
<%for(fontsize=3;fontsize<=6;fontsize++){ %>
<font color="red" size="<%= fontsize%>">
<p>BABA</p>
</font><br>
<%} %>
<%while (fontsize<=9){ %>
<font color="red" size="<%= fontsize%>">
<p>BABA BABA</p>
</font><br>
<% fontsize++ ; } %>

<%-- 
<p>Today's date is:<%=(new java.util.Date()).toLocaleString() %></p>
--%>
<%  PrintWriter pw =response.getWriter();
pw.println("Saumya");
out.println("Chitra");
pw.println("Saumya");
out.println("Chitra");
pw.println("Saumya");
out.println("Chitra");
pw.println("Saumya");
out.println("Chitra");
%>
</body>
</html>