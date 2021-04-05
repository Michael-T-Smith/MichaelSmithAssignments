<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>       
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Top Ten</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
	crossorigin="anonymous">
	<style>
		table {
			margin: 50px;
			font-size: 28px;
		}
		table th {
			padding: 70px;
		}
		table td {
			padding: 70px;
		}
	</style>
</head>
<body>
	<div class="container">
		<table class="table table-dark">
			<thead>
				<tr>
					<th>Rating</th>
					<th>Title</th>
					<th>Artist</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${song}" var="songs">
				<tr>
					<td><c:out value="${songs.rating}"/></td>
					<td><c:out value="${songs.title}"/></td>
					<td><c:out value="${songs.artist}"/></td>
				</tr>
			</c:forEach>	
			</tbody>
		</table>
		<a href="/dashboard">Dashboard</a>
	</div>
</body>
</html>