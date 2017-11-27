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
<jsp:useBean id="e" class="smailpackage.employer"></jsp:useBean>
<jsp:setProperty property="*" name="e"/>
<%String g=request.getParameter("intervenant"); %>
<%String d=request.getParameter("date"); %>
<%String dtr=request.getParameter("datetr"); %>
<%employer ee=employerdao.nbr_intervention(g, d, dtr);%>


<div class="jumbotron">
<table class=" table table-fixed"   border="4" >
<thead>
<tr>
<th>intervenant</th>
<th>nbr_intervention</th>

</tr>
</thead>

<tbody>

<tr class="info">
<td><%=ee.getIntervenant() %></td>
<td><%=ee.getNbr_intervention()%></td>

</tr>
</tbody>

</table>
</div>


</body>
</html>