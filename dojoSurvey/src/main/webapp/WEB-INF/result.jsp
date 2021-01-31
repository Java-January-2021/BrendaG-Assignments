<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dojo Survey Index</title>
<link rel="stylesheet" type="text/css" href="css/result.css">

</head>
<body>
<table style="width:100%">
  <tr>
    <th>Submitted Info</th>
  </tr>
   <tr>
    <td>Name: </td>
    <td><c:out value="${name}"></c:out></td>
  </tr>
  <tr>
    <td>Dojo Location:</td>
    <td><c:out value="${location}"></c:out></td>
  </tr>
  <tr>
    <td>Favorite Language: </td>
    <td><c:out value="${language}"></c:out></td>
   </tr>
   <tr>
    <td>Comment: </td>
    <td><c:out value="${comment}"></c:out></td>
  </tr><br>
</table>
 	<a href="/" id="survey">Go Back</a>
</body>
</html>