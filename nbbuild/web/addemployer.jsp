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
<jsp:useBean id="e" class="smailpackage.employer"></jsp:useBean>
<jsp:setProperty property="*" name="e"/>
<%
int num=employerdao.insert(e);

if(num>0){
	
	response.sendRedirect("employeradded.jsp");
	
}else{
	response.sendRedirect("employerfaild.jsp");
}


%>
</body>
</html>