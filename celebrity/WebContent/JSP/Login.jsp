<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<div class="container">
  <div class="row justify-content-center">
     <div class="col-5 ">
       <div class="card">
                    <div class="card-body ">
                           <form action="SevletFAN" method="post">
                        <caption class="bg-info">
                            <h2>
                                   Login
                            </h2>
                        </caption>
                          <fieldset class="form-group">
                            <label>Login</label> <input type="text"  class="form-control" name="login" required="required">
                        
                            <label>Password</label> <input type="password"  class="form-control" name="password" required="required">
                        </fieldset>
                        <button type="submit" class="btn btn-success">Se Connecter</button>
                        </form>
                    </div>
                </div>
     </div>
  </div>
</div>
</body>
</html>