
<!DOCTYPE html>
<%@page import="javax.swing.JOptionPane"%>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>ajouter service</title>

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
          
       
 
  <div class="form-group">
  <div class="container">
  <div class="jumbotron">

<%@page import="smailpackage.employer" %>
<%@page import="smailpackage.employerdao" %>
<%  

String id_inter=request.getParameter("id_inter");  
employer e=employerdao.getinterid(Integer.parseInt(id_inter)) ; 

 %>
 
<h4>tu peut modifier le nom de votre intervenant</h4>
<form action="updatinter.jsp">
<label for="usr">id_inter:</label>
<input type="text" name="id_inter" value="<%=e.getId_inter() %>" class="form-control"/><br>


<label for="usr">intervenant:</label>
<input type="text" name="intervenant" value="<%=e.getIntervenant() %>" class="form-control"/><br>

<label for="usr">fonction_inter:</label>
<input type="text" name="fonction_inter" value="<%=e.getFonction_inter() %>" class="form-control"/><br>
<label for="usr">email_inter:</label>
<input type="text" name="email_inter" value="<%=e.getEmail_inter() %>" class="form-control"/><br>

<label for="usr">tel_inter:</label>
<input type="text" name="tel_inter" value="<%=e.getTel_inter() %>" class="form-control"/><br>

<input type="submit" value="modifier" class="btn btn-primary"/>
 </form>
 <!-- /.container -->
      </div>
</div></div>
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