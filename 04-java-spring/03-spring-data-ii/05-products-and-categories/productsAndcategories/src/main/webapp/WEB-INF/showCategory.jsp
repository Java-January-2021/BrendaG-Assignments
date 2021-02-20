<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${category.name}</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">

</head>
<body>
		<div id=wrapper>
		<h1 id="head">${category.name}</h1>
		<div id="prodByCat">
		<table>
		<thead>
			<tr>
				<th><h2 class="subHead">Products</h2></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${products}" var="product">
			<tr>
				<td><a class="link" href="/products/${product.id}">${product.name}</a></td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
	</div>
	<div id="categoryInverseDiv">
	<h2 class="subHead">Add Products:</h2>
		<div id="addCatDiv">
			<form id="inputForm" action="/categories/${category.id}" method="post">
				<div class="formDiv">
				<select class="formInput" name="product">
					<c:forEach items="${notInCategories}" var="product">
						<option value="${product.id}">${product.name}</option>
					</c:forEach>
				</select>
				</div>
				<div class="formDiv">
				<input id="button" type="submit" value="Add"/>
				</div>
			</form>
			<h4><a class="link" href="/products/new">Create new product</h4>
		</div>
	</div>
	</div>
</body>
</html>