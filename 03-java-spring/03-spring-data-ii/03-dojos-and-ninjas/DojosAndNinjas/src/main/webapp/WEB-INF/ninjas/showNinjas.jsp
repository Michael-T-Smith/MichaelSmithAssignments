<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Members of ${dojo.name} Dojo</title>
</head>
<body>
	<div class="container">
		<h1>Members of the ${dojo.name} Dojo!</h1>
		<table class="table table-dark">
			<th>First Name</th>
			<th>Last Name</th>
			<th>Age</th>
		<c:forEach items="${dojo.ninjas}" var="ninja">
			<tr>
				<td>${ninja.firstName}</td>
				<td>${ninja.lastName}</td>
				<td>${ninja.age}</td>
			</tr>
		</c:forEach>	
		</table>
	</div>
</body>
</html>