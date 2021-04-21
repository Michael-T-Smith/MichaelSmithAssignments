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
<title>Welcome</title>
<style>
ul li {
	list-style-type: none;
	font-size: 4em;
}
</style>
</head>
<body>
	<div class="container">
		<ul>
			<li><a href="products/newProductForm">New Product</a></li>
			<li><a href="products/productsTable">View Products</a></li>
			<li><a href="categories/newCategoryForm">New Category</a></li>
			<li><a href="categories/categoriesTable">View Categories</a></li>
		</ul>
	</div>
</body>
</html>