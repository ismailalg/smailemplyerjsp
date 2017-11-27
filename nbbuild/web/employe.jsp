<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>


<head>
    
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>ajouter user</title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="css/ie10-viewport-bug-workaround.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="starter-template.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="../../assets/js/ie-emulation-modes-warning.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>

  <body>

   <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="employerform.jsp">intervention</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
            <li ><a href="consultreqnom.jsp">consultation</a></li>
            
          <li><a href="admin.jsp">administrateur</a>
             <li><a href="#contact">help</a></li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>

 

          
       

 

      <div class="starter-template">
       <br><br><br>
          

<%@page import="smailpackage.employer" %>
<%@page import="smailpackage.employerdao" %>
<%@page import="java.util.*" %>
<%@page import="java.sql.*" %>
<div class="container">
<div class="container">
<div class="jumbotron">
<img src="css/cwc_splash.jpg" class="img-rounded" alt="naftal" width="400" height="236" style="float:right">
<form action="ajoutemployer.jsp">

<label for="usr">nom:</label>
<input type="text" name="nom" class="form-control"/><br><br>
<label for="usr">password:</label>
<input type="password" name="password" class="form-control"/><br><br>
<label for="usr">fonction:</label>
<input type="text" name="fonction" class="form-control"/><br><br>
<label for="usr">email:</label>
<input type="text" name="email" class="form-control"/><br><br>
<label for="usr">tel:</label>
<input type="text" name="tel" class="form-control"/><br><br>
<label for="usr">type_user:</label>
<select name="type_user" class="form-control">
<option  value="admin" >admin</option>
<option  value="utilisateur">utilisateur</option>
</select><br><br>
<input type="submit" value="ajouter_emp" class="btn btn-primary"/>

<a href="employe.jsp" class="btn btn-warning btn-md"  type="button" >annuler </a>
</form>


<div class="jumbotron">
<table class=" table table-fixed"   border="4" >
<thead>
<tr>
<th>idemploye</th>
<th>nom</th>
<th>password</th>
<th>fonction</th>
<th>email</th>
<th>tel</th>
<th>type_user</th>
<th>edit_emp</th>
<th>delete_emp</th>
</tr>
</thead>
<%  List<employer>li=employerdao.getemploye();    %>
<% for(employer e:li){   %>
<tbody>

<tr class="info">
<td><%= e.getIdemploye() %></td>
<td><%= e.getNom() %></td>
<td><%= e.getPassword() %></td>
<td><%= e.getFonction() %></td>
<td><%= e.getEmail() %></td>
<td><%= e.getTel() %></td>
<td><%= e.getType_user() %></td>
<td><a href=" editemploye.jsp?idemploye=<%= e.getIdemploye() %>">edit</a></td>
<td><a href=" deletemp.jsp?idemploye=<%= e.getIdemploye() %>">delete</a></td>

</tr>
</tbody>
<% } %>
</table>
</div></div></div>





</div>
</div><!-- /.container -->






    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
    <script src="../../dist/js/bootstrap.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>