<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<title>Cart Items</title>
</head>
<body>
	<h1>Cart</h1>
	<a href="/show-menu-list-customer">Menu</a>
	<a href="/show-cart?userId=1">Cart</a>
	<c:if test="${removeCartItemStatus}">

		<h3 class="item">Item removed from Cart successfully</h3>

	</c:if>
	<table>

		<thead>
			<tr>

				<th>Name</th>
				<th>Free Delivery</th>
				<th>Price</th>


			</tr>

		</thead>

		<tbody>
			<c:forEach items="${cartItemList.menuItemList}" var="menu">

				<tr>

					<td>${menu.title}</td>
					<td>${menu.freeDelivery}</td>
					<td>${menu.price}</td>
					<td><a
						href="/remove-cart?menuItemId=${menu.menuItemId}&&userId=1">Delete</a></td>

				</tr>


			</c:forEach>

			<tr>
				<td></td>
				<td><b>Total</b></td>
				<td>Rs.${cartItemList.price}</td>
				<td></td>

			</tr>



		</tbody>

	</table>

</body>
</html>