<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="mp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="b"%>

<mp:admin title="Main Page">

	<jsp:attribute name="head">


<link
			href="${pageContext.request.contextPath}/resources/styles/add_route.css"
			rel="stylesheet">


</jsp:attribute>

	<jsp:attribute name="content">
 
 <div class="form-box">
		<div class="header-text">
			Add Schedule Form
		</div>
		<b:out value="${msg}"></b:out>
		<form action="insertedintoSchedule">
		            
		            <table>
		          
		            <tr>
		                 <td>Schedule-Date:</td>
		                 <td><input type="date" name="s_date"></td>
		            </tr>
		              <tr>
		                 <td>Time:</td>
		                 <td><input type="text" name="Time"></td>
		            </tr>
		            <tr>
		                 <td colspan="2">
		                   <button>Add Schedule</button>
						</td>
		 
		            </tr>
		            </table>
		             </form>
		       </div>

</jsp:attribute>
</mp:admin>

