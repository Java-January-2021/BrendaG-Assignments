<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/index.css">

</head>
<body>
<div>
	<p><c:out value="${errors}"></c:out></p>
	<h1>What is the code?</h1>
	<form method="post" action="/code">
	<input type="text" name="code">
	<button>Try Code</button>
	</form>
</div>
</body>
</html>