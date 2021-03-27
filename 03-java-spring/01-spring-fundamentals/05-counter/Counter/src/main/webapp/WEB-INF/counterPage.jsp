<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Counter Page</title>
</head>
<body>
	<h3>You have visited the home page <c:out value="${count}"/> times!</h3>
	<h3><a href="/">Test another visit?</a></h3>
</body>
</html>