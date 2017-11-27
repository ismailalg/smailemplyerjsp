
<!DOCTYPE html>
<%@page import="java.util.List"%>
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
<%@ page import="smailpackage.employerdao" %>
<%@ page import="smailpackage.employer" %>
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
          
       
 
  <div class="form-group">
  <div class="container">
  <div class="jumbotron">
  <img src="css/cwc_splash.jpg" class="img-rounded" alt="naftal" width="400" height="236" style="float:right">
<form action="addemployer.jsp" method="post">


<%List<employer>l=employerdao.getdepartementt(); %>
<label>departement:</label>
<select name="departement"  class="form-control">
<option value=""></option>
<%for(employer t:l){ %>

<option value="<%=t.getNdepartement()%>"><%=t.getNdepartement()%></option>

<%} %>

</select><br><br>


<%List<employer> lii=employerdao.getservice(); %>

<label for="usr">service:</label>
<select name="service" class="form-control">
<option value=""></option>
<%for(employer tt:lii){ %>

<option value="<%=tt.getNservice()%>"><%=tt.getNservice() %></option>

<%} %>
</select><br><br>

<label for="usr">nom:</label>
<input type="text" name="nom"  class="form-control" /><br>


<%List<employer> li=employerdao.getnature(); %>

<label for="usr">nature:</label>
<select name="nature" class="form-control">
<option value=""></option>
<%for(employer tt:li){ %>

<option value="<%=tt.getType_nature()%>"><%=tt.getType_nature() %></option>

<%} %>
</select><br><br>

<%List<employer> liii=employerdao.getpanne(); %>

<label for="usr">panne:</label>
<select name="panne" class="form-control">
<option value=""></option>
<%for(employer tt:liii){ %>

<option value="<%=tt.getType_panne()%>"><%=tt.getType_panne() %></option>

<%} %>
</select><br><br>
<label for="usr">date:</label>
<input type="text" name="date" id="datepicker" class="form-control" /><br><br>

<label for="usr">etat:</label>
<input type="text" name="etat"  class="form-control" value="encour"/><br><br>
<label for="usr">observation:</label>
  
<textarea class="form-control" rows="5" name="observation"></textarea><br><br>


<div class="container">
<input type="submit" value="ajouter_requete" class="btn btn-primary"/>
<a href="employerform.jsp"   type="button" class="btn btn-warning btn-md">annule</a>



</div>


</form>
 <!-- /.container -->
      </div>
</div></div>
    </div><!-- /.container -->



    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
   <!-- smail  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>-->
    <script src="../../dist/js/bootstrap.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
    
    
 <!-- smail <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css"> 
  <script src="//code.jquery.com/jquery-1.10.2.js"></script>
  <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>  -->

    <script>
  $(function() {
    $( "#datepicker" ).datepicker({dateFormat: 'dd/mm/yy'});
  });
  </script> 
  </body>
</html>
