<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page import="smailpackage.employerdao" %> 
<%@page  import ="smailpackage.employer" %>
<% String f=request.getParameter("id_nature");
int id=Integer.parseInt(f);

int st=employerdao.deletenature(id);

if(st>0){
	
	response.sendRedirect("nature.jsp");
}

%>
</body>
</html>