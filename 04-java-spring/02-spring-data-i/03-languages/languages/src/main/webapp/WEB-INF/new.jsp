<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Language</title>
</head>
<body>
	<div class="container">
		<h1>New Language</h1>
		<form:form action="/" method="post" modelAttribute="language">
		    <div class="form-group">
		        <form:label path="name">Language Name</form:label>
		        <form:errors path="name"/>
		        <form:input class="form-control" path="name"/>
		    </div>
		    <div class="form-group">
		        <form:label path="creator">Creator</form:label>
		        <form:errors path="creator"/>
		        <form:input class="form-control" path="creator"/>
		    </div>
			<div class="form-group">
		        <form:label path="currentVersion">Current Version</form:label>
		        <form:errors path="currentVersion"/>
		        <form:input class="form-control" path="currentVersion"/>
		    </div>
		    <input type="submit" value="Submit"/>
		</form:form>
				<a href="/">Go back</a>
		
	</div>

</body>
</html>