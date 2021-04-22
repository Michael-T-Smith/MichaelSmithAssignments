<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css"
	integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Questions Dashboard</title>
</head>
<body>
	<div class="container">
		<h1>Welcome ${user.firstName}</h1>
		<h1>Questions Dashboard</h1>
		<table class="table table-dark">
			<tr>
				<th>Questions</th>
				<th>Tags</th>
			</tr>
			<c:forEach items="${questions}" var="q">
				<tr>
					<td><a href="${q.id}">${q.theQuestion}</a></td>
					<td>${q.tagQuestion.tag}</td>
				</tr>
			</c:forEach>
		</table>
		<a href="/newQuestion" style="margin-left: 900px; font-size: 20px"> Ask A Question</a>
		<form action="/logOut">
			<input style="background-color: red; color: white" type="submit" value="Log Out" />
		</form>
	</div>
</body>
</html>