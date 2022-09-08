<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="mp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="b"%>

<mp:admin title="Main Page">

	<jsp:attribute name="head">


<link
			href="${pageContext.request.contextPath}/resources/styles/add_bus.css"
			rel="stylesheet">


</jsp:attribute>

	<jsp:attribute name="content">
 
 <div class="form-box">
		<div class="header-text">
			Add Bus
		</div>
		<form action="">
		<b:out value="${msg}"></b:out>
		            <table>
		            <tr>
		                 <td>Bus Name:</td>
		                 <td><input placeholder="" type="text"
							name="busName"></td>
		            </tr>
		            <tr>
		                 <td>Bus No:</td>
		                 <td><input placeholder="" type="text"
							name="busNo"></td>
		            </tr>
		             <tr>
		                 <td>Total Seats:</td>
		                 <td><input placeholder="" type="text"
							name="totalSeats"></td>
		            </tr>
		            <tr>
		                 <td>Bus Type:</td>
		                 <td><input placeholder="" type="text"
							name="busType"></td>
		            </tr>
		            <tr>
		                 <td>R_Id:</td>
		                 <td> <select name="rid">
								 <option value="-1">Select</option>
									<b:forEach var="ii" items="${E}">
										<option value="${ii.getR_Id()}">${ii.getR_Id()}</option>
									</b:forEach>
							</select></td>
		            </tr>
		            <tr>
		                 <td>S_Id:</td>
		                 <td> <select name="sid">
								 <option value="-1">Select</option>
									<b:forEach var="i" items="${E1}">
										<option value="${i.getScheduleId()}">${i.getScheduleId()}</option>
									</b:forEach>
							</select></td>
		            </tr>
		            <tr>
		                 <td colspan="2">
		                     <button formaction="insertedintoBus">Add</button>
						</td>
		            </tr>
		            
		             </table>   
		             </form>
		       </div>

</jsp:attribute>
</mp:admin>

