<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
  <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
  <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ninjas</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">

</head>
<body>
	<div class="container">
		<h1>New Ninja</h1>
		<form:form action="/ninjas/new" method="post" modelAttribute="ninja">
	<div class="form-group">
		<form:label path="dojo">Dojo</form:label>
		<form:errors path="dojo"/>
		<form:select path="dojo">
		<c:forEach items="${dojos}" var="dojo">
			<option value="${dojo.id}">${dojo.name}</option>
		</c:forEach>
		</form:select>
	</div>
		<p>
			<form:label path="firstName"> First Name </form:label>
			<form:errors path="firstName"/>
			<form:input path="firstName"/>
		</p>
		<p>
			<form:label path="lastName"> Last Name </form:label>
			<form:errors path="lastName"/>
			<form:input path="lastName"/>
		</p>
		<p>
			<form:label path="age"> Age </form:label>
			<form:errors path="age"/>
			<form:input path="age"/>
		</p>
		<input id="button" type="submit" value="Submit"/>
		</form:form>
	
	</div>

</body>
</html>