<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<meta charset="ISO-8859-1">
<title>${product.name}</title>
</head>
<body>
	<div class="container">
		<h1>Product:</h1>
		<h3>${product.name}</h3>
		<h1>Categories for Product</h1>
		<c:forEach items="${product.categories}" var="category">
			<ul>
				<li>${category.name}</li>
			</ul>
		</c:forEach>
		<form action="/product/${ product.id }" method="POST">
			<label>Select category for the ${ product.name }: </label> 
			
			<select name="category">
				<c:forEach items="${ catNotInProduct }" var="cat">
			        	<option value=${ cat.id }>${ cat.name }</option>
			    </c:forEach> 
			</select> 
			<button>Add</button>
		</form>
	</div>
</body>
</html>