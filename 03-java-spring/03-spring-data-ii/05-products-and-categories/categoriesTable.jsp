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
<meta charset="ISO-8859-1">
<title>Products</title>
</head>
<body>
	<div class="container">
		<table class="table table-dark">
			<tr>
				<th>ID</th>
				<th>Category</th>
				<th>Add Product</th>
			</tr>
			<c:forEach items="${categories}" var="cat">
				<tr>
					<td>${cat.id}</td>
					<td>${cat.name}</td>	
					<td><a href="${cat.id}">Add products</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>