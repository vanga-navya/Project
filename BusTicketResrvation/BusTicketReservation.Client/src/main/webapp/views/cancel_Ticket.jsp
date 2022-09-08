<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="mp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="b"%>

<mp:Master title="Search Page">

	<jsp:attribute name="head">



<link
			href="${pageContext.request.contextPath}/resources/styles/Book_ticket.css"
			rel="stylesheet">

</jsp:attribute>
	<jsp:attribute name="content">
 
 
	 <div class="form-box">
		            <div class="header-text">
			            Cancel Ticket
		            </div>
		            <form action="cancelT1">
		            <b:out value="${msg}"></b:out>
		            <b:out value="${ref}"></b:out>
		            <table style="padding: 10px;">
		            <tr>
		                 <td>Enter TicketId:</td>
		                 <td><input type="Text" 	name="ticketId"></td>
		            </tr>
		            <tr>
				         <td><button>Cancel</button></td>
				    </tr>
				    </table> 
				    </form>  
		       </div>
		

</jsp:attribute>
</mp:Master>

