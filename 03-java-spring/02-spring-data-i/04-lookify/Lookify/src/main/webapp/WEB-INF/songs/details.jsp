<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Details</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
	crossorigin="anonymous">
	<style>
		h1 {
			margin: 60px 0px;
		}
		a {
			font-size: 24px;
			margin-left: 900px;
			text-decoration: underline;
		}
	</style>
</head>
<body>
	<div class="container" style="margin-top: 50px">
		<a href="/dashboard"> Dashboard</a>
			<h1>Title: <c:out value="${song.title}"/></h1>
			<h1>Artist: <c:out value="${song.artist}"/></h1>
			<h1>Rating: <c:out value="${song.rating}"/></h1>
	</div>		
</body>
</html>