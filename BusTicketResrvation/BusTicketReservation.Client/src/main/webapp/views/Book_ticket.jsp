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
			             Ticket Booking
		            </div>
		            <b:out value="${amount}"></b:out>
		            <form action="BookT1">
		            <%-- <b:out value="${msg}"></b:out> --%>
		            <table style="padding: 10px;">
		            <tr>
		                 <td>Customer Id:</td>
		                 <td><input type="text" name="sid"
							value="${sessionScope.customerId}">
						</td>
		            </tr>
		        <tr>
		                 <td>No. of Seats Booked:</td>
		                 <td><input name="noOfSeatsBooked" type="text"
							value="${c}"></td>
		            </tr>
		              <tr>
		                 <td>Bus Id:</td>
		                 <td><select name="bid">
					 <option value="-1">Select</option>
						<b:forEach var="i" items="${E}">
							<option value="${i.getBusId()}">${i.getBusId()}</option>
						</b:forEach>
				</select></td>
		            </tr>
		            <tr>
		                 <td>Date of Travelling:</td>
		                 <td><input placeholder="" type="date"
							name="dateOfBooking" required="required"></td>
		            </tr>
		               
		            <tr>
				         <td colspan="2"><button>Book Tickets</button></td>
				    </tr>
				    </table> 
				    </form>  
		       </div>
		

</jsp:attribute>
</mp:Master>

