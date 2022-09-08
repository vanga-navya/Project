<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="mp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="b"%>

<mp:Master title="Main Page">
	<jsp:attribute name="head">
<link
			href="${pageContext.request.contextPath}/resources/styles/bus_details.css"
			rel="stylesheet">


</jsp:attribute>

	<jsp:attribute name="content">
 
 <div class="form-box">
		<div class="header-text">
		 Ticket History
		</div>
		<div style="margin-left: 200px;">
		<form action="">
<table border="2" class="table table-striped ">
<b:if test="${empty E}">
	<h2 style="padding-left: 30%;"><b:out value="${'No Details Found' }"></b:out></h2>
</b:if>
<b:if test="${not empty E}">
<thead>
          <tr>
			 <th scope="col"></th>    
			<th scope="col">TicketId</th>
			 <th scope="col">CutomerName</th>
			<th scope="col">busId</th>
			<th scope="col">NoOfSeatsBooked</th>
			<th scope="col">dateOfBooking</th>
			<th scope="col">amount</th>
			<th scope="col">Status</th>
</tr>
</thead>
</b:if>

  <tbody>
        <b:forEach var="i" items="${E}">
                <tr>
                    <th scope="row"></th>
                    <td><b:out value="${i.ticketId}"></b:out></td>
                    <td><b:out value="${i.getCustomerId().getCustomerName()}"></b:out></td>
             		<td><b:out value="${i.getBusId().getBusId()}"></b:out></td>
                    <td><b:out value="${i.noOfSeatsBooked}"></b:out></td>
                    <td><b:out value="${i.dateOfBooking}"></b:out></td>
                    <td><b:out value="${i.amount}"></b:out></td>
                    <td><b:out value="${i.status}"></b:out></td>
                </tr>
            </b:forEach>
       </tbody>
    </table>
</form>
</div>
		       </div>

</jsp:attribute>
</mp:Master>

