<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" >
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.14.0/css/all.min.css"  />
<link rel="stylesheet" href="/Project/CSS/Login.css">
<title>Login</title>
</head>
<body class="align">

    <div class="grid">

        <form action="/Project/ServletLogin?action=logtest" method="POST" class="form login">

            <div class="form__field">
                <label for="login"><i class="fas fa-user icon"></i><span class="hidden">Login</span></label>
                <input autocomplete="username" id="login" type="text" name="login" class="form__input" placeholder="Username" required>
            </div>

            <div class="form__field">
                <label for="password"><i class="fas fa-lock icon"></i><span class="hidden">Mot de passe</span></label>
                <input id="password" type="password" name="password" class="form__input" placeholder="Password" required>
            </div>
            <div class="form__field">
                <input type="submit" value="Sign In">
            </div>

        </form>

        <p class="text--center">Pas encore inscrit ? <a href="/Project/SevletFAN?action=newfan">Inscrivez-vous maintenant </a> <i class="fas fa-arrow-right"></i></p>
    </div>

</html>