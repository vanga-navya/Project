<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="mp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="b"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<mp:login title="Main Page">
	<jsp:attribute name="head">
	<script>
	 	function valid(){
	 		var a = '${msg}';
	 		alert(a);
	 	}
	</script>
<link
			href="${pageContext.request.contextPath}/resources/styles/login.css"
			rel="stylesheet">
</jsp:attribute>
	<jsp:attribute name="content">
	<b:if test="${not empty msg}">
		<script>
			valid();
		</script>
	</b:if>
  <div class="form-box">
		<div class="header-text">
			Login Form
		</div>
		<form:form action="check" method="post" modelAttribute="login">
		<table>
				<tr>
				<b:if test="${empty msg}">
						<td colspan="2" style="color: red;"><b:out value="${msg}"></b:out></td> 
						</b:if>
				</tr>
		<tr>
			<td>Customer Id : </td>
			<td><form:input placeholder="Customer Id" path="customerId" type="text"></form:input> </td>
			<td><form:errors  path="customerId"></form:errors></td>
		</tr>
		<tr>
			<td>Password :</td>
			<td><form:input placeholder="Your Password" path="Password" type="password"></form:input> </td>
			<td><form:errors path="Password"  ></form:errors> </td>
		</tr>
		 <tr>
					<td>
					<input id="terms" type="checkbox"> 
					<label for="terms">
					</label>
					</td>
					<td>
					<span>Agree with <a href="#">Terms & Conditions</a></span>
					</td>
		</tr>
		<tr>
				<td colspan="2">
				 	<button>login</button>
				</td>
	  </tr>
		</table>
	 </form:form>
	</div>

</jsp:attribute>
</mp:login>

