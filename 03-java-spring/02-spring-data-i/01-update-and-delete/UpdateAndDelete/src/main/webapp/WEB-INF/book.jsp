<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book</title>
</head>
<body>
	<h1>
		<c:out value="${books.title}" />
	</h1>
	<p>
		Description:
		<c:out value="${books.description}" />
	</p>
	<p>
		Language:
		<c:out value="${books.language}" />
	</p>
	<p>
		Number of pages:
		<c:out value="${books.numberOfPages}" />		
	</p>
	<a href="book/{id}/editBook.jsp">Edit Book</a>
	<form action="/books/${books.id}" method="post">
		<input type="hidden" name="_method" value="delete"> <input
			type="submit" value="Delete">
	</form>
</body>
</html>