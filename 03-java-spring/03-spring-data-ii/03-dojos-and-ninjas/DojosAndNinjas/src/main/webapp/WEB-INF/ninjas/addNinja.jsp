<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
	crossorigin="anonymous">
<title>Add A New Ninja</title>
</head>
<body>
<div class="container">
	<h1>Add A New Member</h1>
	<form:form action="/ninjas/createNinja" method="POST" modelAttribute="ninja">
		<div class="mb-3">
				<form:label path="dojo"> Select A Dojo </form:label>
				<form:errors path="dojo"/>
				<form:select path="dojo">
					<c:forEach items="${dojos}" var="dojos">
						<option value="${dojos.id}">${dojos.name}</option>
					</c:forEach>
				</form:select>
			</div>
			<div class="mb-3">
				<form:label path="firstName">First Name: </form:label>
				<form:input class="form-control" path="firstName"/>
				<form:errors path="firstName"/>
			</div>
			<div class="mb-3">
				<form:label class="form-label" path="lastName">Last Name: </form:label>
				<form:input class="form-control" path="lastName"/>
				<form:errors path="lastName"/>
			</div>
			<div class="mb-3">
				<form:label class="form-label" path="age">Age: </form:label>
				<form:input class="form-control" type="number" path="age"/>
				<form:errors path="age"/>
			</div>
				<button>Create Ninja</button>
	</form:form>
	</div>
</body>
</html>