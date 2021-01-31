<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dojo Survey Index</title>
<link rel="stylesheet" type="text/css" href="css/index.css">

</head>
<body>
	<div id="form">
		<form method="POST" action="/result">
		<div>
			<label>Your Name:</label>
			<input type="text" id="name" name="name">
		</div>
		<div>
			<label>Dojo Location:</label>
			<select name="location" id="location">
				<option value="San Jose">San Jose</option>
				<option value="New York">New York</option>
				<option value="New Jersey">New Jersey</option>
				<option value="Arizona">Arizona</option>
			</select>
		</div>
		<div>
			<label for="language" >Favorite Language:</label>
			<select id="language" name="language">
			  <option value="Python">Python</option>
			  <option value="Java">Java</option>
			  <option value="MERN">MERN</option>
			  <option value="APEX">APEX</option>
			</select>
		</div>
		<div>
			<label id="comment">Comment (optional):</label>
			<textarea rows="10" cols="30" name="comment" id="comment"></textarea>
	  	</div>
	  		 <input id="button" type="submit" value="Submit">
		</form>
	</div>
</body>
</html>