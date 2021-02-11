<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>DMV App</title>
</head>
<body>
	<div class="container">
		<nav>
			<h2><a href="/new">Add Person</a> | <a href="/licenses/new">Add License</a></h2>
		</nav>
		<table class="table table-hover">
			<thead>
				<tr>
					<th>Name</th>
					<th>License #</th>	
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${ persons }" var="person">
				<tr>
					<td><a href="/${person.id}">${ person.firstName }</a> ${ person.lastName }</td>
					<td>${ person.license.getNumberAsString() }</td>
				</tr>
			</c:forEach>
			</tbody>
		</table>	
	</div>
</body>
</html>