<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Song</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<div class="mx-auto" style="width: 1000px; margin-top: 50px">
			<form:form action="/songs/new" method="post" modelAttribute="song">
				<p>
					<form:label style="margin-right: 84px; font-size: 40px" path="title">Title</form:label>
					<form:input path="title" />
					<form:errors style="color:red" path="title" />
				</p>
				<p>
					<form:label style="margin-right: 65px; font-size: 40px" path="artist">Artist</form:label>
					<form:input path="artist" />
					<form:errors style="color:red" path="artist" />
				</p>
				<p>
					<form:label style="margin-right: 30px; font-size: 40px" path="rating">Ratings</form:label>
					<form:input type="number" path="rating" /> <span>(between 1 and 10)</span>
					<form:errors style="color:red" path="rating" />
				</p>
				<input type="submit" value="submit" />
			</form:form>
		</div>
	</div>
</body>
</html>