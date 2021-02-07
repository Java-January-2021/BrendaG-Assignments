<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Languages App</title>
</head>
<body>
	<div class="container">
		<h1>Details for Language #${ language.id }</h1>
		<hr />
		<h1><c:out value="${language.name}"/></h1>
		<p>Creator: <c:out value="${language.creator}"/></p>
		<p>Current Version: <c:out value="${language.currentVersion}"/></p>
		<a class="btn btn-primary" href="/${language.id}/edit">Edit Language</a>
		<a id="nameLink" href="/${language.id}/delete">Delete</a>
		<a href="/">Go Back</a>
		
	</div>
</body>
</html>