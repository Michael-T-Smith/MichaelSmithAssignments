<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojo Survey Results</title>
</head>
<body>
	<h1>Submitted Info</h1>
	<div class="results">
		<p>
			Name:
			<c:out value="${name}" />
		</p>
		<p>
			Dojo Location:
			<c:out value="${location}" />
		</p>
		<p>
			Favorite Language:
			<c:out value="${language}" />
		</p>
		<p>
			Comment Made:
			<c:out value="${comment}" />
		</p>
		<button>
			<a href="/">Go Back</a>
		</button>
	</div>
</body>
</html>