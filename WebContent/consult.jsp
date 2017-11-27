<%@page import="javax.swing.JOptionPane"%>
<%@page import="smailpackage.employerdao"%>
<%@page import="smailpackage.employer"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
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
<jsp:useBean id="ee" class="smailpackage.employer"></jsp:useBean>
<jsp:setProperty property="*" name="ee"/>

<table class=" table table-fixed"   border="4" >
<thead>
<tr>
<th>id</th>
<th>departement</th>
<th>service</th>
<th>nom</th>
<th>nature</th>
<th>panne</th>
<th>date</th>
<th>datetr</th>
<th>etat</th>
<th>observation</th>
<th>edit</th>
<th>delete</th>
</tr>
</thead>

<%List<employer> l=employerdao.gettabledate(ee); %>
<% for(employer eee:l){   %>
<tbody>

<tr class="info">
<td><%= eee.getId() %></td>

<td><%= eee.getDepartement() %></td>
<td><%= eee.getService() %></td>
<td><%= eee.getNom() %></td>
<td><%= eee.getNature() %></td>
<td><%= eee.getPanne() %></td>
<td><%= eee.getDate() %></td>
<td><%= eee.getDatetr() %></td>
<td><%= eee.getEtat() %></td>
<td><%= eee.getObservation() %></td>
<td><a href=" editpb.jsp?id=<%= eee.getId() %>">edit</a></td>
<td><a href=" delete.jsp?id=<%= eee.getId() %>">delete</a></td>
</tr>
</tbody>
<% } %>
</table>

</body>
</html>