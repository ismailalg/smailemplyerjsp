<%@page import="javax.swing.JOptionPane"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ page import="smailpackage.employer" %>
<%@ page import="smailpackage.employerdao" %>
<%String g=request.getParameter("intervenant");%>
<%String d=request.getParameter("date");%>
<%String dtr=request.getParameter("datetr");%>



<% employerdao.nbr_intervention(g, d, dtr);
employer gg=new employer();

%>
<h1><%=gg.getNbr_intervention() %></h1>



</body>
</html>