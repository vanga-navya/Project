<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="a"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="mp"%>
<mp:Master title="Main Page">
	<jsp:attribute name="head">
	<link
			href="${pageContext.request.contextPath}/resources/styles/Eprofile.css"
			rel="stylesheet">
	</jsp:attribute>
	<jsp:attribute name="content">
 <div class="form-box">
		     <div class="header-text"> Update Profile</div>
<form action="EE" method="post">
	<a:out value="${msg}"></a:out>
		<table style="margin-left: 50px;">
				<tr> 
					<td>Customer Name:</td>
						<td><input type="text" name="customerName"
							value="${Customer. getCustomerName()}"></td>
					</tr>
					<tr>
					<td> Gender:</td>
						<td><input type="text" name="gender"
							value="${Customer.  getGender()}"></td>
					</tr>
					<tr>
					<td> DateOfBirth:</td>
						<td><input type="text" name="dob"
							value="${Customer. getDob()}"></td>
					</tr>
					<tr>
					<td> email:</td>
						<td><input type="text" name="email"
							value="${Customer. getEmail()}"></td>
					</tr>
					<tr>
					<td> contactNo:</td>
						<td><input type="text" name="contactNo"
							value="${Customer. getContactNo()}"></td>
					</tr>
					<tr>
					<td> country:</td>
						<td><input type="text" name="country"
							value="${Customer. getCountry()}"></td>
					</tr>
					<tr>
					<td> state:</td>
						<td><input type="text" name="state"
							value="${Customer. getState()}"></td>
					</tr>
					<tr>
					<td> city:</td>
						<td><input type="text" name="city"
							value="${Customer. getCity()}"></td>
					</tr>
					<tr>
					<td> pinCode:</td>
						<td><input type="text" name="pinCode"
							value="${Customer. getPinCode()}"></td>
					</tr>
					<tr>
					<td> Address:</td>
						<td><input type="text" name="Address"
							value="${Customer. getAddress()}"></td>
					</tr>
					
					<tr>
					<td>customerType:</td>
						<td><input type="text" name="customerType"
							value="${Customer. getCustomerType()}"></td>
					</tr>
					<tr>
					
					<tr>
					<td>Your Password:</td>
						<td><input type="password" name="Password"
							value="${Customer. getPassword()}"></td>
					</tr>
					<tr>
					
						<td colspan="2"><input type="submit"></td>
					</tr>
		</table>
	</form>
</div>
	</jsp:attribute>
</mp:Master>