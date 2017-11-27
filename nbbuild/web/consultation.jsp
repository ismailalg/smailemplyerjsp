
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
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
            
           
             <li><a href="#contact">help</a></li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>

 

      <div class="starter-template">
       <br><br><br>
          
       
 
 


<div class="form-group">
  <div class="container">
  <div class="jumbotron">



<img src="css/cwc_splash.jpg" class="img-rounded" alt="naftal" width="400" height="236" style="float:right">

<form action="consultation.jsp">
  <label for="usr">date_debut:</label>
<input type="date" name="date"  class="form-control"/><br><br>
<label for="usr">date_fin:</label>
<input type="date" name="date2"  class="form-control"/><br><br>
<input type="submit" value="search" class="btn btn-warning btn-md"  type="button">

</form><br><br>
<%@page import="javax.swing.JOptionPane"%>
<%@page import="smailpackage.employerdao"%>
<%@page import="smailpackage.employer"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="smailpackage.employerdao" %>
<jsp:useBean id="ee" class="smailpackage.employer"></jsp:useBean>
<jsp:setProperty property="*" name="ee"/>

<table class=" table table-fixed"   border="3" >
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
</div>



 <!-- /.container -->
      </div>
</div></div>
  



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
