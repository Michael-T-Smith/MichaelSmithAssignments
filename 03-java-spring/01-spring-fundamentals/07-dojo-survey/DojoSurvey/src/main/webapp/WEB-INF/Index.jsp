<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojo Survey</title>
<link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body>

	<div class="userInfo">
		<form method="POST" action="/result">
			<label>Your Name: <input type="text" name="name"></label><br>
			<label>Dojo Location: <select name="location">
					<option value="Burbank">Burbank</option>
					<option value="San Jose">San Jose</option>
					<option value="Chicago">Chicago</option>
			</select>
			</label><br> <label for="language">Favorite Language: <select
				name="language">
					<option value="Java">Java</option>
					<option value="Python">Python</option>
					<option value="Javascript">JavaScript</option>
			</select>
			</label><br> <label>Comment <input type="text" name="comment"></label><br>
			<button type="submit">Button for submitting</button>
		</form>
	</div>
</body>
</html>