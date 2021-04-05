<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h1 style="margin: 30px 0px 20px 480px;">Dashboard</h1>
		<div class="mx-auto" style="width: 1000px;">
			<div class="header" style="margin-top: 50px">
				<a href="/songs/new" style="padding: 15px;">Add new</a> <a
					href="/search/topTen" style="padding: 15px; margin-left: 60px" >Top Songs</a><span><input
					style="padding: 2px; border: 3px solid black; margin-left: 425px" type="text"
					name="artist" />
					<button>Search Artists</button></span>
			</div>
			<table class="table table-dark" style="margin-top: 30px">
				<thead>
					<tr>
						<th scope="col">Name</th>
						<th scope="col">Rating</th>
						<th scope="col">Actions</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${song}" var="songs">
						<tr>
							<td><a href="/songs/details/${songs.id}"><c:out
										value="${songs.title}" /></a></td>
							<td><c:out value="${songs.rating}" /></td>
							<td>
								<form id="delete-form" action="/songDelete/${songs.id}"
									method="post">
									<input type="hidden" name="delete method" value="delete">
									<input class="btn"
										style="color: red; text-decoration: underline" type="submit"
										value="Delete">
								</form>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>