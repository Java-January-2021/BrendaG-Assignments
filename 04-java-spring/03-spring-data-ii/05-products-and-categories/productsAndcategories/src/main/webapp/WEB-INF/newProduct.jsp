<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
  <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Product</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>
<body>
<div class="container">
		<h1>New Product</h1>
		<form:form action="/products/new" method="post" modelAttribute="product">

		<p>
			<form:label path="name"> Name </form:label>
			<form:errors path="name"/>
			<form:input path="name"/>
		</p>
		<p>
			<form:label path="description"> Description </form:label>
			<form:errors path="description"/>
			<form:input path="description"/>
		</p>
		<p>
			<form:label path="price"> price </form:label>
			<form:errors path="price"/>
			<form:input path="price"/>
		</p>
		<input id="button" type="submit" value="Submit"/>
		</form:form>
	
	</div>
</body>
</html>