<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Secret Code</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
	<h4>What is the code?</h4>
	<span><c:out value="${error}"/></span>
	<form method="POST" action="/">
		<input type="text" name="passcode"><br>
		<button type="submit">Try Code</button>
	</form>
	
</body>
</html>