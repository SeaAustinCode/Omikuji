<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Omikuji form</title>
</head>
<body>
	<h1>Send an Omikuji!!</h1>
	<form action= '/processForm' method = 'POST'>
		<label for="number">Pick any number from 5-25.</label>
			<input name="number" type="number" id="number" min="5" max="25" />
		<label for="city">Enter the name of any city.</label>
			<input type="text" name="city">
		<label for="realPerson">Enter the name of any real person</label>
			<input type="text" name="realPerson">
		<label for="hobby">Enter professional endeavor or hobby.</label>
			<input type="text" name="hobby">
		<label for="livingThing">Enter any type of living thing.</label>
			<input type="text" name="livingThing">
		<label for="somethingNice">Say something nice to someone:</label>
		<textarea name="somethingNice" rows="5" cols="15"></textarea>
		<p>Send and show a friend</p>
		<button>Send</button>
	</form>
</body>
</html>