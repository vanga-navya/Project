<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="mp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="b"%>

<mp:Master title="Main Page">
	<jsp:attribute name="head">
<link
			href="${pageContext.request.contextPath}/resources/styles/profile.css"
			rel="stylesheet">
</jsp:attribute>
	<jsp:attribute name="content">
  <div class="form-box">
		     <div class="header-text"> Profile</div>
	<form:form action="PV" modelAttribute="C">
						<table style="margin-left: 60px;"> 
				<tr>
						<td colspan="2" style="color: red; font-size: 20px;"></td> </tr>
						<tr>
					        <td>Customer Id :</td>
						<td><b:out value="${C.customerId}"></b:out> </td>
			</tr>
				<tr>
				
					        <td>Name :</td>
						<td><b:out value="${C.customerName}"></b:out></td>
							
			</tr>
			
    		<tr>
			        <td>Gender :</td>
						<td><b:out value="${C.gender}"></b:out></td>
			        
           </tr>
           
    		<tr>
		        <td>Dob :</td>
						<td><b:out value="${C.dob}"></b:out></td>
		       
  		  </tr>
  		  
	    <tr>
	        <td>Gmail :</td>
						<td><b:out value="${C.email}"></b:out></td>
	        
	    </tr>
	    
	    <tr>
	        <td>Contact Number :</td>
						<td><b:out value="${C.contactNo}"></b:out></td>
	        
	    </tr>
	    
	    <tr>
	        <td>Country :</td>
						<td><b:out value="${C.country}"></b:out></td>
	      
	    </tr>
	    
	    <tr>
	        <td>State :</td>
						<td><b:out value="${C.state}"></b:out></td>
	      
	    </tr>
	    
    <tr>
        <td>City :</td>
						<td><b:out value="${C.city }"></b:out></td>
    </tr>
    <tr>
        <td>Pincode :</td>
						<td><b:out value="${C.pinCode}"></b:out></td>
       
    </tr>
    <tr>
        <td>Address :</td>
						<td><b:out value="${C.getAddress()}"></b:out></td>
       
    </tr>
    <tr> 
        <td>Customer Type :</td>
						<td><b:out value="${C.customerType}"></b:out></td>
      
					<tr>
		<td colspan="2">
			 <form:button >Edit</form:button>
			 
		</td>
	</tr>
		 </table>
		
	</form:form>
	</div>

</jsp:attribute>
</mp:Master>

