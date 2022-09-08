<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="mp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="b"%>

<mp:login title="Main Page">
	<jsp:attribute name="head">
<link
			href="${pageContext.request.contextPath}/resources/styles/signup1.css"
			rel="stylesheet">
</jsp:attribute>
	<jsp:attribute name="content">
  <div class="form-box">
		     <div class="header-text"> Registration Form</div>
<form:form action="inserted" modelAttribute="C">
		<table> 
				<tr>
						<td colspan="2" style="color: red; font-size: 20px;"><b:out
								value="${msg}"></b:out></td> </tr>
				<tr>
					        <td>Name :</td>
					       <td><form:input type="text" path="customerName" /></td>
							<td style="color: red;"><form:errors path="customerName"></form:errors></td>
			</tr>
    		<tr>
			        <td>Gender :</td>
			        <td><select name="gender" id="">
			            <option value="-1">SELECT</option>
			            <option value="Female">FEMALE</option>
			            <option value="Male">MALE</option>
			            <option value="Transgender">TRANSGENDER</option>
			            <option value="NOTA">NOT TO SPECIFY</option>
			        </select></td>
           </tr>
    		<tr>
		        <td>Dob :</td>
		        <td><input type="date" name="dob" pattern="Enter Date"></td>
  		  </tr>
	    <tr>
	        <td>Gmail :</td>
	        <td><input type="email" name="email" required="required"></td>
	    </tr>
	    <tr>
	        <td>Contact Number :</td>
	        <td><input type="text" name="contactNo"
							required="required"></td>
	    </tr>
	    <tr>
	        <td>Country :</td>
	        <td><input type="text" name="country" required="required"></td>
	    </tr>
	    <tr>
	        <td>State :</td>
	        <td><input type="text" name="state" required="required"></td>
	    </tr>
    <tr>
        <td>City :</td>
        <td><input type="text" name="city" required="required"></td>
    </tr>
    <tr>
        <td>Pincode :</td>
        <td><input type="text" name="pinCode" required="required"></td>
    </tr>
    <tr>
        <td>Address :</td>
        <td><input type="text" name="Address" required="required"></td>
    </tr>
    <tr>
        <td>Customer Type :</td>
        <td><select name="customerType" id="type">
            <option value="-1">Select</option>
            <option value="VIP">Govt Employee</option>
            <option value="Normal">Student</option>
            <option value="Normal">Others</option>
        </select></td>
    </tr>
    <tr>
        <td>Password :</td>
        <td><input type="password" name="Password"
							required="required"></td>
    </tr>
    <tr>
		<td colspan="2">
	 		<form:button>Register</form:button>
		</td>
	</tr>
		 </table>
		
	</form:form>
	</div>

</jsp:attribute>
</mp:login>

