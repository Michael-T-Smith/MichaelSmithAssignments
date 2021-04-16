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
<title>${category.name}</title>
</head>
<body>
	<div class="container">
		<h1>Category:</h1>
		<h3>${category.name}</h3>
		<h1>Products</h1>
		<c:forEach items="${category.products}" var="products">
			<ul>
				<li>${products.name}</li>
			</ul>
		</c:forEach>
		<form action="/category/${ category.id }" method="POST">
			<label>Select ${ category.name } products: </label> 
			
			<select name="product">
				<c:forEach items="${ prodNotInCategory }" var="prod">
			        	<option value=${ prod.id }>${ prod.name }</option>
			    </c:forEach>
			</select> 
			<button>Add</button>
		</form>
	</div>
</body>
</html>