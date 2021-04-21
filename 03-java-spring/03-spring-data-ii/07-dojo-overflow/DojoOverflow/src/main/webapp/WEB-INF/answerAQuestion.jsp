<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css"
	integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Answer A Question</title>
</head>
<body>
	<div class="container">
		<h1>${question.theQuestion}</h1>
		<h3>Tags:</h3>
		<table class="table table-dark">
			<tr>
				<th>Answers</th>
			</tr>
			<c:forEach items="${question.answers}" var="answers">
				<tr>
					<td>${answers.theAnswer}</td>
				</tr>
			</c:forEach>
		</table>
		<div class="form-group">
			<form:form action="/${question.id}" method="post"
				modelAttribute="answer">
				<form:label path="question">Answer question: </form:label>
				<form:input path="theAnswer" class="form-control" />
				<form:errors path="theAnswer" style="color:red" />
				<form:input type="hidden" value="${question.id}" path="question.id"/>
				<br>
				<button>Submit Answer</button>
			</form:form>
		</div>
		<button><a href="/dashboard" style="text-Decoration: none; color: black; padding: 5px;">Back to Dashboard</a></button>
	</div>
</body>
</html>