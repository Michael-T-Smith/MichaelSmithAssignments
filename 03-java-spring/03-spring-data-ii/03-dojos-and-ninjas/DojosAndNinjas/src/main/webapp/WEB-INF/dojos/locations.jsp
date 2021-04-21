<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
	crossorigin="anonymous">
<title>Dojo Locations</title>
</head>
<body>
	<div class="container">
		<table class="table table-dark">
			<tr>
				<th>Actions</th>
				<th>Location</th>
			</tr>
				<c:forEach items="${dojos}" var="dojo">
				<tr>
					<td><a href="${dojo.id}">View Occupants</a></td>
					<td><c:out value="${dojo.name}"/></td>
				</tr>
				</c:forEach>
		</table>
	</div>
</body>
</html>