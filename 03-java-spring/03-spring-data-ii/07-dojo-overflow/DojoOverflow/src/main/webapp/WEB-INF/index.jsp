<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css"
	integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Welcome to Dojo Overflow.</title>
</head>
<body>
	<div style="background-color: silver" class="container">
		<div class="row">
			<div class="col">
				<h1>Welcome to Dojo Overflow!</h1>
				<p>...not a knock-off of StackOverflow.</p>
				<br>
				<h2>Login</h2>
				<p style="color:red">${loginError}</p>
				<form method="post" action="/login">
					<div class="form-group">
						<label>Email</label>
						<input class="form-control" type="email" name="loginEmail" />
					</div>
					<div class="form-group">
						<label>Password</label>
						<input class="form-control" type="password" name="loginPassword" />
					</div>
					<button class="btn btn-danger">Login</button>
				</form>
			</div>
			<div class="col">
				<br> <br> <br> <br> <br> 
				<h2>Register Account</h2>
				<form:form action="/newUser" method="post" modelAttribute="user">
					<div class="form-group">
						<form:label path="firstName">First Name</form:label>
						<form:input class="form-control" path="firstName" />
						<form:errors style="color:red" path="firstName" />
					</div>
					<div class="form-group">
						<form:label path="lastName">Last Name </form:label>
						<form:input class="form-control" path="lastName" />
						<form:errors style="color:red" path="lastName" />
					</div>
					<div class="form-group">
						<form:label path="email">Email</form:label>
						<form:input class="form-control" path="email" />
						<form:errors style="color:red" path="email" />
					</div>
					<div class="form-group">
						<form:label path="password">Password</form:label>
						<form:input class="form-control" type="password" path="password" />
						<form:errors style="color:red" path="password" />
					</div>
					<div class="form-group">
						<form:label path="confirmPassword">Confirm Password</form:label>
						<form:input class="form-control" type="password"
							path="confirmPassword" />
						<form:errors style="color:red" path="confirmPassword" />
					</div>
					<input type="submit" value="Submit" class="btn btn-primary" />
				</form:form>
			</div>
		</div>
	</div>
</body>
</html>