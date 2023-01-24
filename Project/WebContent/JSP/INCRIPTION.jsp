<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Inscription</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.14.0/css/all.min.css" integrity="sha512-1PKOgIY59xJ8Co8+NE6FZ+LOAZKjy+KY8iq0G4B3CyeY6wYHN3yt9PW0XpSriVlkMXe40PTKnXrLnZ9+fkDaog==" crossorigin="anonymous" />
    <link rel="stylesheet" href="/Project/CSS/Inscrire.css">
</head>
<body> 
    <div class="container">
        <div class="myCard">
            <div class="row">
                <div class="col-md-6">
                    <div class="myLeftCtn"> 
                        <form class="myForm text-center" action="/Project/SevletFAN?action=insertfan" method="post" >
                            <header>INSCRIPTION</header>
                            <div class="form-group">
                                
                                <input class="myInput" type="text" placeholder="Nom" name="nom" required> 
                            </div>
                            <div class="form-group">
                                
                                <input class="myInput" type="text" placeholder="Prenom" name="prenom" required> 
                            </div>

                          
                            <div class="form-group">
                                <input class="myInput" type="text" name="nationalite" placeholder="Nationalité" required> 
                            </div>
                            <div class="form-group">
                               <select class="myInput" name="sexe">
                                        <option value="" disabled selected hidden >Sexe</option>
                                        <option value="M">Homme</option>
                                        <option value="F">Femme</option>
                                    </select> 
                            </div>
                              <div class="form-group">
                                <input class="myInput" placeholder="Email" type="text" name="email" required> 
                            </div>

                            <div class="form-group">
                                <input class="myInput mb-1" type="text" name="login" placeholder="Login" required>
                                <input class="myInput" type="password" name="password" placeholder="Password" required> 
                            </div>
                            
                            <input type="submit" class="butt" value="CREER MON COMPTE">
                            
                        </form>
                    </div>
                </div> 
                <div class="col-md-6">
                    <div class="myRightCtn">
                            <div class="box"><header>HELLO FAN!</header>
                            
                            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, 
                                sed do eiusmod tempor incididunt ut labore et dolore magna 
                                aliqua. Ut enim ad minim veniam.</p>
                            </div>
                                
                    </div>
                </div>
            </div>
        </div>
</div>
      
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
 
</body>
</html>

