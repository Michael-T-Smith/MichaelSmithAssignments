<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index</title>
</head>
<body>
<c:forEach items="${books}" var="book" varStatus="loop">
<tr>    
    <td><c:out value="${book.title}"/></td>
    <td><c:out value="${book.description}"/></td>
    <td><c:out value="${book.language}"/></td>
    <td><c:out value="${book.numberOfPages}"/></td>
    <td><a href="/books/delete/${book.id}">Delete</a></td>
    <td><a href="/books/editBook/${book.id}">Update</a></td>
</tr>
<br>
</c:forEach>
<button><a href="/books/new">Add A Book!</a></button>
</body>
</html>