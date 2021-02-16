<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">

<html>
<head>
<meta charset="UTF-8">
<title>${dojo.name}</title>
</head>
<body>
	<div class="container">
		<h1>${dojo.name} Location Ninjas</h1>
		<c:forEach items="${dojo.ninjas}" var="ninja">
		
	<table class="table">
		  <tr>
		    <th>First Name</th>
		    <th>Last Name</th>
		    <th>Age</th>
		  </tr>
		  <tr>
		    <td>${ninja.firstName}</td>
		    <td>${ninja.lastName }</td>
		    <td>${ninja.age }</td>
		  </tr>
		  </table>
		</c:forEach>
	
	
	</div>

</body>
</html>