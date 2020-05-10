<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<style>
.item {
	color: green;
	text-align: center;
}
</style>
<meta charset="ISO-8859-1">
<title>MenuItem List Customer</title>
</head>
<body>

	<h3>Menu Items</h3>

	<c:if test="${addCartStatus}">

		<h3 class="item">Item added to Cart Successfully</h3>

	</c:if>

	<table>

		<thead>

			<tr>
				<th>Name</th>
				<th>Price</th>
				<th>Category</th>
				<th>Free Delivery</th>
				<th>Action</th>
			</tr>
		</thead>

		<tbody>

			<c:forEach items="${list_customer}" var="menuItem">

				<tr>

					<td>${menuItem.title}</td>
					<td>${menuItem.price}</td>
					<td>${menuItem.category}</td>
					<td>${menuItem.freeDelivery}</td>
					<td><a href="/add-to-cart?menuItemId=${menuItem.menuItemId}">Add
							to Cart</a></td>


				</tr>


			</c:forEach>

		</tbody>


	</table>
</body>
</html>