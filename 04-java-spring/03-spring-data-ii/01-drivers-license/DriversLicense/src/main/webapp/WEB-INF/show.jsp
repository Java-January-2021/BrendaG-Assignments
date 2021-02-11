<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>DMV App</title>
</head>
<body>
	<div class="container">
		<h1>Name: <c:out value="${ person.firstName } ${ person.lastName }"/></h1>
		<p>License Number:<c:out value="${ person.license.getNumberAsString() }"></c:out> </p>
		<p>State: <c:out value="${person.license.state }"></c:out></p>
		<fmt:formatDate value="${person.license.expirationDate}" pattern="MM/yyyy" var="newdate" />
		<c:out value="${newdate}" />
 		<p>Expiration Date:<c:out value=" ${ person.license.expirationDate}"></c:out></p>
 	</div>
</body>
</html>