<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="a"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="mp"%>
<mp:admin title="Main Page">
	<jsp:attribute name="head">
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">

	</jsp:attribute>
	<jsp:attribute name="content">
<body>
<div style="padding:30px;">
	<table border="2" style="color:white ">
		<tr style="color:#00ffff; letter-spacing:1px;">
			<th>CustomerId</th>
			<th>CustomerName</th>
			<th>Gender</th>
			<th>Dob</th>
			<th>ContactNo</th>
			<th>Country</th>
			<th>State</th>
			<th>City</th>
			<th>PinCode</th>
			<th>Address</th>
			<th>CustomerType</th>
			<th>Email</th>
			<th>Password</th>
			<th>ConfirmPassword</th>
		</tr>
		<a:forEach var="i" items="${Customers}">
			<tr>
				<td><a:out value="${i.customerId}"></a:out></td>
				<td><a:out value="${i.customerName}"></a:out></td>
				<td><a:out value="${i.gender}"></a:out></td>
				<td><a:out value="${i.dob}"></a:out></td>
				<td><a:out value="${i.contactNo}"></a:out></td>
				<td><a:out value="${i.country}"></a:out></td>
				<td><a:out value="${i.state}"></a:out></td>
				<td><a:out value="${i.city}"></a:out></td>
				<td><a:out value="${i.pinCode}"></a:out></td>
				<td><a:out value="${i.getAddress()}"></a:out></td>
				<td><a:out value="${i.customerType}"></a:out></td>
				<td><a:out value="${i.email}"></a:out></td>
				<td><a:out value="${i.getPassword()}"></a:out></td>
				<td><a:out value="${i.confirmPassword}"></a:out></td>
			</tr>
		</a:forEach>
	</table>
	</div>
</body>
</html>
</jsp:attribute>
</mp:admin>