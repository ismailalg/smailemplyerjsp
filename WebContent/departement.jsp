<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
<%@page import="smailpackage.employer"  %>
<%@page import="smailpackage.employerdao"  %>
<%@page import="java.util.*" %>
<%@page import="java.sql.*" %>
<%  List<employer>li=employerdao.getdepartement();    %>
<select >
<option value=""></option>
<% for(employer t:li){   %>

<option value=""><%=t.getNom() %></option>



<% } %>
</select>
</body>
</html>