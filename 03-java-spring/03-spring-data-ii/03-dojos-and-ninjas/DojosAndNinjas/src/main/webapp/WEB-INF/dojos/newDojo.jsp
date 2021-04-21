<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>     
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<meta charset="ISO-8859-1">
<title>Add A Dojo</title>
</head>
<body>
	<div class="container">
		<h1>New Dojo</h1>
	
		<form:form method="POST" action="/dojos/createDojo" modelAttribute="dojo">
			<div class="mb-3">
				<form:label path="name" class="form-label">Dojo: </form:label>
				<form:input path="name" class="form-control" placeholder="Enter the name of the new Dojo"/>
				<form:errors path="name"/>
				<button>Create Dojo</button>
			</div>
		</form:form>
	
	</div>
</body>
</html>