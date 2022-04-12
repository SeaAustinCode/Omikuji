<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Omikuji</title>
</head>
<body>
	<h1>Here's your Omikuji!</h1>
	<h2>In <c:out value="${number}"/> years, you will <br>
	live in <c:out value="${city}"/> with <c:out value="${realPerson}"/><br>
	as your roommate, <c:out value="${hobby}"/><br>
	for a living. The next time<br>
	you see a, <c:out value="${livingThing}"/> you will<br>
	have good luck. Also, <br>
	<c:out value="${somethingNice}"/>.</h2>
	<a href="http://localhost:8080/omikujiform">Go Back</a>
</body>
</html>