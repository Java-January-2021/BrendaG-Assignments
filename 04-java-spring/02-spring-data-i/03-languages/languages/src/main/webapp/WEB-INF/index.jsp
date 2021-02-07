<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Languages App</title>
<link rel="stylesheet" href="/css/index.css">

</head>
<body>
	<div class="container">
		<h1 id ="welcome">Welcome to Languages!</h1>
		<a id="new" href="/new">Add a language</a>
		<table class="table">
			<thead>
				<tr>
					<th>Name</th>
					<th>Creator</th>
					<th>Version</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${ languages }" var="lang">
				<tr>
					<td><a id="showLanguage" href="/${ lang.id }/show">${ lang.name }</a></td>
					<td>${ lang.creator }</td>
					<td>${ lang.currentVersion }</td>
					<td>
						<a id="edit" href="/${lang.id }/edit">Edit</a>
						<a id="delete" href="/${lang.id}/delete">Delete</a>
					</td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
	</div>
	
</body>
</html>