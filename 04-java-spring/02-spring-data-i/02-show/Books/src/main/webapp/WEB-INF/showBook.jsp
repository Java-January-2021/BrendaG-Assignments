<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show book</title>
</head>
<body>
<table>
    <thead>
        <tr>
            <th>Title</th>
            <th>Description</th>
            <th>Language</th>
            <th>Number of Pages</th>
        </tr>
    </thead>
    <tbody>
		<tr>    
    		<td><c:out value="${book.title}"/></td>
    		<td><c:out value="${book.description}"/></td>
    		<td><c:out value="${book.language}"/></td>
    		<td><c:out value="${book.numberOfPages}"/></td>
		</tr>
    </tbody>
</table>
</body>
</html>