<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
	crossorigin="anonymous">
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Searched</title>
</head>
<body>
	<div class="container">
		<div class="mx-auto" style="width: 1000px;">
			<nav>
				<h3>Searched for: ${ artist }</h3>
				<form action="/songs/search">
					<input type="text" name="artist" />
					<button class="btn btn-primary">Search Artists</button>
				</form>
				<a href="/dashboard">Dashboard</a>
			</nav>
			<table class="table table-hover">
				<thead>
					<tr>
						<th>Title</th>
						<th>Artist</th>
						<th>Rating</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${songs}" var="song">
						<tr>
							<td><a href="/songs/${ song.id }">${ song.name }</a></td>
							<td>${song.artist}</td>
							<td>${song.rating}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>