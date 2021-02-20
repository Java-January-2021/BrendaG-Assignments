<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${product.name }</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">

</head>
<body>
	<div id=wrapper>
		<h1 id="head">${product.name}</h1>
		<div id="CatByprod">
		<table>
		<thead>
			<tr>
				<th><h2 class="subHead">Categories</h2></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${category}" var="category">
			<tr>
				<td><a class="link" href="/categories/${category.id}">${category.name}</a></td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
	</div>
	<div id="productInverseDiv">
	<h2 class="subHead">Add Category:</h2>
		<div id="addCatDiv">
			<form id="inputForm" action="/products/${product.id}" method="post">
				<div class="formDiv">
				<select class="formInput" name="category">
					<c:forEach items="${notInProducts}" var="category">
						<option value="${category.id}">${category.name}</option>
					</c:forEach>
				</select>
				</div>
				<div class="formDiv">
				<input id="button" type="submit" value="Add"/>
				</div>
			</form>
		</div>
	</div>
	</div>
</body>
</html>