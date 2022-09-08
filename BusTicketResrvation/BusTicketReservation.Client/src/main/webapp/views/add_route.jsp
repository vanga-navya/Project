<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib tagdir="/WEB-INF/tags" prefix="mp" %>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="b" %>
     
<mp:admin title="Main Page">

<jsp:attribute name="head">


<link href="${pageContext.request.contextPath}/resources/styles/add_route.css" rel="stylesheet">


</jsp:attribute>

 <jsp:attribute name="content">
 
 <div class="form-box">
		<div class="header-text">
			Add Route Form
		</div>
		<form action="insertedintoRoute">
		            <b:out value=" ${msg}"></b:out>
		            <table>
		            
		            <tr>
		                 <td>Route-From:</td>
		                 <td><input placeholder="" type="text" name="r_from"></td>
		            </tr>
		            <tr>
		                 <td>Route-To:</td>
		                 <td><input placeholder="" type="text" name="r_to"></td>
		            </tr>
		            <tr>
		                 <td>Distance-Cost:</td>
		                 <td><input placeholder="" type="number" name="dist_cost"></td>
		            </tr>
		            <tr><td>
		            <td colspan="2">
		           <button  formaction="insertedintoRoute">Add Route</button></td></tr>
		             </table>
		           
		            
		            
		            
		            
		            
		             </form>
		       </div>

</jsp:attribute>
</mp:admin>

