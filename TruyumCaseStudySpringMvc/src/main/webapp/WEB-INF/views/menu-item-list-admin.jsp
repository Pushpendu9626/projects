<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MenuItem List Admin</title>
</head>
<body>

	<h3>Menu Items</h3>

	<table>

		<thead>

			<tr>
				<th>Name</th>
				<th>Price</th>
				<th>Active</th>
				<th>Date Of Launch</th>
				<th>Category</th>
				<th>Free Delivery</th>
				<th>Action</th>
			</tr>
		</thead>

		<tbody>

			<c:forEach items="${list}" var="menuItem">

				<tr>

					<td>${menuItem.title}</td>
					<td>${menuItem.price}</td>
					<td>${menuItem.active}</td>
					<td><fmt:formatDate value="${menuItem.dateOfLaunch}"
							pattern="dd/MM/yyyy" /></td>
					<td>${menuItem.category}</td>
					<td>${menuItem.freeDelivery}</td>
					<td><a
						href="show-edit-menu-item?menuItemId=${menuItem.menuItemId}">Edit</a></td>


				</tr>


			</c:forEach>

		</tbody>


	</table>
</body>
</html>