<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css"
	integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Add a question</title>
</head>
<body>
	<div class="container" style="background-color: silver">
		<h1 style="margin-bottom: 110px; margin-top: 40px; margin-left: 30%">What
			is your question, ${user.firstName}?</h1>
		<form:form action="/newQuestion" method="post"
			modelAttribute="question">
			<div class="form-group">
				<form:label path="theQuestion"
					style="font-size: 40px; margin-left: 40%;">Question</form:label>
				<form:input class="form-control" style="border: 1px solid black"
					path="theQuestion" />
				<form:errors style="color: red" path="theQuestion" />
			</div>
			<button style="margin-left: 41%">Submit Question</button>
		</form:form>
		<button><a href="/dashboard" style="color: black; padding: 5px; text-decoration: none;">Return to Dashboard</a></button>
	</div>
</body>
</html>