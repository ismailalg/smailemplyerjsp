<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@page import="smailpackage.employer" %>
<%@page import="smailpackage.employerdao" %>


<%  

String id=request.getParameter("id"); 
//out.print(id);
employerdao.deletetableid(Integer.parseInt(id)) ; 

 %>




<h1>this is new table update</h1>



<jsp:include page="viewtable.jsp"/>


</body>
</html>