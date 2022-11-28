<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Fans</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<div class=" text-center mt-4"><h6>La liste de fans</h6></div>
 <table class="table table-bordered">
                        <thead class="bg-success">
                            <tr>
                                <th>id</th>
                                <th>Login</th>
                                <th>Password</th>
                                <th>Nom</th>
                                <th>Prenom</th>
                                <th>Actions</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="fan" items="${listfans}"  varStatus="boucle">
                                <tr>
                                    <td>
                                        <c:out value="${fan.getId()}" />
                                    </td>
                                    <td>
                                        <c:out value="${fan.getLogin()}" />
                                    </td>
                                    <td>
                                        <c:out value="${fan.getPassword()}" />
                                    </td>
                                    <td>
                                        <c:out value="${fan.getNom()}" />
                                    </td>
                                    <td>
                                        <c:out value="${fan.getPrenom()}" />
                                    </td>
                                    <td>
                                       <a class="text-danger" href="delete?id=<c:out value='${freelancer.id}' />">Delete</a></td>
                                </tr>
                            </c:forEach>
                        </tbody>

                    </table>
</body>
</html>