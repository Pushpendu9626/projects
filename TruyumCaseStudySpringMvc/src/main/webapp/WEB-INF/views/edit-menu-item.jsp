<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
.error {
	color: red;
}
</style>
<meta charset="ISO-8859-1">
<title>Edit Menu Item Form</title>
</head>
<body>
	<h3>Edit Menu Item</h3>
	<br>
	<br>

	<table>

		<form:form action="/edit-menu-item" modelAttribute="menuItem"
			method="post">
			<tr>
				<td><form:hidden path="menuItemId"
						value="${menuItem.menuItemId}" /></td>

			</tr>

			<tr>
				<td>Name</td>
			</tr>

			<tr>
				<td><form:input path="title" /></td>
				<form:errors path="title" cssClass="error" />

			</tr>
			<tr>
				<td>Price(Rs.)</td>
				<td>Active</td>
				<td>DateOfLaunch</td>
				<td>Category</td>
			</tr>
			<tr>

				<td><form:input path="price" /> <form:errors path="price"
						cssClass="error" /></td>
				<td><form:radiobutton path="active" value="Yes" />Yes <form:radiobutton
						path="active" value="No" />No</td>
				<td><form:input path="dateOfLaunch" /> <form:errors
						path="dateOfLaunch" cssClass="error" /></td>
				<td><form:select path="category">

						<form:option value="${menuItem.category}">${menuItem.category}</form:option>
						<form:option value="Starter">Starter</form:option>
						<form:option value="MainCourse">MainCourse</form:option>
						<form:option value="Dessert">Dessert</form:option>
						<form:option value="Drinks">Drinks</form:option>

					</form:select></td>

			</tr>

			<tr>

				<td><form:checkbox path="freeDelivery" value="yes" />free
					Delivery</td>

			</tr>
			<tr>
				<td><input type="submit" value="Save"></td>
			</tr>
		</form:form>
	</table>



</body>
</html>