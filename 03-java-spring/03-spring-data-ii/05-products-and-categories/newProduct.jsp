<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add A New Product</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h1>Add a product</h1>
		<form:form action="/products/newProduct" method="POST" modelAttribute="product">
			<div class="form-group">
				<form:label  path="name">Name: </form:label>
				<form:input placeholder="Enter the name of the product" class="form-control" path="name" />
				<form:errors path="name" />
			</div>
			<div class="form-group">
				<form:label path="description">Description: </form:label>
				<form:textarea placeholder="Description of product" class="form-control" path="description" />
				<form:errors path="description" />
			</div>
			<div class="form-group">
				<form:label path="price"> Price: </form:label>
				<form:input type="number" path="price" />
				<form:errors path="price" />
			</div>
				<button>Submit</button>
		</form:form>
	</div>
</body>
</html>