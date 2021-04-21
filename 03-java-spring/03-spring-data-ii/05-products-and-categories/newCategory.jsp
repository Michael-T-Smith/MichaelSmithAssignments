<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create A Category</title>
</head>
<body>
	<div class="container">
		<h1>Add a Category</h1>
		<form:form method="POST" action="/categories/newCategory"
			modelAttribute="category">
			<form:label path="name">Name: </form:label>
			<form:input path="name" placeholder="Name of new Category"
				class="form-control" />
			<form:errors path="name" />
			<button>Submit</button>
		</form:form>
	</div>
</body>
</html>