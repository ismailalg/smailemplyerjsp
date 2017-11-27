
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
          <!-- <a class="navbar-brand" href="employerform.jsp">intervention</a>-->
        </div>
        <div id="navbar" class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
           <!--   <li ><a href="consultreqnom.jsp">consultation</a></li>-->
            
          <li><a href="admin.jsp">administrateur</a>
            <!--   <li><a href="#contact">help</a></li>-->
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>

 

      <div class="starter-template">
       <br><br><br>
          
       
 
 
<%@page import="smailpackage.employerdao" %>
<%@page import="smailpackage.employer" %>

<div class="form-group">
  <div class="container">
  <div class="jumbotron">

<form action="consult_intervenant.jsp">
<label for="usr">intervenant:</label>
<input type="text" name="intervenant" class="form-control"/><br><br>
<label for="usr">date:</label>
<input type="text" name="date" id="datepicker" class="form-control"/><br><br>
<label for="usr">datetr:</label>
<input type="text" name="datetr" id="datepicker1" class="form-control"/><br><br>
<input type="submit" value="nbr_intervention" class="btn btn-warning btn-md"/>
</form>

<%@page import="smailpackage.employer" %>
<%@page import="smailpackage.employerdao" %>
<%@page import="java.util.*" %>
<%@page import="java.sql.*" %>
<div class="container">
<div class="container">
<%@ page import="smailpackage.employer" %>
<%@ page import="smailpackage.employerdao" %>
<jsp:useBean id="e" class="smailpackage.employer"></jsp:useBean>
<jsp:setProperty property="*" name="e"/>
<%String g=request.getParameter("intervenant");
String d=request.getParameter("date");
String dtr=request.getParameter("datetr");
%>
<%employer ee=employerdao.nbr_intervention(g,d,dtr);%>


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
    
        <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
  <script src="//code.jquery.com/jquery-1.10.2.js"></script>
  <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>

    <script>
  $(function() {
    $( "#datepicker" ).datepicker({dateFormat: 'dd/mm/yy'});
  });
  </script>
   <script>
  $(function() {
    $( "#datepicker1" ).datepicker({dateFormat: 'dd/mm/yy'});
  });
  </script>
  </body>
</html>
