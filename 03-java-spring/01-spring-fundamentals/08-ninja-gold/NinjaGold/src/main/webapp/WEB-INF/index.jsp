<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ninja Gold</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
	<p>
		Your Gold: <span class="goldAmount"><c:out value="${totalGold}"/></span>
	</p>
	<div class="building">
		<form method="POST" action="/Gold">
			<input type="hidden" value="farm" name="building">
			<h4>Farm</h4>
			<p>earns 10-20 gold</p>
			<button>Find Gold</button>
		</form>
	</div>
	<div class="building">
		<form method="POST" action="/Gold">
			<input type="hidden" value="cave" name="building">
			<h4>Cave</h4>
			<p>earns 5-10 gold</p>
			<button>Find Gold</button>
		</form>
	</div>
	<div class="building">
		<form method="POST" action="/Gold">
			<input type="hidden" value="house" name="building">
			<h4>House</h4>
			<p>earns 2-5 gold</p>
			<button>Find Gold</button>
		</form>
	</div>
	<div class="building">
		<form method="POST" action="/Gold">
			<input type="hidden" value="casino" name="building">
			<h4>Casino</h4>
			<p>earns/takes 0-50 gold</p>
			<button>Find Gold</button>
		</form>
	</div>




	<h2>Activities:</h2>
	<div class="activityLog">
		<c:forEach items="${activities}" var="activity">
			<p class='${activity.contains("lost") ? "red" : "green"} '>${activity}</p>
		</c:forEach>
	</div>
</body>
</html>